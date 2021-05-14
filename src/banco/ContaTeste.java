package banco;

public class ContaTeste {

    public static void main(String[] args) {
        Conta conta = new Conta(-111, 222);
        conta.setAgencia(111);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }


}
