import java.util.Scanner;

import javax.swing.JOptionPane;

public class HeapSort {

    public static void main(String args[]) {

        //Scanner entrada = new Scanner(System.in);

        //System.out.print("Ingresar dimension del arreglo:");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Dimension del arreglo"));//entrada.nextInt();
        HeapSort ob = new HeapSort();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

           // System.out.print("Ingresar numero:");
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Numero"));//entrada.nextInt();

        }

        ob.sort(arr);

        System.out.println("Arreglo ordenado");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void sort(int arr[]) {

        int n = arr.length;

        //Construye el monticulo
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
       
        //Extrae uno a uno un elemento del monticulo
        for (int i = n - 1; i >= 0; i--) {

            //Mueve el actual nodo raiz al final
            int temp = arr[0];

            arr[0] = arr[i];

            arr[i] = temp;
        //Llama max heapify en el monticulo reducido
            heapify(arr, i, 0);

        }

    }

    void heapify(int arr[], int n, int i) {

        int largest = i; 

        int l = 2 * i + 1; 

        int r = 2 * i + 2; 

        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }
        

        if (r < n && arr[r] > arr[largest]){
            largest = r;
        }
        

        if (largest != i) {

            int swap = arr[i];

            arr[i] = arr[largest];

            arr[largest] = swap;

            heapify(arr, n, largest);

        }

    }
}
