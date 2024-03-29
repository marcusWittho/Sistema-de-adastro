package org.wittho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wittho.entity.EventoEntity;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntity, Integer> {
}
