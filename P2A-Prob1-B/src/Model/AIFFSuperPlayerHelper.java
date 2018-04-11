package Model;
import Interface.FormatoAudio;
import problema1.AIFFSuperPlayer;

/**
 *
 * @author gabri
 */
public class AIFFSuperPlayerHelper implements FormatoAudio {

    AIFFSuperPlayer aiff;

    @Override
    public void abrir(String path) {
        AIFFSuperPlayer aiff = new AIFFSuperPlayer(path);
    }

    @Override
    public void reproduzir() {
        
    }

    @Override
    public void pausar() {
        
    }

    @Override
    public void parar() {
        
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        
    }

    @Override
    public void liberar() {
        
    }
    
}
