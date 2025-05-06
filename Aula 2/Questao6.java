public class Questao6 {
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        int c = 1;
        for (int i = 1; i < 13; i++){
            System.out.println( i + "° termo da sequencia fibonacci: " + c);
            b = a + c;
            c = a;
            a = b;
        }
    }
}
