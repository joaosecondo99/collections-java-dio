package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  // Atributo:

  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void addConvidado(String nome, int codigoConvite) {
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }
  public void removerConvidadoCodConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidadoSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }
  public int contarConvidaos() {
    return convidadoSet.size();
  }
  public void exibirConvidados() {
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println("Existem " + conjuntoConvidados.contarConvidaos() + " convidado(s) dentro do Set de Convidados!");

    conjuntoConvidados.addConvidado("Convidado 1", 1234);
    conjuntoConvidados.addConvidado("Convidado 2", 1235);
    conjuntoConvidados.addConvidado("Convidado 3", 1235);
    conjuntoConvidados.addConvidado("Convidado 4", 1236);

    System.out.println("Existem " + conjuntoConvidados.contarConvidaos() + " convidado(s) dentro do Set de Convidados!");

    conjuntoConvidados.removerConvidadoCodConvite(1234);
    System.out.println("Existem " + conjuntoConvidados.contarConvidaos() + " convidado(s) dentro do Set de Convidados!");

    conjuntoConvidados.exibirConvidados();
  }
}
