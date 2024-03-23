package org.wittho.model;

public class UsuarioModel {

  private Integer id;
  private String username;
  private String email;
  private String cpf;
  private String phone;

  public UsuarioModel() {
  }

  public UsuarioModel(Integer id, String username, String email, String cpf, String phone) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.cpf = cpf;
    this.phone = phone;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "UsuarioModel{" +
        "username='" + username + '\'' +
        ", email='" + email + '\'' +
        ", cpf='" + cpf + '\'' +
        ", phone='" + phone + '\'' +
        '}';
  }
}
