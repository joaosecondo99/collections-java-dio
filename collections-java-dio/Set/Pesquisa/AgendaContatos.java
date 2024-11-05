package Set.Pesquisa;
import java.util.Set;
import java.util.HashSet;


public class AgendaContatos {
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void addContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    for (Contato c : contatoSet) {
      if (c.getNome().startsWith(nome)) {
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }
  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.exibirContatos();

    agendaContatos.addContato("Camila", 123456);
    agendaContatos.addContato("Camila", 5665);
    agendaContatos.addContato("Camila Cavalcante", 11111111);
    agendaContatos.addContato("Camila DIO", 654987);
    agendaContatos.addContato("Maria Silva", 11111111);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Camila"));

    System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 1020304050));
  }
}
