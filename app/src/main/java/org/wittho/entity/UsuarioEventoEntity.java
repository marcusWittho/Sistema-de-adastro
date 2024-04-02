package org.wittho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_evento")
public class UsuarioEventoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_usuario_evento")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "id_usuario", updatable = false, insertable = false)
  private UsuarioEntity usuario;

  @Column(name = "id_usuario")
  private Integer idUsuario;

  @ManyToOne
  @JoinColumn(name = "id_evento", updatable = false, insertable = false)
  private EventoEntity evento;

  @Column(name = "id_evento")
  private Integer idEvento;

  public UsuarioEventoEntity() {
  }

  public UsuarioEventoEntity(Integer id, Integer idUsuario, Integer idEvento) {
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
}
