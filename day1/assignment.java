import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /*
        //reverse a string
        System.out.println("enter the string");
        String a;
        a=sc.nextLine();
        System.out.println(a);
        System.out.println(rev(a));

        */
        //swap numbers
        /*System.out.println("enter two number");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        swap(a,b);

         */
        //fibonacci series
       /* System.out.println("enter no of terms");
        int n=sc.nextInt();
        fibo(n);
        */
        //palindrome of string
       /* String s;
        System.out.println("enter a string");
        s=sc.nextLine();
        palin(s);

        */
        //sort an array
      /* int n;
        System.out.println("length of array");
        n=sc.nextInt();
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]= sc.nextInt();
        }
        sort(n,b);

       */
        String s,a,b;
        System.out.println("enter string");
        s=sc.nextLine();
        System.out.println("enter char");
        a=sc.nextLine();
        b=sc.nextLine();
        swapchar(s,a,b);



    }

    public static String rev(String a) {
        char c;
        String r="";
        for(int i=0;i<a.length();i++){
            c=a.charAt(i);
            r=c+r;
        }
        return r;
    }
    public static void swap(int a, int b){
        int temp;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is"+a+ "and b is"+b);
    }
    public static void fibo(int n){
        int a=-1;
        int b=1;
        n=n/2;
        if(n%2!=0)
            n=n+1;
        for(int i=0;i<n;i++){
            a=a+b;
            b=a+b;
            System.out.println(a);
            System.out.println(b);
        }

    }
    public static void palin(String s){
        String rev="";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            rev=rev+c;
        }
        if(s.equals(rev)){
            System.out.println("it is a palindrome");
        }
        else
            System.out.println("not a palindrome");

    }
    public static void sort(int n, int[] b){
        int temp=0;
        try{
            for(int i=0;i<n;i++){
                for(int j=i+1;i<=n;j++){
                    if(b[i]>b[j]) {
                        temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
    public static void swapchar(String s, String a, String b){
        String ch;
        for(int i=0;i<s.length();i++){
            ch= String.valueOf(s.charAt(i));
            if(ch.equals(a)) {
                ch = b;
            }
        }
        System.out.println(s);

    }



}
