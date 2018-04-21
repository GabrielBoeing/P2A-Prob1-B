package Model;

import Interface.FormatoAudio;
import problema1.WAVPlayer;
import problema1.wmaPlay;

public class WAVPlayerHelper implements FormatoAudio {

    private WAVPlayer wav;

    @Override
    public void abrir(String path) {
        wav = new WAVPlayer(path);
        
    }

    @Override
    public void reproduzir() {
        wav.play();
    }

    @Override
    public void pausar() {
        wav.stop();
    }

    @Override
    public void parar() {
        wav.stop();
        
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
