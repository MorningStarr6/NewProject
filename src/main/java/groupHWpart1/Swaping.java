package groupHWpart1;

public class Swaping {
    public static void main(String[] args) {

        int num1=1;
        int num2=2;

        System.out.print("Old "+num1+" "+num2);

        if (num1==1){
            num1=num2;
        }if (num2==2){
            num2--;
        }
        System.out.println();
        System.out.print("New "+num1+" "+num2);
    }
}
