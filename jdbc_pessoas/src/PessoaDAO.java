//Data access object
public class PessoaDAO {
    public void cadastrar(Pessoa p) throws Exception {
        //1. Especificar o comando SQL (Insert)
        var sql = 
            "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?,?,?)";
        //2. Estabelecer uma conexao ao banco
        var conexao = ConnectionFactory.conectar();
        //3. Preparar o commando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexao
        ps.close();
    }

    public void apagar () throws Exception{
        var sql = 
        "DELETE FROM tb_pessoa WHERE (cod_pessoa)";
        var conexao = ConnectionFactory.conectar();
        var ps = conexao.prepareStatement(sql);
        ps.Int(1, ps.getCod_Pessoa());
        ps.execute();
        ps.close();
    }
}
