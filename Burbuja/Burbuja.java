import javax.swing.JOptionPane;

public class Burbuja {

  public static void main(String[] args) {
      int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de elementos del arreglo"));
      int a[] = new int[n];
      
      for (int i = 0; i < n; i++) {
          a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Elemento en la Posicion "+i));
      }

      System.out.println("Vector No Ordenado");
      for ( int j = 0; j < n; j++) {
        System.out.println(a[j]);
      }

      Burbuja bubble = new Burbuja();
      bubble.Ordenar(a, n);

      System.out.println("Vector Ordenado");
      for (int t = 0; t < n; t++) {
        System.out.println(a[t]);
      }
  }

  void Ordenar(int a[], int n)  {
      int aux;
      for(int i = 0 ;i<n-1;i++){
          for(int j = 0;j<n-1;j++){
              if (a[j]<a[j+1]) {
                  aux = a[j];
                  a[j] = a[j+1];
                  a[j+1] = aux;
              }
          }
      }
  }



}
