/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author gabri
 */
public class FormatoAudio implements Interface.FormatoAudio{
    
    private Interface.FormatoAudio novoAudio;

    @Override
    public void abrir(String path) {
        Path caminho = Paths.get(path);
        this.novoAudio = new CriarAudio().criarAudio(caminho);
    }

    @Override
    public void reproduzir() {
        novoAudio.reproduzir();
    }

    @Override
    public void pausar() {
        novoAudio.pausar();
    }

    @Override
    public void parar() {
        novoAudio.parar();
    }

    @Override
    public void avancar(int qtdSegAvancar) {
        novoAudio.avancar(qtdSegAvancar);
    }

    @Override
    public void retomar(int qtdSegRetrocedidos) {
        novoAudio.retomar(qtdSegRetrocedidos);
    }

    @Override
    public void liberar() {
        novoAudio.liberar();
    }
    
}
