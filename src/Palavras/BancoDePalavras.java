package Palavras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jocsa on 11/04/16.
 */
public class BancoDePalavras {

    private final String caminhoTxtFacil = "/home/jocsa/IdeaProjects/FinalProject/palavras/palavrasFacil.txt";
    private final ArrayList<String> palavras = new ArrayList<>();
    private static ArrayList<Integer> indexUsados = new ArrayList<>();

    public BancoDePalavras(){
        try {
            FileReader file = new FileReader(this.caminhoTxtFacil);
            BufferedReader lerFile = new BufferedReader(file);

            String linha = null;

            while ((linha = lerFile.readLine()) != null){
                palavras.add(linha);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String selecionarPalavra(){
        Random random = new Random();
        int index = 0;
        do{
            index = random.nextInt(palavras.size());
        }while (indexUsados.contains(index));
        indexUsados.add(index);


        return palavras.get(index);
    }


}
