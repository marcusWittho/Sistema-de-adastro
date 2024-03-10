package org.wittho.repository;

import org.wittho.entity.EventoEntity;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EventoRepository {

  private final String EVENTS_DATA = "app/src/main/resources/data/events.data";

  public EventoRepository() {};

  public String salvarEvento(EventoEntity evento) {
    FileOutputStream arquivoSaida = null;
    ObjectOutputStream objetoSaida = null;
    List<EventoEntity> eventoEntities = new ArrayList<>(buscarEventos());

    try {
      arquivoSaida = new FileOutputStream(EVENTS_DATA);
      objetoSaida = new ObjectOutputStream(arquivoSaida);

      Optional<Integer> maxIdEvento = eventoEntities.stream()
          .map(EventoEntity::getIdEvento)
          .max(Integer::compare);

      if (maxIdEvento.isPresent()) {
        evento.setIdEvento(maxIdEvento.get() + 1);
      } else {
        evento.setIdEvento(1);
      }

      eventoEntities.add(evento);
      this.salvarListaEventos(eventoEntities);
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

    return "Evento salvo com sucesso.";
  }

  public String salvarListaEventos(List<EventoEntity> listaEventos) {
    FileOutputStream arquivoSaida = null;
    ObjectOutputStream objetoSaida = null;

    try {
      arquivoSaida = new FileOutputStream(EVENTS_DATA);
      objetoSaida = new ObjectOutputStream(arquivoSaida);

      objetoSaida.writeObject(listaEventos);
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

    return "Lista salva com sucesso.";
  }

  public List<EventoEntity> buscarEventos() {
    FileInputStream arquivoEntrada = null;
    ObjectInputStream objetoEntrada = null;
    List<EventoEntity> eventos = new ArrayList<>();
    List<EventoEntity> eventosOrdenados = new ArrayList<>();
    try {
      File eventsData = new File(EVENTS_DATA);

      if (eventsData.exists() && eventsData.length() == 0) {
        return eventos;
      }

      arquivoEntrada = new FileInputStream(EVENTS_DATA);
      objetoEntrada = new ObjectInputStream(arquivoEntrada);

      while(true) {
        try {
          List<EventoEntity> eventoRecuperado = (List<EventoEntity>) objetoEntrada.readObject();
          eventos.addAll(eventoRecuperado);

          eventosOrdenados = eventos.stream()
              .sorted(Comparator.comparing(EventoEntity::getHorario))
              .toList();
        } catch(EOFException err) {
          break;
        }
      }
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

    return eventosOrdenados;
  }

  public List<EventoEntity> removerEvento(Integer id) {
    List<EventoEntity> eventoEntities = buscarEventos();
    List<EventoEntity> eventoEntitiesFiltrados = new ArrayList<>();

    eventoEntities.forEach(evento -> {
      if (evento.getIdEvento().compareTo(id) != 0)
        eventoEntitiesFiltrados.add(evento);
    });

    salvarListaEventos(eventoEntitiesFiltrados);

    return eventoEntitiesFiltrados;
  }

  public List<EventoEntity> listarEventosFuturos() {
    List<EventoEntity> eventos = this.buscarEventos();

    return eventos.stream()
        .filter(evento -> evento.getHorario().isAfter(LocalDateTime.now()))
        .collect(Collectors.toList());
  }
}
