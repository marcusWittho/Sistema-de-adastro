package org.wittho.service;

import org.wittho.entity.EventoEntity;
import org.wittho.model.EventoModel;
import org.wittho.repository.EventoRepository;

import java.util.List;

public class EventoService {

  private final EventoRepository eventoRepository;

  public EventoService(EventoRepository eventoRepository) {
    this.eventoRepository = eventoRepository;
  }

  public String salvarEvento(EventoModel eventoModel) {
    return eventoRepository.salvarEvento(new EventoEntity(eventoModel));
  }

  public List<EventoModel> buscarEventos() {
    return new EventoModel().listaEventoModel(eventoRepository.buscarEventos());
  }

  public List<EventoEntity> removerEvento(Integer id) {
    return eventoRepository.removerEvento(id);
  }

  public List<EventoModel> listarEventosFuturos() {
    List<EventoEntity> eventos = eventoRepository.listarEventosFuturos();

    EventoModel evento = new EventoModel();
    return evento.listaEventoModel(eventos);
  }
}
