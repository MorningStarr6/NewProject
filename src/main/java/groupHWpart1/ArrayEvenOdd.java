package groupHWpart1;

public class ArrayEvenOdd {
    public static void main(String[] args) {

        int[][] numbers={
                {32,44,33,21,36},
                {14,6,35,47,28,31}

        };
        for (int r=0;r<numbers.length;r++){
            for (int c=0; c<numbers[r].length; c++){
                if (numbers[r][c]%2==0){
                    System.out.print(numbers[r][c]+" ");
                }

            }
        }

    }
}
