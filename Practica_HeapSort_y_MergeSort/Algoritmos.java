public class Algoritmos{

   
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        long tiempoinicio, tiempofinal;
        Algoritmos obj = new Algoritmos();

        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random()*1000);
            b[i] = a[i];
        }

        tiempoinicio = System.nanoTime();
        obj.Merge_Sort(a, 0, 9);
        tiempofinal = System.nanoTime();

        System.out.println("Tiempo en Nano MergeSort: "+(tiempofinal-tiempoinicio));

        tiempoinicio = System.nanoTime();
        obj.sort(b);
        tiempofinal = System.nanoTime();

        System.out.println("Tiempo en Nano HeapSort: "+(tiempofinal-tiempoinicio));
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