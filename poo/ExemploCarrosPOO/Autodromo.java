package ExemploPilaresPOO;

public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();

    jeep.ligar();
    jeep.setChassi("89797987");

    Moto z400 = new Moto();

    z400.ligar();
    z400.setChassi("548949");

    Veiculo coringa = jeep;

    coringa.ligar();


    // Ao inves de chamar o método na main, utiliza-se do ENCAPSULAMENTO
    // confereCombustivel();
    // confereCambio();
  }
}
