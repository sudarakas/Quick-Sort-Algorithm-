/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NanoX
 */

 /*
   * Index No : UWU/CST/16/045
   * Name : S.Y.B.Senevirathne
  */

public class quickSort {
    
    public int partition(int inArray[],int low,int high){
        
        int pivot = inArray[low];
        int start = low;
        int end = high;
        
        while(start<end){
            while(inArray[start] <= pivot && start<end){
                start++;
            }
            while(inArray[end] > pivot){
                end--;
            }
            if(start<end){
                int temp = inArray[start]; 
		inArray[start] = inArray[end]; 
		inArray[end] = temp;
            }
        }
        inArray[low] = inArray[end];
        inArray[end] = pivot;
        return end;
    }
    
    public void sort(int inArray[],int low,int high){
        if(low<high){
            int location = partition(inArray, low, high);
            sort(inArray, low, location-1);
            sort(inArray, location+1, high);
        }
    }
    
    public static void main(String[] args) {
        
        int[] unsortArray = {10,15,23,5,2,45,98,65,14,1,8};
        int len = unsortArray.length;
        
        quickSort testCase =  new quickSort();
        
        testCase.sort(unsortArray, 0, len-1);
        for (int i = 0; i < len; i++) {
            System.out.print(" "+unsortArray[i]);
        }
        System.out.println("");
    }
    
}
