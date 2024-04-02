package org.wittho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wittho.entity.UsuarioEventoEntity;

import java.util.List;

@Repository
public interface UsuarioEventoRepository extends JpaRepository<UsuarioEventoEntity, Integer> {

  List<UsuarioEventoEntity> findByIdUsuario(Integer idUsuario);
}
