package org.wittho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "eventos")
public class EventoEntity {

  @Column(name = "id_evento")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;

  @Column(name = "eventname")
  private String eventname;

  @Column(name = "address")
  private String address;

  @Column(name = "category")
  private String category;

  @Column(name = "event_date")
  private LocalDateTime eventDate;

  @Column(name = "description")
  private String description;

  public EventoEntity() {
  }

  public EventoEntity(Integer id, String eventname, String address, String category, LocalDateTime eventDate, String description) {
    this.id = id;
    this.eventname = eventname;
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

  public String getEventname() {
    return eventname;
  }

  public void setEventname(String eventname) {
    this.eventname = eventname;
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
}
