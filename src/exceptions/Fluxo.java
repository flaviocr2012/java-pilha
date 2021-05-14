package exceptions;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            String message = ex.getMessage();
            System.out.println("Exception " + message);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Início do metódo 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Início do metódo 2");
        throw new MinhaExcecao("deu muito errado");
    }
//        System.out.println("Fim do método 2");
}

