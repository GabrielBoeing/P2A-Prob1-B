package Model;

import Interface.FormatoAudio;
import java.nio.file.Path;

public class CriarAudio {

    private FormatoAudio audio;

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

    public FormatoAudio criarAudio(Path path) {
        String extencao = this.getExtencao(path);
        //testando qual instancia deve ser criado
        if (extencao.equals("MP3") || extencao.equals("AAC") ) 
            this.audio = new ACCPlayerHelper();
        else if (extencao.equals("M4A") || extencao.equals("OGG"))
            this.audio = new AIFFSuperPlayerHelper();
        else if (extencao.equals("WAV") || extencao.equals("AIFF"))
            this.audio = new MP3DJHelper();
        else if (extencao.equals("WMA"))
            this.audio = new WAVPlayerHelper();
        else if (extencao.equals("FLAC"))
            this.audio = new wmaPlayHelper();

        //retornando facade
        return this.audio;
    }

}