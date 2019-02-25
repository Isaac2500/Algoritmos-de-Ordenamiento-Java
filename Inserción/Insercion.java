import javax.swing.JOptionPane;

public class Insercion {
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño del arreglo"));
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor en posicion "+i));    
        }
        System.out.println("Vector no Ordenado");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        Insercion insertion = new Insercion();

        insertion.Ordenar(a, n);

        System.out.println("Vector Ordenado");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public void Ordenar(int a[], int n) {
        
        int aux,j,i;

        for (i = 1; i < n; i++) {
            aux = a[i];
            for (j = i-1; j >= 0 && a[j]>aux; j--) {
                a[j+1] = a[j];
                a[j] = aux;
            }
            
        }

    }
}