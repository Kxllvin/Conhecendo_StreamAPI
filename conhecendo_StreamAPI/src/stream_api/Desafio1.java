package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.Random;

public class Desafio1 {

    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        Consumer<List<Integer>> ordemCresc = numero -> {
            Collections.sort(numero);
            numero.forEach(System.out::println);
        };

        ordemCresc.accept(numeros);
    }

}
