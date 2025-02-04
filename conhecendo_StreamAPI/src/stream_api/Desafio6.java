package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        List<Integer> numerosMaiorQDez = numeros.stream()
            .filter(numero -> numero >= 10)
            .collect(Collectors.toList());
        
        System.out.println("Números maiores ou = a 10: " + numerosMaiorQDez);
    }
}   

