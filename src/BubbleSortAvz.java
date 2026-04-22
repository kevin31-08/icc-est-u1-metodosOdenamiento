

public class BubbleSortAvz {



//variable global 
    int[] array; //no tiene valor -donde le doy el valor 

    public BubbleSortAvz(int[] arreglo){
        //1ro darle valor directo
        // array = new int[]{10,5,0};
        //2da forma darle valor en base a parametros 
        this.array = arreglo;

    }
    public void sort(boolean asc){
        int tam = array.length;
        boolean huboIntercamnio;
        int contComparaciones = 0;
        for(int i = 0 ; i<tam-1;i++){
            huboIntercamnio=false;
            for(int j=0; j<tam -1 -i; j++){
                contComparaciones++; 
                if(array[j]<array[j+1]){
                    huboIntercamnio=true;
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j+1]=aux;
                }

            }
            if(!huboIntercamnio){
                break;
            }
            System.out.println("comparaciones totales: "+ contComparaciones);
        }
    }
    

    public void printArray(int[] array) {
     for(int i : array){
            System.out.print(i + ", ");
        }
        System.out.println();    throw new UnsupportedOperationException("Not supported yet.");
    }

    

    
    
   
    
}
