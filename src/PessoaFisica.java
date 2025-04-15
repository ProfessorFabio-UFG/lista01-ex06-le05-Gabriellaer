public class PessoaFisica extends Pessoa {
    protected String cpf;

    PessoaFisica(String cpf, String nome, String telefone){
        super(nome, telefone);
        this.cpf = cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return "\nCPF: " + getCpf();
    }
}
