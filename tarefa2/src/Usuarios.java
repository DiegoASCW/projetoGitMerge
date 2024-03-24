public class Usuarios {

    private String nome;
    private int idade;
    private String cpf;
    private int alturaCM;
    private String telefone;

    public Usuarios(String nome, int idade, String cpf, int alturaCM, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.alturaCM = alturaCM;
        this.telefone = telefone;
    }

    public void imprimirUsuario(){
        System.out.printf("\n=-=-=-=-=\nNome: %s\nIdade: %d\nCPF: %s\nAltura: %d\nTelefone: %s\n=-=-=-=-=\n",
                this.nome, this.idade, this.cpf, this.alturaCM, this.telefone);
    }
}