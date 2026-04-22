public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros = {10, 0 , -5 , 5 , 15 , 2};
        // runBubbleSort();

    }

    public static void runBubbleSort(){
        // System.out.println("metodo burbuja");
        // int[] numeros = {-5, 10, 2, 0 , 7}; 
        // //instancia de la clase 
        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.sortDscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.printArreglo(numeros);

        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros , true);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros,false);
        // bubbleSort.printArreglo(numeros);


    }
    public static void runBubbleSortAvz(){
        int[] array = new int[]{9,2,3,0,8,5};
        int[] numeraso ={9,2,3,0,8,5};
        //instanciar la clase 
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.printArray(numeraso);
        bSortAvz.sort(true);
        bSortAvz.printArray(numeraso);
        
    }
    
}
