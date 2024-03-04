package org.wittho.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class EventoModel {

  public Integer idEvento;
  public String nome;
  public String endereco;
  public String categoria;
  public LocalDateTime horario;
  public String descricao;

  public EventoModel() {}

  public EventoModel(Integer idEvento, String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
    this.idEvento = idEvento;
    this.nome = nome;
    this.endereco = endereco;
    this.categoria = categoria;
    this.horario = horario;
    this.descricao = descricao;
  }

  public Integer getIdEvento() {
    return idEvento;
  }

  public void setIdEvento(Integer idEvento) {
    this.idEvento = idEvento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public LocalDateTime getHorario() {
    return horario;
  }

  public void setHorario(LocalDateTime horario) {
    this.horario = horario;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "EventoModel{" +
        "idEvento=" + idEvento +
        ", nome='" + nome + '\'' +
        ", endereco='" + endereco + '\'' +
        ", categoria='" + categoria + '\'' +
        ", horario=" + horario +
        ", descricao='" + descricao + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EventoModel that)) return false;
    return Objects.equals(getIdEvento(), that.getIdEvento())
        && Objects.equals(getNome(), that.getNome())
        && Objects.equals(getEndereco(), that.getEndereco())
        && Objects.equals(getCategoria(), that.getCategoria())
        && Objects.equals(getHorario(), that.getHorario())
        && Objects.equals(getDescricao(), that.getDescricao());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getIdEvento(), getNome(), getEndereco(), getCategoria(), getHorario(), getDescricao());
  }
}
