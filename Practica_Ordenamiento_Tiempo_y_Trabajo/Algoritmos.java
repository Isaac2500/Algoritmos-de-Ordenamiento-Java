import javax.swing.JOptionPane;


public class Algoritmos{
    private static int pasos;
    public static void main(String[] args) {
        
        /*Variables*/
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño del arreglo"));
        int a[] = new int[n];
        int aux[] = new int[n];

        long time_start,time_finish;

        /*A partir de aqui se empieza a realizar las ordenaciones*/ 
        System.out.println("*------------Burbuja Menor a Mayor----------------*");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenarPorBurbuja_Menor_Mayor(a,n);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------Burbuja Mayor a Menor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenarPorBurbuja_Mayor_Menor(a,n);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------Insercion Menor a Mayor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenarPorInsercion_Menor_Mayor(a,n);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------Insercion Mayor a Menor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenarPorInsercion_Mayor_Menor(a,n);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------Seleccion Menor a Mayor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenamientoPorSeleccion_Menor_Mayor(a,n);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------Seleccion Mayor a Menor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenamientoPorSeleccion_Mayor_Menor(a,n);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------QuickSort Menor a Mayor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenarPorQuickSort_Menor_Mayor(0,(a.length-1),a);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            pasos = 0;
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");

        }

        System.out.println("*------------QuickSort Mayor a Menor----------------*");

        for (int i = 0; i < 3; i++) {
            System.out.println("________________________");
            System.out.println("|Ronda| Tiempo | Pasos |");
            System.out.println("------------------------");
            for (int j = 0; j < n; j++) {
                a[j]= (int) (Math.random()*1000);
                aux[j] = a[j];
            }
            
            System.out.print(" "+(i+1)+" ");
            time_start = System.nanoTime();
            OrdenarPorQuicksort_Mayor_Menor(0,(a.length-1),a);
            time_finish = System.nanoTime();
            System.out.print("     "+(time_finish - time_start)+"     ");
            System.out.print(pasos);
            System.out.println("\n------------------------");
            System.out.print("\nVector No Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(aux[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("Vector Ordenado = { ");
            
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]+", ");
            }
            System.out.println("}\n"); 
            System.out.print("\n");
        }
 
    }   
    
    //------------------Metodo Burbuja--------------------------------------
    // Menor a Mayor
    public static void OrdenarPorBurbuja_Menor_Mayor(int a[], int n)  {
        int aux;
        pasos = 0;
        for(int i = 0 ;i<n-1;i++){
            for(int j = 0;j<n-1;j++){
                if (a[j]>a[j+1]) {
                    pasos++;
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
       
    }
    // Mayor a Menor
    public static void OrdenarPorBurbuja_Mayor_Menor(int a[], int n)  {
        int aux;
        pasos = 0;
        for(int i = 0 ;i<n-1;i++){
            for(int j = 0;j<n-1;j++){
                if (a[j]<a[j+1]) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                    pasos++;
                }
            }
        }
    }
    //----------------------------------------------------------------------

    //------------------Metodo Por Insercion--------------------------------
    // Menor a Mayor
    public static void OrdenarPorInsercion_Menor_Mayor(int a[], int n) {
        
        int aux,j,i;
        pasos = 0;

        for (i = 1; i < n; i++) {
            aux = a[i];
            for (j = i-1; j >= 0 && a[j]>aux; j--) {
                a[j+1] = a[j];
                a[j] = aux;
                pasos++;
            }
            
        }

    }

    // Mayor a Menor
    public static void OrdenarPorInsercion_Mayor_Menor(int a[], int n) {
        
        int aux,j,i;
        pasos = 0;
        for (i = 1; i < n; i++) {
            aux = a[i];
            for (j = i-1; j >= 0 && a[j]<aux; j--) {
                a[j+1] = a[j];
                a[j] = aux;
                pasos++;
            }
            
        }

    }
    //--------------------------------------------------------------------

    //---------------------Metodo Por Seleccion---------------------------
    // Menor A Mayor
    public static void OrdenamientoPorSeleccion_Menor_Mayor(int a[],int n) {

        int minimo, posicion, aux;
        pasos = 0;

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
                pasos++;
          }
        }
    }

    //Mayor A Menor
    public static void OrdenamientoPorSeleccion_Mayor_Menor(int a[],int n) {

        int minimo, posicion, aux;
        pasos = 0;

        for (int i = 0; i < a.length; i++) {
            minimo = a[i];
            posicion = i;
          for(int j = i+1; j<a.length; j++ ){
              if (a[j]>minimo) {
                  minimo = a[j];
                  posicion = j;
                }
          }
          if(posicion != i){
                aux = a[i];
                a[i] = a[posicion];
                a[posicion] = aux;
                pasos++;
          }
        }
    }
    //----------------------------------------------------------------------

    //-------------------------Metodo QuickSort-----------------------------
    // Menor a Mayor
    public static void OrdenarPorQuickSort_Menor_Mayor(int primero, int ultimo, int a[]) {

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
                pasos++;
            }
            
        } while (i<=j);
        
        if (primero<j) {
            OrdenarPorQuickSort_Menor_Mayor(primero, j, a);
        }
        if (ultimo>i) {
            OrdenarPorQuickSort_Menor_Mayor(i, ultimo, a);
        }
    }
    // Mayor a Menor
    public static void OrdenarPorQuicksort_Mayor_Menor(int primero, int ultimo, int a[]) {

        int i=primero,j=ultimo, central = a[(primero+ultimo)/2];
    

        do {
            while (central<a[i]) {
                i++;
            }
            while (central>a[j]) {
                j--;
            }
            if (i<=j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
                pasos++;
            }
        } while (i<=j);
        if (primero<j) {
            OrdenarPorQuicksort_Mayor_Menor(primero, j, a);
        }
        if (ultimo>i) {
            OrdenarPorQuicksort_Mayor_Menor(i, ultimo, a);
        }
    }

   
    
}