package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  // Atributos:

  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }
  public void addContato(String nome, Integer telefone){
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.addContato("Camila", 123456);
    agendaContatos.addContato("Camila", 5665);
    agendaContatos.addContato("Camila Cavalcante", 11111111);
    agendaContatos.addContato("Camila DIO", 654987);
    agendaContatos.addContato("João Secondo", 111111111);
    agendaContatos.addContato("Camila", 44444);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("João Secondo");
    agendaContatos.exibirContatos();
  }
}
