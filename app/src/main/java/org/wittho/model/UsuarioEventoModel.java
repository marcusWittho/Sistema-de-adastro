package org.wittho.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioEventoModel {

  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private Integer id;

  private Integer idUsuario;

  private Integer idEvento;

  public UsuarioEventoModel() {
  }

  public UsuarioEventoModel(Integer id, Integer idUsuario, Integer idEvento) {
    this.id = id;
    this.idUsuario = idUsuario;
    this.idEvento = idEvento;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public Integer getIdEvento() {
    return idEvento;
  }

  public void setIdEvento(Integer idEvento) {
    this.idEvento = idEvento;
  }

  @Override
  public String toString() {
    return "UsuarioEventoModel{" +
        "id=" + id +
        ", idUsuario=" + idUsuario +
        ", idEvento=" + idEvento +
        '}';
  }
}
