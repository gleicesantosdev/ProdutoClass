public class Main {
    public static void main(String[]args){
        try {
            Produto produto1 = new Produto(1, "Produto A", 10);
            // cria produto c valor nao nulo

            System.out.println("Produto 1: " + produto1);

            // teste p/ produtos nulos com o IllegalargumentException
            Produto produto2 = new Produto(0, "", -7.0);

            System.out.println("Produto 2: " + produto2);
        } catch (IllegalArgumentException e) {
            //catch é usado para exceções do tipo do illegal. se tiver exceção no try, ele roda no catch
            //pega o erro e apresenta mensagem de erro
            System.out.println("Erro:" + e.getMessage());
            //e.getMessage() é usado para obter a mensagem de erro associada a essa exceção.
        }
    }
}