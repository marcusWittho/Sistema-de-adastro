package org.wittho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wittho.entity.TipoEventoEntity;

@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEventoEntity, Short> {
}
