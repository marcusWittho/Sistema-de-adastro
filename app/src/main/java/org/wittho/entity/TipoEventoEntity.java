package org.wittho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_evento")
public class TipoEventoEntity {

  @Id
  @Column(name = "id_tipo_evento")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Short idTipoEvento;

  @Column(name = "titulo")
  private String titulo;

  public TipoEventoEntity() {
  }

  public TipoEventoEntity(Short idTipoEvento, String titulo) {
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
}