package org.wittho.model;

public class TipoEventoModel {

  private Short idTipoEvento;

  private String titulo;

  public TipoEventoModel() {
  }

  public TipoEventoModel(Short idTipoEvento, String titulo) {
    this.idTipoEvento = idTipoEvento;
    this.titulo = titulo;
  }

  public Short getIdTipoEvento() {
    return idTipoEvento;
  }

  public void setIdTipoEvento(Short idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String toString() {
    return "TipoEventoModel{" +
        "idTipoEvento=" + idTipoEvento +
        ", titulo='" + titulo + '\'' +
        '}';
  }
}