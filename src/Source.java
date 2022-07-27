public class Source {
    public static void main(String[] args) {
    int value = 1900;
        System.out.println(century(value)==19);
    }
    public static int century(int number) {
       return (number%10==0 && number%100==0)? number/100 : number/100+1;
    }
}
