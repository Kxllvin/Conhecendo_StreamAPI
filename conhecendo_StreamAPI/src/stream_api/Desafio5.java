package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Desafio5 {
        public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        List<Integer> calcMedia = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        for(Integer numero : numeros){
        if(numero >= 5){
            calcMedia.add(numero);
            }
        }

        double soma = 0;
        for (Integer numero : calcMedia){
            soma += numero;
        }

        double media = calcMedia.size() > 0 ? soma / calcMedia.size() : 0;

        System.out.println("A média dos valores maiores ou iguas a 5 é: " + media);
    }
}