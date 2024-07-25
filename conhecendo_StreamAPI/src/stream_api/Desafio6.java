package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        List<Integer> numeroMaiorQDez = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        for(Integer numero : numeros){
            if(numero >= 10){
                numeroMaiorQDez.add(numero);
            }
        }
        System.out.println(numeroMaiorQDez);
    }   
}
