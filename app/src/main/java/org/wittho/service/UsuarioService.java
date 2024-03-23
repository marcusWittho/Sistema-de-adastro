package org.wittho.service;

import org.springframework.stereotype.Service;
import org.wittho.entity.UsuarioEntity;
import org.wittho.mapper.ServiceMapper;
import org.wittho.mapper.ServiceMapperImpl;
import org.wittho.model.UsuarioModel;
import org.wittho.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

  private final UsuarioRepository repository;

  public UsuarioService(UsuarioRepository repository) {
    this.repository = repository;
  }

  public UsuarioModel insertUser(UsuarioEntity usuarioEntity) {
    ServiceMapper mapper = new ServiceMapperImpl();

    return mapper.toUsuarioModel(repository.save(usuarioEntity));
  }

  public Optional<UsuarioEntity> findById(Integer id) {
    return repository.findById(id);
  }

  public UsuarioModel updateUser(Integer id, UsuarioEntity usuarioEntity) {
    ServiceMapper mapper = new ServiceMapperImpl();

    Optional<UsuarioEntity> userById = this.findById(id);

    if (!userById.isPresent()) {
      throw new RuntimeException("Usuário não encontrado.");
    }

    userById.get().setUsername(usuarioEntity.getUsername());
    userById.get().setEmail(usuarioEntity.getEmail());
    userById.get().setCpf(usuarioEntity.getCpf());
    userById.get().setPhone(usuarioEntity.getPhone());

    return mapper.toUsuarioModel(repository.save(userById.get()));
  }

  public List<UsuarioModel> findAll() {
    ServiceMapper mapper = new ServiceMapperImpl();

    return mapper.toListUsuarioModel(repository.findAll());
  }

  public void deleteById(Integer idUsuario) {
    repository.deleteById(idUsuario);
  }
}
