import heranca.SistemaMensagemInstantanea;


public class ComputadorPedrinho extends SistemaMensagemInstantanea {
    public static void main(String[] args) {
        MSNMessager msnMessenger = new MSNMessager();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();
        // msnMessenger.validarConectadoInternet();
        // msnMessenger.salvarHistoricoMensagem();

    }
}
