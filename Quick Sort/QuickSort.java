
import javax.swing.JOptionPane;

public class QuickSort {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño del arreglo"));
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Elemento de la posicion "+i));
        }

        System.out.println("Vector No Ordenado");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        QuickSort sort = new QuickSort();
        sort.Ordenar(0, a.length-1, a);
        System.out.println("Vector Ordenado");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public void Ordenar(int primero, int ultimo, int a[]) {

        int i=primero,j=ultimo, central = a[(primero+ultimo)/2];

        do {
            while (central>a[i]) {
                i++;
            }
            while (central<a[j]) {
                j--;
            }
            if (i<=j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }
        } while (i<=j);
        if (primero<j) {
            Ordenar(primero, j, a);
        }
        if (ultimo>i) {
            Ordenar(i, ultimo, a);
        }
    }

}