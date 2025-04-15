public class Pessoa {
    protected String nome;
    protected String telefone;

    Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }

    public String toString() {
        return "\nNome: " + getNome() + "\nTelefone: " + getTelefone();
    }
}