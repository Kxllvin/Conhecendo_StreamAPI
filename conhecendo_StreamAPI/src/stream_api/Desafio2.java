package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);

        System.out.println("A soma dos numeros pares é: " + resultado);
    }
}
