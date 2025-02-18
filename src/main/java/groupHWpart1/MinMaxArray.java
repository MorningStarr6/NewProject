package groupHWpart1;

public class MinMaxArray {
    public static void main(String[] args) {

        int[] num={8,12,15,20,11,2,24};

        int min=num[0];
        int max=num[0];

        for (int n:num){
            if (n<min){
                min=n;
            }
            if (n>max){
                max=n;
            }
        }
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }
}