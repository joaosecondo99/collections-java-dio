package ExemploMSNPOO;

public class FacebookMessenger extends ServicoMsgInstantanea{
  @Override
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Facebook Messenger");
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Facebook Messenger");
  }
}
