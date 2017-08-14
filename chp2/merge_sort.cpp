//g++  5.4.0

#include <iostream>

void printArr(int* arr, int size){
     for(int i=0; i<size; i++){
        std::cout<<arr[i]<<" ";
    }

    std::cout<<std::endl;
}

int main(){
    int arr[] = {7,3,5,12,96,8};
    int size = 6;
    
    printArr(arr, size);
   
    for(int i=1; i<size; ++i){
        int val = arr[i];
        int j = i-1;
        
        while(j>=0 && val < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        
        arr[j+1] = val;
        
    }
    
    
    printArr(arr, size);
    return 0;
}