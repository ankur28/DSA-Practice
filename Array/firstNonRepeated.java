import java.util.Scanner;

public class firstNonRepeated {
    public static void main(String[] args) {
        System.out.println( solution());
    }

    public static  String  solution(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length];
        boolean isDupeFound = false;
        int length = arr.length;
        int count = 0;

        for(int i=0; i < length ; i++){
            for(int j = 0; j< length  ; j++){

                if( i != j) {
                    if (arr[i] != arr[j]) {
                        isDupeFound = false;
                    } else {
                        isDupeFound = true;
                        break;
                    }
                }
            }
            if(!isDupeFound){
                arr2[count] = arr[i];
                count++;
                isDupeFound = false;
            }
        }

        if (count > 0) {
            return String.valueOf(arr2[0]);
        } else {
            return "";
        }

    }
}
