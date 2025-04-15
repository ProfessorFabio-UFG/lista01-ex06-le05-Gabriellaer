public class Funcionario extends PessoaFisica {
    protected String matri;
    protected String horario;
    protected double salario;

    Funcionario(String matri, String horario, doubl salario, String cpf, String nome, String telefone){
        super(cpf, nome, telefone);
        this.matri = matri;
        this.horario = horario;
        this.salario = salario;
    }
    public void setMatri(String matri) {
        this.matri = matri;
    }
    public String getMatri() {
        return matri;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public String toString(){
        return "\nMatricula: " + getMatri() + " Horario: " + getHorario() + " Salario: " + getSalario() + "\n";
    }
}
