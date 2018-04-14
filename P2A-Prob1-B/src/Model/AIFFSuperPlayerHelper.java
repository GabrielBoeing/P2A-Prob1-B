package Model;

import Interface.FormatoAudio;
import problema1.AIFFSuperPlayer;

/**
 *
 * @author gabri
 */
public class AIFFSuperPlayerHelper implements FormatoAudio {

    private AIFFSuperPlayer aiff;

    @Override
    public void abrir(String path) {
        this.aiff = new AIFFSuperPlayer(path);
    }

    @Override
    public void reproduzir() {
        this.aiff.play();
    }

    @Override
    public void pausar() {
        this.aiff.pause();        
    }

    @Override
    public void parar() {
        this.aiff.pause();
        this.aiff.setCursor(0);
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        int iAtual = this.aiff.pause();
        this.aiff.setCursor(iAtual + qtdSegAvancar);
        this.aiff.play();
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        int iAtual = this.aiff.pause();
        this.aiff.setCursor(iAtual - qtdSegRetrocedidos);
        this.aiff.play();
    }

    @Override
    public void liberar() {
        this.aiff.release();
    }

}
