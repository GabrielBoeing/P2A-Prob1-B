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
        int posicaoAtual = wav.reward(0);
        wav.reward(posicaoAtual);
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        wav.forward(qtdSegAvancar * 1000);
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        wav.reward(qtdSegRetrocedidos * 1000);
    }

    @Override
    public void liberar() {
       // finalize();
    }

}
