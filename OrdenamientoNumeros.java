import java.util.Scanner;

public class OrdenamientoNumeros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random() * 100; 
        }
        
        System.out.println("Arreglo original:");
        imprimirArreglo(arr);
        
      
        double[] arrBurbuja = arr.clone();
        burbuja(arrBurbuja);
        System.out.println("\nArreglo ordenado con burbuja:");
        imprimirArreglo(arrBurbuja);
        
        
        double[] arrInsercion = arr.clone();
        insercion(arrInsercion);
        System.out.println("\nArreglo ordenado con inserción:");
        imprimirArreglo(arrInsercion);
        
        
        double[] arrSeleccion = arr.clone();
        seleccion(arrSeleccion);
        System.out.println("\nArreglo ordenado con selección:");
        imprimirArreglo(arrSeleccion);
        
    
    }
    
  
    public static void imprimirArreglo(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
   
    public static void burbuja(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    
    public static void insercion(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    
    public static void seleccion(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
           
        double temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}



    
    
}
}