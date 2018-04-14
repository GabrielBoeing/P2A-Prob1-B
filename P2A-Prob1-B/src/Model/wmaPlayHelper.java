
package Model;

import Interface.FormatoAudio;
import problema1.wmaPlay;

public class wmaPlayHelper implements FormatoAudio  {

    private wmaPlay wma;
    private int pontoParada;
    
    @Override
    public void abrir(String path) {
        wma = new wmaPlay();
        wma.setFile(path);              
        wma.open();
        pontoParada = 0;
        wma.setLocation(pontoParada);
    }

    @Override
    public void reproduzir() {
        wma.setLocation(pontoParada);
        wma.play();
    }

    @Override
    public void pausar() {
        wma.stop();
        pontoParada = wma.getLocation();
    }

    @Override
    public void parar() {
        wma.stop();
        pontoParada = 0;
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        wma.setLocation(pontoParada + qtdSegAvancar);
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        wma.setLocation(pontoParada - qtdSegRetrocedidos);
    }

    @Override
    public void liberar() {
        wma = null;
    }
    
}
