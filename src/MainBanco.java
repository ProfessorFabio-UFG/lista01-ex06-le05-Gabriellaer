public class MainBanco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(0, null, null, null, null);
        Cliente c2 = new Cliente(0, null, null, null, null);
        Cliente c3 = new Cliente(0, null, null, null, null);
        Gerente g1 = new Gerente(null, 0, null, null, 0, null, null, null);
        Funcionario f1 = new Funcionario(null, null, 0, null, null, null);
        //setters do funcianario
        System.out.println("------------------------------------------------------------");
        System.out.println("Funcionario do Caixa: ");
        f1.setHorario("17:00 as 23:00");
        f1.setTelefone("44444444444");
        f1.setSalario(1200);
        f1.aumento(0.1);
        f1.setCpf("7878787878");
        f1.setNome("John Mars");
        f1.setMatri("12345");
        //Mostrando informações do Funcionario
        System.out.println(f1.toString());
        System.out.println(f1.anualSalario());
       //setters gerente
        System.out.println("------------------------------------------------------------");
        System.out.println("Funcionario Gerente: ");
        g1.setHorario("18:00 as 00:00");
        g1.setTelefone("959595959");
        g1.setBonificacao(0.2);
        g1.setSalario(1200);
        g1.setTipoPessoa("PF");
        g1.setMatri("54321");
        g1.setNome("Gao Mao");
        g1.setCpf("2222");
        //Mostrando informações do Gerente
        System.out.println(g1.toString());
        System.out.println(g1.anualSalario());
        //setters do cliente 1
        System.out.println("------------------------------------------------------------");
        System.out.println("Cliente: ");
        c1.setIdade(18);
        c1.setCpf("7777777");
        c1.setNome("Gabriel");
        c1.setTelefone("88888888888");
        c1.desativar();
        //Mostrando informações do Cliente 1
        System.out.println(c1.toString());
        //setters do cliente 2
        System.out.println("------------------------------------------------------------");
        System.out.println("Cliente: ");
        c2.setIdade(99);
        c2.setCpf("9999999");
        c2.setNome("Gabriel Marques");
        c2.setTelefone("898989898989");
        //Mostrando informações do Cliente 2
        System.out.println(c2.toString());
        //setters do cliente 3
        System.out.println("------------------------------------------------------------");
        System.out.println("Cliente: ");
        c3.setIdade(39);
        c3.setCpf("39393999");
        c3.setNome("Joao Marques");
        c3.setTelefone("98989898989");
        //Mostrando informações do Cliente 3
        System.out.println(c3.toString());
    }
}
