package org.wittho.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wittho.model.TipoEventoModel;
import org.wittho.service.TipoEventoService;

import java.util.List;

@RestController
@RequestMapping(value = "/tipo-evento")
public class TipoEventoController {

  private final TipoEventoService service;

  public TipoEventoController(TipoEventoService service) {
    this.service = service;
  }

  @GetMapping(value = "/{idTipoEvento}")
  public ResponseEntity<TipoEventoModel> findById(@PathVariable Short idTipoEvento) {
    return ResponseEntity.ok(service.findById(idTipoEvento));
  }

  @GetMapping
  public ResponseEntity<List<TipoEventoModel>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
