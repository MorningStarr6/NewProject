package groupHWpart1;

public class ArrayEvenOddSum {
    public static void main(String[] args) {

        int[][] numbers={
                {28, 34, 67, 22},
                {11,23,44,12,23},
        };
        int even=0;
        int odd=0;

        for (int r=0; r<numbers.length; r++){
            for (int s=0; s<numbers[r].length; s++){
                if (numbers[r][s]%2==0){
                    even=numbers[r][s]+even;
                }else{
                    odd=numbers[r][s]+odd;
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
