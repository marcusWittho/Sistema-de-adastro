package org.wittho.service;

import org.springframework.stereotype.Service;
import org.wittho.entity.TipoEventoEntity;
import org.wittho.mapper.ServiceMapper;
import org.wittho.mapper.ServiceMapperImpl;
import org.wittho.model.TipoEventoModel;
import org.wittho.repository.TipoEventoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEventoService {

  private final TipoEventoRepository tipoEventoRepository;

  public TipoEventoService(TipoEventoRepository tipoEventoRepository) {
    this.tipoEventoRepository = tipoEventoRepository;
  }

  public TipoEventoModel findById(Short idTipoEvento) {
    ServiceMapper mapper = new ServiceMapperImpl();
    Optional<TipoEventoEntity> tipoEventoEntity = tipoEventoRepository.findById(idTipoEvento);

    if (!tipoEventoEntity.isPresent()) {
      throw new RuntimeException("Tipo de evento não encontrado.");
    }

    return mapper.toTipoEventoModel(tipoEventoEntity.get());
  }

  public List<TipoEventoModel> findAll() {
    ServiceMapper mapper = new ServiceMapperImpl();
    List<TipoEventoEntity> tipoEventoEntityList = tipoEventoRepository.findAll();

    return mapper.toListTipoEventoModel(tipoEventoEntityList);
  }
}
