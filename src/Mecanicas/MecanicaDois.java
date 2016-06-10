package Mecanicas;

import Fabricas.FabricaEmbaralhadores;
import Interface.Embaralhador;
import Interface.MecanicaDoJogo;

import java.util.Map;

/**
 * Created by jocsa on 11/04/16.
 */
public class MecanicaDois implements MecanicaDoJogo{

    private Embaralhador embaralhador;
    private String palavraCorreta;
    private int qntRodadas = 15;
    private int qntRodadasJogadas = 1;
    private boolean gameOver = false;
    private int pontuacao = 10;
    private int pontosPorAcerto = 5;
    private int pontosPorErro = 10;
    private String tipoDeJogo = "DIFÍCIL";

    @Override
    public String rodada() {
        this.embaralhador = FabricaEmbaralhadores.retornarEmbaralhador();
        this.palavraCorreta = embaralhador.selecionarPalavra();
        return embaralhador.embaralhar(this.palavraCorreta).toLowerCase();

    }

    @Override
    public boolean verificadorDeTentativa(String palavraDigitada) {
        if(this.palavraCorreta.toLowerCase().equals(palavraDigitada)){
            this.qntRodadasJogadas++;
            //Verificar se as rodadas acabaram
            if(this.qntRodadasJogadas>this.qntRodadas){
                this.gameOver = true;
            }
            return true;
        }else{
            this.qntRodadasJogadas++;
            //Verificar se as rodadas acabaram
            if( this.pontuacao < 0 || this.qntRodadasJogadas>this.qntRodadas){
                this.gameOver = true;
            }
            return false;
        }
    }

    @Override
    public void computarPontos() {
        this.pontuacao += this.pontosPorAcerto;
    }

    @Override
    public void computarErros(boolean segundaTentativa) {
        this.gameOver = true;
    }


    public boolean getGameOver(){
        return this.gameOver;
    }

    @Override
    public int getPontuacao(){
        return this.pontuacao;
    }

    @Override
    public String getPalavraCorreta(){
        return this.palavraCorreta;
    }


    public int getRodadaJaJogadas(){
        return this.qntRodadasJogadas;
    }

    @Override
    public int getQntRodada(){
        return this.qntRodadas;
    }

    @Override
    public String getTipoDeJogo(){
        return this.tipoDeJogo;
    }
}
