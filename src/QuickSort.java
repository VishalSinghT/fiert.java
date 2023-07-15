public class QuickSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");

        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si,int ei){
           if(si>=ei){
               return ;

           }

         int pidx=    partition(arr,si,ei);
          quickSort(arr, si, pidx-1);//left
          quickSort(arr, pidx+1, ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;//to make place for ele small then pivot
        for (int j = si; j < ei; j++) {
            if(arr[j] <=pivot){
                i++;
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]=temp;
            }

        }
        i++;int temp = pivot;
        arr[ei]= arr[i];
        arr[i]=temp;
return i;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,9,-2,7,1,6};
        quickSort(arr ,0,arr.length-1);
        printArr(arr);

    }
}
