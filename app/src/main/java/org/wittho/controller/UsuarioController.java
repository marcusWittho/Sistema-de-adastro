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
import org.wittho.entity.UsuarioEntity;
import org.wittho.model.UsuarioModel;
import org.wittho.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

  private final UsuarioService service;

  public UsuarioController(UsuarioService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<UsuarioModel> insertUser(@RequestBody UsuarioEntity usuarioEntity) {
    return ResponseEntity.ok(service.insertUser(usuarioEntity));
  }

  @GetMapping(value = "/{idUsuario}")
  public ResponseEntity<UsuarioEntity> findById(@PathVariable Integer idUsuario) {
    return ResponseEntity.ok(service.findById(idUsuario).get());
  }

  @PutMapping(value = "/{idUsuario}")
  public ResponseEntity<UsuarioModel> updateUser(@PathVariable Integer idUsuario, @RequestBody UsuarioEntity usuarioEntity) {
    return ResponseEntity.ok(service.updateUser(idUsuario, usuarioEntity));
  }

  @GetMapping
  public ResponseEntity<List<UsuarioModel>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @DeleteMapping(value = "/{idUsuario}")
  public void deleteById(@PathVariable Integer idUsuario) {
    service.deleteById(idUsuario);
  }
}
