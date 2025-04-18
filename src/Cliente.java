public class Cliente extends PessoaFisica {
    protected int idade;
    protected String status;

    Cliente(int idade, String status, String cpf, String nome, String telefone){
        super(cpf, nome, telefone);
        this.idade = idade;
        if(status == null) {
        	this.status = "Ativo";
        }else {
        	this.status = status;
        }
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    
    public void desativar() {
    	if(status == "Ativo") {
    		this.status = "Inativo";
    	}else {
    		this.status = "Inativo";
    	}
    }
    public String toString(){
        return "Nome: " + getNome() + " CPF: "+ getCpf() + " Telefone: " + getTelefone() + " Idade: " + getIdade() + " Status: " + getStatus();
    }
}
