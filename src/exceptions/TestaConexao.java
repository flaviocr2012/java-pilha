package exceptions;

public class TestaConexao {

    public static void main(String[] args) {

        try (Conexao c = new Conexao()) {
            c.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }
    }
}

//        Conexao c = null;
//        try {
//             c = new Conexao();
//            c.leDados();
//        } catch(IllegalStateException ex) {
//            System.out.println("Deu erro na conexão");
//        } finally {
//            c.fecha();
//        }

// quando usar o try é necessário ter ou catch ou finally.