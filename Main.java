package Control;
//Write a method in Java to get the difference //
// between the largest and smallest values in an array of integers.//
// The length of the array must be 1 and above.//

/* Write a method in Java to find
//the smallest and second smallest elements of a given array and print it in the console */



public class Main {


    public static void main(String[] args) {
      int[] numList={1,2,3,4};
        System.out.println("La diferencia es " + difference(numList));


    }


public static int difference(int[] numList){

        if(numList.length>=1){
            //si la condicion
            int maximum=numList[0];
            int minimum=numList[0];

            for(int i=0; i < numList.length; i++){
                if(numList[i] > maximum){
                    maximum = numList[i];
                }
                if (numList[i]<minimum) {
                    minimum = numList[i];
                }
            }

            return (maximum -minimum);

        }
        else{
            //si la condicion no es correcta
            return (0);
        }



}
}


