package org.wittho.service;

import org.wittho.entity.EventoEntity;
import org.wittho.model.EventoModel;
import org.wittho.repository.EventoRepository;

public class EventoService {

  private final EventoRepository eventoRepository;

  public EventoService(EventoRepository eventoRepository) {
    this.eventoRepository = eventoRepository;
  }

  public EventoModel salvarEvento(EventoModel eventoModel) {
    EventoEntity eventoEntity = new EventoEntity(eventoModel);

    EventoEntity eventoSalvo = eventoRepository.salvarEvento(eventoEntity);

    return new EventoModel(eventoSalvo);
  }

  public EventoModel buscarEventos() {
    EventoEntity eventoEntity = eventoRepository.buscarEventos();

    return new EventoModel(eventoEntity);
  }
}
