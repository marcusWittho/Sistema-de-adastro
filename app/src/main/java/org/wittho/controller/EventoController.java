package org.wittho.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wittho.entity.EventoEntity;
import org.wittho.model.EventoModel;
import org.wittho.service.EventoService;

import java.util.List;

@RestController
@RequestMapping(value = "/evento")
public class EventoController {

  private final EventoService service;

  public EventoController(EventoService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<EventoModel> insertEvento(@RequestBody EventoModel eventoModel) {
    return ResponseEntity.ok(service.insertEvento(eventoModel));
  }

  @GetMapping(value = "/{idEvento}")
  public ResponseEntity<EventoEntity> findById(@PathVariable Integer idEvento) {
    return ResponseEntity.ok(service.findById(idEvento).get());
  }

  @PutMapping(value = "/{idEvento}")
  public ResponseEntity<EventoModel> updateEvento(@PathVariable Integer idEvento, @RequestBody EventoEntity eventoEntity) {
    return ResponseEntity.ok(service.updateEvento(idEvento, eventoEntity));
  }

  @GetMapping
  public ResponseEntity<List<EventoModel>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @DeleteMapping(value = "/{idEvento}")
  public void deleteByID(@PathVariable Integer idEvento) {
    service.deleteById(idEvento);
  }

  @GetMapping("/buscar-por-id-usuario/{idUsuario}")
  public List<EventoEntity> buscarEventosPorIdUsuario(@PathVariable Integer idUsuario) {
    return service.buscarEventosPorIdUsuario(idUsuario);
  }
}
