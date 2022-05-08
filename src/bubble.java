
class bubble {
    static void bubbleSortSolution(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int arrayForSort[] ={5,608,35,2,405,320,50,55,102,-2,-100};

        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arrayForSort.length; i++){
            System.out.print(arrayForSort[i] + " ");
        }
        System.out.println();

        bubbleSortSolution(arrayForSort);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arrayForSort.length; i++){
            System.out.print(arrayForSort[i] + " ");
        }

    }
}