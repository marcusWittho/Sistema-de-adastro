package org.wittho.controller;

import org.wittho.entity.EventoEntity;
import org.wittho.model.EventoModel;
import org.wittho.service.EventoService;

import java.util.List;

public class EventoController {

  private final EventoService eventoService;

  public EventoController(EventoService eventoService) {
    this.eventoService = eventoService;
  }

  public String salvarEvento(EventoModel eventoModel) {
    return eventoService.salvarEvento(eventoModel);
  }

  public List<EventoModel> buscarEvento() {
    return eventoService.buscarEventos();
  }

  public List<EventoEntity> removerEvento(Integer id) {
    return eventoService.removerEvento(id);
  }

  public List<EventoModel> listarEventosFuturos() {
    return eventoService.listarEventosFuturos();
  }
}
