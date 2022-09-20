public class sumofprime {
    public static void main(String[] args){
        int i=2,j,c=0,s=0;
        while(i<12) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
               if (c == 2) {
                    s=s+i;
                }
            }
            i++;
        }
        System.out.println(s);
    }
}
