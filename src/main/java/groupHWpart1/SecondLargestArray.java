package groupHWpart1;

public class SecondLargestArray {
    public static void main(String[] args) {

        int[] number = {8, 4, 12, 22, 17};
        int largest = number[0];
        int largest2 = number[1];

        if (largest2>largest){
            int large1=largest;
            largest=largest2;
            largest2=large1;
        }
        for (int i=2;i< number.length;i++){
            if (number[i]>largest){
                largest2=largest;
                largest=number[i];
            } else if (number[i]>largest2) {
                largest2=number[i];
                
            }
        }
        System.out.println("The second largest number is :"+largest2);

    }
    }
