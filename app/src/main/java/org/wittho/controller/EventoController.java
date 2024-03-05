package org.wittho.controller;

import org.wittho.model.EventoModel;
import org.wittho.service.EventoService;

public class EventoController {

  private final EventoService eventoService;

  public EventoController(EventoService eventoService) {
    this.eventoService = eventoService;
  }

  public EventoModel salvarEvento(EventoModel eventoModel) {
    return eventoService.salvarEvento(eventoModel);
  }

  public EventoModel buscarEvento() {
    return eventoService.buscarEventos();
  }
}
