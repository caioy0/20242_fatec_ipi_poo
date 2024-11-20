public class App {
    public static void main(String[] args) throws Exception {
        var p = new Pessoa();
        p.setNome("Joao");
        p.setFone("32112321313");
        p.setEmail("joao@email.com");
        var dao = new PessoaDAO(); //Data acess object
        dao.apagar(p);
    }
}
