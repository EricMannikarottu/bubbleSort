import java.util.Scanner;

public class bubblesort { 
    
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();



        int arr[]=new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        //bubble sort

        for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
           printArray(arr);
           sc.close();
    }
    
}

//time complexity of this sort is O(n^2)
