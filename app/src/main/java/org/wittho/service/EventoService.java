package org.wittho.service;

import org.springframework.stereotype.Service;
import org.wittho.entity.EventoEntity;
import org.wittho.mapper.ServiceMapper;
import org.wittho.mapper.ServiceMapperImpl;
import org.wittho.model.EventoModel;
import org.wittho.repository.EventoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

  private final EventoRepository repository;

  public EventoService(EventoRepository repository) {
    this.repository = repository;
  }

  public EventoModel insertEvento(EventoModel eventoModel) {
    ServiceMapper mapper = new ServiceMapperImpl();

    return mapper.toEventoModel(repository.save(mapper.toEventoEntity(eventoModel)));
  }

  public Optional<EventoEntity> findById(Integer id) {
    return repository.findById(id);
  }

  public EventoModel updateEvento(Integer id, EventoEntity eventoEntity) {
    ServiceMapper mapper = new ServiceMapperImpl();

    Optional<EventoEntity> eventoById = this.findById(id);

    if (!eventoById.isPresent()) {
      throw new RuntimeException("Evento não encontrado.");
    }

    eventoById.get().setEventname(eventoEntity.getEventname());
    eventoById.get().setAddress(eventoEntity.getAddress());
    eventoById.get().setCategory(eventoEntity.getCategory());
    eventoById.get().setEventDate(eventoEntity.getEventDate());
    eventoById.get().setDescription(eventoEntity.getDescription());

    return mapper.toEventoModel(repository.save(eventoById.get()));
  }

  public List<EventoModel> findAll() {
    ServiceMapper mapper = new ServiceMapperImpl();

    return mapper.toListEventoModel(repository.findAll());
  }

  public void deleteById(Integer idEvento) {
    repository.deleteById(idEvento);
  }
}
