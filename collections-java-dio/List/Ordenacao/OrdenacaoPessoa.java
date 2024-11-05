package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void addPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordernarIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }
  public List<Pessoa> ordenarAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.addPessoa("Nome 1", 25, 1.85);
    ordenacaoPessoa.addPessoa("Nome 2", 22, 1.99);
    ordenacaoPessoa.addPessoa("Nome 3", 75, 1.45);
    ordenacaoPessoa.addPessoa("Nome 4", 20, 1.70);

    System.out.println(ordenacaoPessoa.ordernarIdade());
    System.out.println(ordenacaoPessoa.ordenarAltura());
  }
}
