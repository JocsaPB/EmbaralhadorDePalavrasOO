package Interface;

import java.util.Map;

/**
 * Created by jocsa on 11/04/16.
 */
public interface MecanicaDoJogo {

    //O jogador começara com 100 pontos e a cada erro os pontos vão sendo diminuidos e a cada acerto, acrescentado
    //O jogador terá 15 rodadas e ao final mostrará a quantidade pontos máximos adquiridos
    //O jogador poderá tentar jogar acertas duas vezes, a segunda tentativa vale apenas a metade dos pontos
    //Mas se errar na segunda tentativa os pontos computados negativamente aumentará 50%

    public String rodada();
    public boolean verificadorDeTentativa(String palavraDigitada);
    public void computarPontos();
    public void computarErros(boolean segundaTentativa);
    public boolean getGameOver();
    public int getPontuacao();
    public String getPalavraCorreta();
    public int getRodadaJaJogadas();
    public int getQntRodada();
    public String getTipoDeJogo();

}
