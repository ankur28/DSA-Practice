package Array;

public class ReverseNumber {
    public static void main(String [] args){
        boolean result = reverse(35);
        System.out.println(result);
    }
    public static boolean reverse(int x) {

        int temp = 0;
        int num = x;

        while( num != 0){

            temp = temp * 10 + num%10;
            num = num /10;
        }

        if(temp == x ){
            return true;
        }
        else{
            return false;
        }

    }
}
