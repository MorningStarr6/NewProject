package groupHWpart1;

public class Temperature {
    public static void main(String[] args) {

        int[] temperatures= {23,28,25,27,24,29,24};

        int highest=temperatures[0];
        int lowest=temperatures[0];

        for (int temp:temperatures){
            if (temp>highest){
                highest=temp;
            }
            if (temp<lowest){
                lowest=temp;
            }
        }
        System.out.println("Highest temperature of week is "+highest+"C°");
        System.out.println("Lowest temperature of week is "+lowest+"C°");
    }
}
