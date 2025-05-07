public class Questao6 {
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        int c = 1;
        int i = 1;
        while ( c <= 150) {
            System.out.println( i + "° termo da sequencia fibonacci: " + c);
            b = a + c;
            c = a;
            a = b;
            i++;
        }
    }   
}
