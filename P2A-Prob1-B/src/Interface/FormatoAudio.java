/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author gabri
 */
public interface FormatoAudio {
    
    /**
     *  carrega um arquivo de áudio na memória,
     *  recebendo como parâmetro o nome do arquivo.
     * @param path
     */
    public void abrir (String path);
    
    
    /**
     *  Reproduz o arquivo de áudio que foi carregado
     *  na memória pelo método abrir(). A reprodução ocorre a partir do
     *  início do arquivo (na primeira vez) ou no ponto onde a reprodução
     *  tenha sido pausada
     */
    public void reproduzir();
    
    
    /**
     * Para a reprodução do arquivo
     */
    public void pausar();
    
    
    /**
     * para a reprodução e retorna para o início do arquivo
     */
    public void parar();
    
    
    /**
     *  Recebe como parâmetro a quantidade de
     *  segundos que devem ser avançados no arquivo a partir do ponto
     *  atual.
     * @param qtdSegAvancar 
     */
    public void avancar(int qtdSegAvancar);
    
    
    /**
     *  Recebe como parâmetro a quantidade de segundos que devem ser
     *  retrocedidos no arquivo a partir do ponto atual.
     * @param qtdSegRetrocedidos 
     */
    public void retomar(int qtdSegRetrocedidos);
    
    
    /**
     *  Fecha o arquivo e libera a memória.
     */
    public void liberar();
    
}
