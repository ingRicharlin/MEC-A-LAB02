import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;
    
    public Carro(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getKilometraje() {
        return kilometraje;
    }
    
    public static void mergeSort(Carro[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    
    public static void merge(Carro[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        Carro[] L = new Carro[n1];
        Carro[] R = new Carro[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getKilometraje() <= R[j].getKilometraje()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void bubbleSort(Carro[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getKilometraje() > arr[j + 1].getKilometraje()) {
                    Carro temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de carros: ");
        int cantidadCarros = scanner.nextInt();
        Carro[] carros = new Carro[cantidadCarros];
        for (int i = 0; i < cantidadCarros; i++) {
            System.out.println("Ingrese los datos del carro " + (i + 1) + ":");
                  System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Modelo: ");
        String modelo = scanner.next();
        System.out.print("Color: ");
        String color = scanner.next();
        System.out.print("Kilometraje: ");
        int kilometraje = scanner.nextInt();
        carros[i] = new Carro(marca, modelo, color, kilometraje);
    }
    System.out.println("Carros sin ordenar:");
    for (Carro carro : carros) {
        System.out.println(carro.getMarca() + " " + carro.getModelo() + ", " + carro.getColor() + ", " + carro.getKilometraje() + " km");
    }
    System.out.println("Ordenar por kilometraje (1 = merge sort, 2 = bubble sort):");
    int opcion = scanner.nextInt();
    if (opcion == 1) {
        mergeSort(carros, 0, carros.length - 1);
    } else if (opcion == 2) {
        bubbleSort(carros);
    }
    System.out.println("Carros ordenados por kilometraje:");
    for (Carro carro : carros) {
        System.out.println(carro.getMarca() + " " + carro.getModelo() + ", " + carro.getColor() + ", " + carro.getKilometraje() + " km");
    }
}
}


    