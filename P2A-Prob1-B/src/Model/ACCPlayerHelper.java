package Model;

import Interface.FormatoAudio;
import problema1.AACPlayer;

public class ACCPlayerHelper implements FormatoAudio {

    private AACPlayer accPlayer;

    @Override
    public void abrir(String path) {
        accPlayer = new AACPlayer(path);
        accPlayer.open();
        accPlayer.setLocation(0);
    }

    @Override
    public void reproduzir() {
        accPlayer.play();
    }

    @Override
    public void pausar() {
        accPlayer.stop();
    }

    @Override
    public void parar() {
        accPlayer.stop();
        accPlayer.setLocation(0);
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        int posicaoAtual = accPlayer.getLocation();
        accPlayer.setLocation(posicaoAtual + qtdSegAvancar);
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        int posicaoAtual = accPlayer.getLocation();
        accPlayer.setLocation(posicaoAtual - qtdSegRetrocedidos);
    }

    @Override
    public void liberar() {
        accPlayer = null;
    }

}
