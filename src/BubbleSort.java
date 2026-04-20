public class BubbleSort {
    public BubbleSort(){
        System.out.println("se creo en la clase constructor ");
        // constructor 
        public void sortAscendente(int numeros[]) {
            for(int i = 0 ; i < numeros.length; i++){
                for(int j = i + 1 ;j < numeros.length ; j++){
                    //cinparacion 
                    if(numeros[i] < numeros[j]){
                        // si se cumple realizamos el intercambio 
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;

                    }

                }

            }
        }
    }
    public void sortDscendente(int[] numeros) {

        for(int i = 0 ; i < numeros.length; i++){
                for(int j = i + 1 ;j < numeros.length ; j++){
                    //cinparacion 
                    if(numeros[i] < numeros[j]){
                        // si se cumple realizamos el intercambio 
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;

                    }

                }

            }

    }

    public void printArreglo(int[] numeros) {
        for(int i : numeros){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    //
}
