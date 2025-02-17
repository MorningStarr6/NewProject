package groupHWpart1;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] numbers={12,15,24,19,22};
        int sum=0;

        for (int num:numbers){
            sum=sum+num;;
        }
        System.out.println(sum);
    }
}
