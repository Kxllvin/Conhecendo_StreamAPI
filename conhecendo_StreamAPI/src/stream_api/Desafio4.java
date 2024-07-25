package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Desafio4 {

    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        numeros.removeIf(numero -> numero % 2 != 0);

        System.out.println("Conteúdo do Array após remoção dos ímpares: " + numeros);
    }
}
