public class OneToN {

    public static void main(String[] args) {
        String S = "NAANAAXNABABYNNBZ";
        int [] A = new int[26];
        for(int i = 0 ; i< S.length(); i++){
            A[S.charAt(i) - 'A']++;
        }
        //calculate the word BANANA in the string
        int count = 0;
        int a = A[0];
        int b = A[1];
        int n = A[13];

        while( a > 2 && b > 0 && n> 1){
            count++;
            b--;
            n -= 2;
            a -= 3;
        }
        System.out.println( count);
    }
}
