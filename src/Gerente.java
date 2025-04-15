public class Gerente extends Funcionario {
    protected String tipoPessoa;
    protected double bonificacao;

    Gerente(String tipoPessoa, double bonificacao, String matri, String horario, double salario, String cpf, String nome, String telefone){
        super(matri, horario, salario, cpf, nome, telefone);
        this.tipoPessoa = tipoPessoa;
        this.bonificacao = bonificacao;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    @Override
    public void setSalario(double salario) {
        super.setSalario(salario * (1 + bonificacao));
    }
    public String getTipoPessoa() {
        return tipoPessoa;
    }
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    public double getBonificacao() {
        return bonificacao;
    }
    public String anualSalario(){
        String tmp;
        tmp = "Recibimento Anual: " + (getSalario() * 13);
        return tmp;
    }
    public String toString(){
        return "\nMatricula: " + getMatri() + " Nome: " + getNome() + " Tipo de Pessoa(PF ou PJ): " + getTipoPessoa() + " Bonificacao: " + getBonificacao() +
        " Salario: " + getSalario();
    }
}
