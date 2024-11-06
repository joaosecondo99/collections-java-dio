package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
  // Atributos:

  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void addEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    // Por conta desses atributos não se relacionarem, não têm como utiliza-los para a função em questão!

    /* Set<LocalDate> dateSet = eventosMap.keySet();
    Collection<Evento> values = eventosMap.values(); */

    LocalDate dataAtual = LocalDate.now();

    LocalDate proxData = null;
    Evento proxEvento = null;

    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proxData = entry.getKey();
        proxEvento = entry.getValue();
        System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.addEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
    agendaEventos.addEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
    agendaEventos.addEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
    agendaEventos.addEvento(LocalDate.of(2024, 11, 6), "Evento 4", "Atração 4");
    agendaEventos.addEvento(LocalDate.of(2024, 11, 8), "Evento 5", "Atração 5");

    agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();
  }
}
