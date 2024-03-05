package org.wittho.repository;

import org.wittho.entity.EventoEntity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EventoRepository {

  private final String EVENTS_DATA = "app/src/main/resources/data/events.data";

  public EventoRepository() {};

  public EventoEntity salvarEvento(EventoEntity evento) {
    FileOutputStream arquivoSaida = null;
    ObjectOutputStream objetoSaida = null;

    try {
      arquivoSaida = new FileOutputStream(EVENTS_DATA);
      objetoSaida = new ObjectOutputStream(arquivoSaida);

      objetoSaida.writeObject(evento);

      System.out.println("Evento salvo com sucesso.");
    } catch (IOException err) {
      err.printStackTrace();
    } finally {
      try {
        objetoSaida.close();
        arquivoSaida.close();
      } catch (IOException err) {
        err.printStackTrace();
      }
    }

    return evento;
  }

  public EventoEntity buscarEventos() {
    FileInputStream arquivoEntrada = null;
    ObjectInputStream objetoEntrada = null;
    EventoEntity objetoRecuperado = null;

    try {
      arquivoEntrada = new FileInputStream(EVENTS_DATA);
      objetoEntrada = new ObjectInputStream(arquivoEntrada);

      objetoRecuperado = (EventoEntity) objetoEntrada.readObject();
    } catch (IOException | ClassNotFoundException err) {
      err.printStackTrace();
    } finally {
      try {
        objetoEntrada.close();
        arquivoEntrada.close();
      } catch (IOException err) {
        err.printStackTrace();
      }
    }

    return objetoRecuperado;
  }
}
