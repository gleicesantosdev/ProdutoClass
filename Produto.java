public class  Produto{ //atributo privado
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Precisa ser maior do que zero");
            // throw new é quando um método recebe um argumento inválido
        }
        if (nome == null || nome.trim().isEmpty()) {
            // nome == null verifica se a variável nome é nula e || é um operador lógico
            //nome.trim() verifica após remoção de espaços em branco se a variavel está vazia
            // .isEmpty retorna um valor boolean se a var foi iniciada
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    //acesso aos atributos (getters e setters)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Precisa ser maior do que zero");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        this.preco = preco;
    }

    @Override
    // é uma forma de garantir que estamos na verdade sobrescrevendo um método e não criando um novo
    public String toString() {
        //Seu objetivo é trazer uma representação textual de uma instância de um objeto
        return "Produto [codigo= " + codigo + ", nome= " + nome + "preco= " + preco + "]";
    }
}




