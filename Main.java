import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una línea de caracteres: ");
        String linea = scanner.nextLine();
        
       
        Map<Character, Integer> frecuencias = new HashMap<>();
        for (char c : linea.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                if (frecuencias.containsKey(c)) {
                    frecuencias.put(c, frecuencias.get(c) + 1);
                } else {
                    frecuencias.put(c, 1);
                }
            }
        }
        if (!frecuencias.isEmpty()) {
            char caracterReemplazo = Collections.max(frecuencias.entrySet(), Map.Entry.comparingByValue()).getKey();
            linea = linea.replaceAll("[aeiouAEIOU]", String.valueOf(caracterReemplazo));
            System.out.println("Linea con vocales reemplazadas: " + linea);
        }
        
       
        String lineaInvertida = new StringBuilder(linea).reverse().toString();
        System.out.println("Linea invertida: " + lineaInvertida);
    }
}
