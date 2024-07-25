package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = new  ArrayList<>();

        numeros.add(-10);
        numeros.add(-1);
        numeros.add(50);
        numeros.add(39);
        numeros.add(4);
        numeros.add(-23);
        numeros.add(15);

        System.out.println("O conteúdo do Array:" + numeros);

        List <Integer> numerosPos = numeros.stream()
            .filter(numero -> numero > 0)
            .collect(Collectors.toList());

            numerosPos.forEach(numero -> System.out.println(numero + " é positivo."));
    }

}
