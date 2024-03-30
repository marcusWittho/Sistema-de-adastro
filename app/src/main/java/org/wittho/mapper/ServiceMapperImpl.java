package org.wittho.mapper;

import org.wittho.entity.EventoEntity;
import org.wittho.entity.TipoEventoEntity;
import org.wittho.entity.UsuarioEntity;
import org.wittho.model.EventoModel;
import org.wittho.model.TipoEventoModel;
import org.wittho.model.UsuarioModel;

import java.util.ArrayList;
import java.util.List;

public class ServiceMapperImpl implements ServiceMapper {

  @Override
  public UsuarioModel toUsuarioModel(UsuarioEntity usuarioEntity) {
    return new UsuarioModel(
        usuarioEntity.getId(),
        usuarioEntity.getUsername(),
        usuarioEntity.getEmail(),
        usuarioEntity.getCpf(),
        usuarioEntity.getPhone()
    );
  }

  @Override
  public List<UsuarioModel> toListUsuarioModel(List<UsuarioEntity> usuarioEntityList) {
    List<UsuarioModel> usuarioModelList = new ArrayList<>();

    usuarioEntityList.forEach(usuario -> {
      usuarioModelList.add(this.toUsuarioModel(usuario));
    });

    return usuarioModelList;
  }

  @Override
  public EventoModel toEventoModel(EventoEntity eventoEntity) {
    return new EventoModel(
        eventoEntity.getId(),
        toTipoEventoModel(eventoEntity.getTipoEvento()),
        eventoEntity.getAddress(),
        eventoEntity.getCategory(),
        eventoEntity.getEventDate(),
        eventoEntity.getDescription()
    );
  }

  @Override
  public List<EventoModel> toListEventoModel(List<EventoEntity> eventoEntityList) {
    List<EventoModel> eventoModelList = new ArrayList<>();

    eventoEntityList.forEach(evento -> {
      eventoModelList.add(this.toEventoModel(evento));
    });
    return eventoModelList;
  }

  @Override
  public EventoEntity toEventoEntity(EventoModel eventoModel) {
    return new EventoEntity(
        eventoModel.getId(),
        toTipoEventoEntity(eventoModel.getTipoEvento()),
        eventoModel.getAddress(),
        eventoModel.getCategory(),
        eventoModel.getEventDate(),
        eventoModel.getDescription()
    );
  }

  @Override
  public TipoEventoModel toTipoEventoModel(TipoEventoEntity tipoEventoEntity) {
    return new TipoEventoModel(
        tipoEventoEntity.getIdTipoEvento(),
        tipoEventoEntity.getTitulo()
    );
  }

  @Override
  public TipoEventoEntity toTipoEventoEntity(TipoEventoModel tipoEventoModel) {
    return new TipoEventoEntity(
        tipoEventoModel.getIdTipoEvento(),
        tipoEventoModel.getTitulo()
    );
  }

  @Override
  public List<TipoEventoModel> toListTipoEventoModel(List<TipoEventoEntity> listTipoEventoEntity) {
    List<TipoEventoModel> tipoEventoModelList = new ArrayList<>();

    listTipoEventoEntity.forEach(tipo -> {
      tipoEventoModelList.add(this.toTipoEventoModel(tipo));
    });

    return tipoEventoModelList;
  }
}
