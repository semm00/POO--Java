public class Questao4 {
    public static void main(String[] args) {
        int i = 1;
        for (i=1; i<11; i++) {
            int k = 0;
            int fatorial = 1;
            while ( k != i) {
                k++;
                fatorial = fatorial * k;
            }
            System.out.println("O fatorial de " + i + " é: " + fatorial); 
        }       
    }
}
