package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Desafio5 {
        public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        OptionalDouble media = numeros.stream()
            .filter(numero -> numero >= 5)
            .mapToInt(Integer::intValue)
            .average();

        if(media.isPresent()){
            System.out.println("A média dos valores maiores ou iguais a 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Nenhum valor maior ou iguas a 5 encontrado");
        }        
    }
}