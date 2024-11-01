package List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  // Atributo:

  private List<Tarefa> tarefaList;
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void addTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }
  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefaList){
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterTotalTarefas() {
    return tarefaList.size();
  }
  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

    listaTarefa.addTarefa("Tarefa 1");
    listaTarefa.addTarefa("Tarefa 1");
    listaTarefa.addTarefa("Tarefa 2");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}
