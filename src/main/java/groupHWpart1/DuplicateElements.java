package groupHWpart1;

public class DuplicateElements {
    public static void main(String[] args) {
        String[] words={"Array","Int","Char","Loop","Variable","Int"};

        for (int i=0; i< words.length; i++){
            for (int a=i+1;a< words.length;a++){ //This was tricky i been using a=0,a=1
                if (words[i]==words[a]){
                    System.out.println(words[i]);
                }


            }

        }

    }
}

