package com.chief;

public class Main {

    public static void main(String[] args) {
	Integer [] intArray={1,2,3,4,5,6};
    Double[] doubleArray={2.6,3.5,4.4,5.3,6.6};
    Character[] charArray={'J','A','V','A'};
    String[] stringArray={"SAD","BAD","CLAD","DAD","MAN"};

    displayArray(intArray);
        displayArray(stringArray);



    }
    static <Thing> void displayArray(Thing[] array){

        for (Thing x:array){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
