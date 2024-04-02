package org.wittho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.wittho.entity.EventoEntity;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Integer> {

  @Query(value = """
      SELECT ev.* FROM eventos ev
      JOIN usuario_evento ue ON ue.id_usuario = :idUsuario
      WHERE ev.id_evento = ue.id_evento
      """, nativeQuery = true)
  List<EventoEntity> buscarEventosPorIdUsuario(Integer idUsuario);
}
