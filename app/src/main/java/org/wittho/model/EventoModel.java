package org.wittho.model;

import org.wittho.entity.TipoEventoEntity;

import java.time.LocalDateTime;

public class EventoModel {
  private Integer id;
  private TipoEventoModel tipoEvento;
  private String address;
  private String category;
  private LocalDateTime eventDate;
  private String description;

  public EventoModel() {
  }

  public EventoModel(Integer id, TipoEventoModel tipoEvento, String address, String category, LocalDateTime eventDate, String description) {
    this.id = id;
    this.tipoEvento = tipoEvento;
    this.address = address;
    this.category = category;
    this.eventDate = eventDate;
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TipoEventoModel getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(TipoEventoModel tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public LocalDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "EventoModel{" +
        "id=" + id +
        ", eventname='" + tipoEvento + '\'' +
        ", address='" + address + '\'' +
        ", category='" + category + '\'' +
        ", eventDate=" + eventDate +
        ", description='" + description + '\'' +
        '}';
  }
}
