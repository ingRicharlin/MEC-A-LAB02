import java.util.Arrays;
import java.util.Scanner;

public class EstadisticasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = sc.nextInt();
        int[] numeros = new int[size];
        
      
        System.out.println("Ingrese los " + size + " números del arreglo:");
        for (int i = 0; i < size; i++) {
            numeros[i] = sc.nextInt();
        }
        
   
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        
       
        Arrays.sort(numeros);
        
      
        double media = 0;
        for (int i = 0; i < size; i++) {
            media += numeros[i];
        }
        media /= size;
        System.out.println("Media: " + media);
        
        double mediana = 0;
        if (size % 2 == 0) {
            mediana = (numeros[size/2] + numeros[size/2 - 1]) / 2.0;
        } else {
            mediana = numeros[size/2];
        }
        System.out.println("Mediana: " + mediana);
        
        
        double varianza = 0;
        for (int i = 0; i < size; i++) {
            varianza += Math.pow(numeros[i] - media, 2);
        }
        varianza /= size;
        System.out.println("Varianza: " + varianza);
        
        
        double desviacion = Math.sqrt(varianza);
        System.out.println("Desviación estándar: " + desviacion);
        
        
        int moda = numeros[0];
        int repeticionesModa = 1;
        int repeticionesActuales = 1;
        for (int i = 1; i < size; i++) {
            if (numeros[i] == numeros[i-1]) {
                repeticionesActuales++;
            } else {
                if (repeticionesActuales > repeticionesModa) {
                    moda = numeros[i-1];
                    repeticionesModa = repeticionesActuales;
                }
                repeticionesActuales = 1;
            }
        }
        if (repeticionesActuales > repeticionesModa) {
            moda = numeros[size-1];
        }
        System.out.println("Moda: " + moda + " (repetida " + repeticionesModa + " veces)");
    }
}
