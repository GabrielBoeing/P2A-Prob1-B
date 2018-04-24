public class CriarAudio {

    private Audio audio;

    /*
        wmaPlay
        AIFFSuperPlayer 
        WAVPlayer 
        ---------------
        MP3, AAC, WMA, M4A, OGG, FLAC, WAV, AIFF
    */

    public String getExtencao(Path path) {
        return path.getFileName().toString();
    }

    public Audio criarAudio(Path path) {
        String extencao = this.getExtencao(path);
        //testando qual instancia deve ser criado
        if (extencao.equals("MP3") || extencao.equals("AAC") || extencao.equals("WMA") ) 
            this.audio = new wmaPlayFacade();
        else if (extencao.equals("M4A") || extencao.equals("OGG") || extencao.equals("FLAC"))
            this.audio = new AIFFSuperPlayerFacade();
        else if (extencao.equals("WAV") || extencao.equals("AIFF"))
            this.audio = new WAVPlayerFacade();

        //retornando facade
        return this.audio;
    }

}