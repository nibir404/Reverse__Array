package com.company;
public class Main {

    public static void main(String[] args) {
	   int arr[] = {10,3,9,4,6,3};
        reverse(arr,arr.length);
    }

    static void reverse(int a[], int n){
        int b[] = new int[n];
        int j= n;
        for (int i=0 ; i<n ; i++){
            b[j-1] = a[i];
            j = j-1;
        }

        System.out.println("reverse array : ");
        for (int k= 0; k<n; k++)
            System.out.println(b[k]);
    }
}
