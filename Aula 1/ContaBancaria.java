public class ContaBancaria {
    private String numero;
    private String titular;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    private double saldo;
    public double sacar() {
        return this.saldo;
    }
    public double depositar() {
        return this.saldo;
    }
}
