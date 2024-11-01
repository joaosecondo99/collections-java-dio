package ExemploMSNPOO;

public class MSNMessenger extends ServicoMsgInstantanea{

  @Override
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo MSN");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN");
  }
}
