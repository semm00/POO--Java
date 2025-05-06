public class Questao5 {
    public static void main(String[] args) {
        int i = 1;
        for (i=1; i<31; i++) {
            long k = 0;
            long fatorial = 1;
            while ( k != i) {
                k++;
                fatorial = fatorial * k;
            }
            System.out.println("O fatorial de " + i + " é: " + fatorial); 
        }       
    }
}

// com int tem um valor maximo por isso não é possivel calcular o valor de alguns fatoriais,
// o que não acontece com long, que tem um valor máximo maior
