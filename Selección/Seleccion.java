import javax.swing.JOptionPane;

public class Seleccion{

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de elementos a ordenar"));
        int a[] = new int[n];

        for(int i = 0; i<n ;i++){
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor en la posicion "+i+""));
        }
        System.out.println("Vector No Ordenado");
        for(int j=0;j<n;j++){
          System.out.println(a[j]);
        }

        Seleccion metodo = new Seleccion();
        metodo.Ordenamiento(a, n);

        System.out.println("Vector Ordenado");
        for(int j=0;j<n;j++){
          System.out.println(a[j]);
        }
    }


    public void Ordenamiento(int a[],int n) {

        int minimo, posicion, aux;

        for (int i = 0; i < a.length; i++) {
            minimo = a[i];
            posicion = i;
          for(int j = i+1; j<a.length; j++ ){
              if (a[j]<minimo) {
                  minimo = a[j];
                  posicion = j;
                }
          }
          if(posicion != i){
                aux = a[i];
                a[i] = a[posicion];
                a[posicion] = aux;
          }
        }
    }
}
