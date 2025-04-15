public class Gerente extends Funcionario {
    protected String tipoPessoa;
    protected double bonificacao;

    Gerente(String tipoPessoa, double bonificacao, String matri, String horario, double salario, String cpf, String nome, String telefone){
        super(matri, horario, null, cpf, nome, telefone);
        this.tipoPessoa = tipoPessoa;
        this.bonificacao = bonificacao;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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

    public String toString(){
        return "\nTipo de Pessoa(PF ou PJ): " + getTipoPessoa() + " Bonificacao: " + getBonificacao();
    }
}
