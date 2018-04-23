package Model;

import Interface.FormatoAudio;
import problema1.MP3DJ;

public class MP3DJHelper implements FormatoAudio {

    private MP3DJ mp3dj;

    @Override
    public void abrir(String path) {
        mp3dj = new MP3DJ();
        mp3dj.setFile(path);
    }

    @Override
    public void reproduzir() {
        mp3dj.play();
    }

    @Override
    public void pausar() {
        mp3dj.stop();
    }

    @Override
    public void parar() {
        mp3dj.stop();
        int posicaoAtual = mp3dj.forward(0);
        mp3dj.reward(posicaoAtual);
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        mp3dj.forward(qtdSegAvancar);
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        mp3dj.reward(qtdSegRetrocedidos);
    }

    @Override
    public void liberar() {
        mp3dj = null;
    }

}
