package banco;

public class Conta {

    private int agencia;
    private int numero;

    public Conta(int agencia, int numero) {

        if(agencia < 1) {
            throw new IllegalArgumentException("Agência inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Número da conta Inválida");
        }

        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
