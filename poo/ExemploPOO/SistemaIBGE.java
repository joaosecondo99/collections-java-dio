public class SistemaIBGE {
  public static void main(String[] args) {
    for (EstadoBrasileiro estados: EstadoBrasileiro.values()){
      System.out.println(estados.getSigla() + " - " + estados.getNome());
    }
  }
}
