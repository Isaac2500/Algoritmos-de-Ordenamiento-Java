import javax.swing.JOptionPane;

public class MergeSort{

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de Elementos del arreglo"));
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Elemento de la posicion "+i));
        }

        MergeSort mezcla = new MergeSort();
        System.out.println("Vector No Ordenado");
        mezcla.imprimir(a, n);

        mezcla.Merge_Sort(a, 0, n-1);

        System.out.println("Vector Ordenado");
        mezcla.imprimir(a, n);

    }

    public void imprimir(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public void Merge_Sort(int a[], int p, int r) {
        int q;

        if (p < r) {
            q = (p+r)/2;
            Merge_Sort(a, p, q);
            Merge_Sort(a, q+1, r);
            Merge(a, p, q, r);
        }
    }

    public void Merge(int a[],int p,int q, int r) {
        int tmp[] = new int[a.length];
        int x,y,z;

        x=z=p;
        y=q+1;

        while (x<=q && y<=r) {
            if (a[x]<=a[y]) {
                tmp[z++]=a[x++];
            } else {
                tmp[z++]=a[y++];
            }
        }

        while (x<=q) {
            tmp[z++]=a[x++];
        }

        while (y<=r) {
            tmp[z++]=a[y++];
        }

        System.arraycopy(tmp, p, a, p, r-p+1 );
    }
}