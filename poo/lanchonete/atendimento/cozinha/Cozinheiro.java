package lanchonete.atendimento.cozinha;

import lanchonete.Atendente;

public class Cozinheiro {
  //pode ser default
  public void adicionarLancheBalcao() {
    System.out.println("ADICIONANDO LANCHE NO BALCÃO!");
  }

  public void adicionarSucoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCÃO!");
  }

  public void adicionarComboBalcao() {
    adicionarLancheBalcao();
    adicionarSucoBalcao();
  }

  public void prepararLanche() {
    System.out.println("PREPARANDO LANCHE!");
  }

  public void prepararVitamina() {
    System.out.println("PREPARANDO VITAMINA!");
  }

  public void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  public void selecionarIngredientesLanche() {
    System.out.println("SELECIONANDO OS INGREDIENTES DO LANCHE!");
  }

  public void selecionarIngredientesVitamina() {
    System.out.println("SELECIONANDO INGREDIENTES DA VITAMINA");
  }

  public void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }

  public void baterVitaminaLiquidificador() {
    System.out.println("BATENDO A VITAMINA NO LIQUIDIFICADOR!");
  }

  public void fritarIngredientes() {
    System.out.println("FRITANDO OS INGREDIENTES DO LANCHE!");
  }

  public void pedirParaTrocarGas (Atendente meuAmigo) {
    meuAmigo.trocarGas();
  }

  public void pedirParaTrocarGas (Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }

  public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
