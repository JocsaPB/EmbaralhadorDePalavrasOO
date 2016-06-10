import Fabricas.FabricaMecanicaDoJogo;
import Interface.MecanicaDoJogo;
import java.util.Scanner;

/**
 * Created by jocsa on 11/04/16.
 */
public class Principal {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo().retornarMecanicaDoJogo();

        System.out.println("---------- Nível do jogo escolhido foi o -> "+mecanicaDoJogo.getTipoDeJogo()+" ----------");
        if(mecanicaDoJogo.getTipoDeJogo().equals("FÁCIL")){
            System.out.println("Instrução: O jogo terá "+mecanicaDoJogo.getQntRodada()+" rodadas\n" +
                    "Chegue ao final sem zerar a pontuação e vença este desafio!");
        }else{
            System.out.println("Instrução: O jogo terá "+mecanicaDoJogo.getQntRodada()+" rodadas\n" +
                    "Neste nível é mata-mata, se não acertar a palavra você irá perder!\n" +
                    "Acerte todas e vença este desafio!");
        }

        System.out.println("Olá! Bem vindo ao jogo! Sua pontuação inicial é de: "+mecanicaDoJogo.getPontuacao());

            while (!mecanicaDoJogo.getGameOver()){
                int rodada = mecanicaDoJogo.getRodadaJaJogadas();
                System.out.println("------------------------------------------------------------");
                System.out.println(rodada+"º rodada!");

                String palavrasDaRodada = mecanicaDoJogo.rodada();
                System.out.println("Qual é a palavra: -> "+palavrasDaRodada+" ? ");

                boolean acertou = mecanicaDoJogo.verificadorDeTentativa(scan.nextLine().toLowerCase());

                if(acertou){
                    System.out.println("Parabéns, você acertou!");
                    mecanicaDoJogo.computarPontos();
                }else{
                    if (mecanicaDoJogo.getTipoDeJogo().equals("FÁCIL")){
                        System.out.println("Você errou! Deseja jogar novamente? S - SIM / N - NÃO\n" +
                                "(obs: se errar novamente, os pontos de erros aumentarão 50%.)");
                        if(scan.nextLine().toLowerCase().equals("s")){
                            System.out.print("Ultima tentativa da rodada -> ");
                            acertou = mecanicaDoJogo.verificadorDeTentativa(scan.nextLine());
                            if(acertou){
                                System.out.println("Parabéns, você acerto!");
                                mecanicaDoJogo.computarPontos();
                            }else{
                                System.out.println("Xiiiiiii, você errou!");
                                System.out.println("A palavra correta era: "+mecanicaDoJogo.getPalavraCorreta());
                                mecanicaDoJogo.computarErros(true);
                            }
                        }else if(scan.nextLine().toLowerCase().equals("n")){
                            System.out.println("A palavra correta era: "+mecanicaDoJogo.getPalavraCorreta()+"\n");
                            mecanicaDoJogo.computarErros(false);
                        }else{
                            System.out.println("Você não escolheu uma opção válida! Rodada perdida!");
                        }
                    }else{
                        System.out.println("Você errou!!! Deseja jogar novamente, ou se entrega? S - SIM / N - NÃO\n" +
                                "(obs: Se errar novamente, é fim de jogo!)");
                        if(scan.nextLine().toLowerCase().equals("s")){
                            System.out.print("Ultima tentativa -> ");
                            acertou = mecanicaDoJogo.verificadorDeTentativa(scan.nextLine());
                            if(acertou){
                                System.out.println("Parabéns, você acerto!");
                                mecanicaDoJogo.computarPontos();
                            }else{
                                System.out.println("Xiiiiiii, você errou!");
                                System.out.println("A palavra correta era: "+mecanicaDoJogo.getPalavraCorreta());
                                mecanicaDoJogo.computarErros(true);
                            }
                        }else{
                            System.out.println("A palavra correta era: "+mecanicaDoJogo.getPalavraCorreta()+"\n");
                            mecanicaDoJogo.computarErros(false);
                        }
                    }

                }

                System.out.println("Sua pontuação é de :"+mecanicaDoJogo.getPontuacao()+" pontos.");


            }
        if(mecanicaDoJogo.getTipoDeJogo().equals("FÁCIL")){
            if(mecanicaDoJogo.getPontuacao()>0 && (mecanicaDoJogo.getRodadaJaJogadas() > mecanicaDoJogo.getQntRodada())){
                System.out.println("PARABÉNS, VOCÊ CHEGOU AO FINAL! SUA PONTUAÇÃO MÁXIMA FOI DE :"+mecanicaDoJogo.getPontuacao()+" PONTOS.");
            }else{
                System.out.println("VOCÊ PERDEU TODOS OS PONTOS!");
            }
        }else{
            if((mecanicaDoJogo.getRodadaJaJogadas() > mecanicaDoJogo.getQntRodada())){
                System.out.println("PARABÉNS, VOCÊ CHEGOU AO FINAL! SUA PONTUAÇÃO FOI DE :"+mecanicaDoJogo.getPontuacao()+" PONTOS!");
            }else{
                System.out.println("VOCÊ ERROU A PALAVRA!");
                System.out.println("Sua pontuação máxima foi de "+mecanicaDoJogo.getPontuacao()+" pontos.");
            }
        }

        System.out.println("FIM DE JOGO");

    }

}
