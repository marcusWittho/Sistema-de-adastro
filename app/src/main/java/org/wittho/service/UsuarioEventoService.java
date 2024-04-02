package org.wittho.service;

import org.springframework.stereotype.Service;
import org.wittho.entity.UsuarioEventoEntity;
import org.wittho.mapper.ServiceMapper;
import org.wittho.mapper.ServiceMapperImpl;
import org.wittho.model.UsuarioEventoModel;
import org.wittho.repository.UsuarioEventoRepository;

import java.util.List;

@Service
public class UsuarioEventoService {

  private final UsuarioEventoRepository repository;

  public UsuarioEventoService(UsuarioEventoRepository repository) {
    this.repository = repository;
  }

  public UsuarioEventoModel adicionarUsuarioEvento(UsuarioEventoEntity usuarioEventoEntity) {
    ServiceMapper mapper = new ServiceMapperImpl();

    return mapper.toUsuarioEventoModel(repository.save(usuarioEventoEntity));
  }

  public List<UsuarioEventoModel> buscarPorIdUsuario(Integer idUsuario) {
    ServiceMapper mapper = new ServiceMapperImpl();

    return mapper.toListUsuarioEventoModel(repository.findByIdUsuario(idUsuario));
  }

  public void removerUsuarioEvento(Integer idUsuarioEvento) {
    repository.deleteById(idUsuarioEvento);
  }
}
