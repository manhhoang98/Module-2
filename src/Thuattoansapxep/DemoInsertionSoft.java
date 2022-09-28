package Thuattoansapxep;

import java.util.Arrays;

public class DemoInsertionSoft {
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            int x = list[i];
            int k ;
            for(k= i-1; k>=0   && list[k] > x;k--){
              list[k+1]=list[k];
            }
            list[k+1]= x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,2,6,4,6};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
