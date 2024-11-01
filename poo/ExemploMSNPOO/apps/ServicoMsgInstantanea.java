package ExemploMSNPOO;

public abstract class ServicoMsgInstantanea {
  public abstract void enviarMensagem();
  public abstract void receberMensagem();

  // Somente os filhos conhecem este método
  protected void validarConectadoInternet() {
    System.out.println("Validando sua conexão...");
  }
}
