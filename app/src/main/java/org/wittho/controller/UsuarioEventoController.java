package org.wittho.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wittho.entity.UsuarioEventoEntity;
import org.wittho.mapper.ServiceMapper;
import org.wittho.mapper.ServiceMapperImpl;
import org.wittho.model.UsuarioEventoModel;
import org.wittho.service.UsuarioEventoService;

import java.util.List;

@RestController
@RequestMapping("/usuario-evento")
public class UsuarioEventoController {

  private final UsuarioEventoService service;

  public UsuarioEventoController(UsuarioEventoService service) {
    this.service = service;
  }

  @PostMapping
  public ResponseEntity<UsuarioEventoEntity> adicionarUsuarioEvento(@RequestBody UsuarioEventoModel eventoModel) {
    ServiceMapper mapper = new ServiceMapperImpl();

    return ResponseEntity.ok(mapper.toUsuarioEventoEntity(service.adicionarUsuarioEvento(mapper.toUsuarioEventoEntity(eventoModel))));
  }

  @GetMapping("/por-usuario/{idUsuario}")
  public ResponseEntity<List<UsuarioEventoModel>> buscarPorIdUsuario(@PathVariable Integer idUsuario) {
    return ResponseEntity.ok(service.buscarPorIdUsuario(idUsuario));
  }

  @DeleteMapping("/remover/{idUsuarioEvento}")
  public void removerPorId(@PathVariable Integer idUsuarioEvento) {
    service.removerUsuarioEvento(idUsuarioEvento);
  }
}
