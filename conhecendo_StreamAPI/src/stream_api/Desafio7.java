package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Conteúdo do Array: " + numeros);

        Optional<Integer> maiorNumero = numeros.stream().max(Integer::compareTo);

        maiorNumero.ifPresentOrElse(
            numero -> System.out.println("Maior número: " + numero), () -> System.out.println("A lista está vazia."));
    }
}
