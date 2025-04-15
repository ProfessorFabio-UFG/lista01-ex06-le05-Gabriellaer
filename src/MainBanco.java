public class MainBanco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(0, null, null, null, null);

        c1.setIdade(18);
        c1.setStatus("A");
        c1.setCpf("7777777");
        c1.setNome("Gabriel");
        c1.setTelefone("88888");
        System.out.println(c1.toString());
    }
}
