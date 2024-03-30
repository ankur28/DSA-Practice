public class largestOddNumber {
    public static void main(String[] args) {
        largestOddNumber("10133890");
    }

    public static String largestOddNumber(String num) {
        String str = "";
        for(int i = num.length() - 1 ; i >= 0; i--){
            if( num.charAt(i) % 2 != 0 && i== num.length() - 1){
                return num;
            }
            else if(num.charAt(i) %2 != 0){
                str += num.substring(0,i + 1);
                break;
            }


        }return str;
    }
}
