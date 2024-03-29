package org.wittho.mapper;

import org.mapstruct.Mapper;
import org.wittho.entity.EventoEntity;
import org.wittho.entity.UsuarioEntity;
import org.wittho.model.EventoModel;
import org.wittho.model.UsuarioModel;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

  UsuarioModel toUsuarioModel(UsuarioEntity usuarioEntity);
  List<UsuarioModel> toListUsuarioModel(List<UsuarioEntity> usuarioEntityList);

  EventoModel toEventoModel(EventoEntity eventoEntity);
  List<EventoModel> toListEventoModel(List<EventoEntity> eventoEntityList);
  EventoEntity toEventoEntity(EventoModel eventoModel);
}
