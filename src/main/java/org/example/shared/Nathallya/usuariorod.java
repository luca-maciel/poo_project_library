public class usuariorod {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario ();
        usuario1.setNome("Louis");
        usuario1.setEndereco("Rua Augusto Cavalcante, Centro, N220 - Arcoverde-PE");
        usuario1.setTelefone("(87) 77988-5656");
        usuario1.setRg("PE-11.534.786");
        usuario1.setCpf("465.231.987-07");
        usuario1.setcadastro("JKL302U");
        usuario1.setdatacadastro("10/09/2025");
        usuario1.setdatanascimento("16/01/2006");

        System.out.println("---------- dados iniciais ----------");
        usuario1.exibirDados();

        System.out.println("---------- emprestar livros: ----------");
        usuario1.emprestarlivro();
        usuario1.exibirDados();

        System.out.println("---------- devolver livro: ----------");
        usuario1.devolverlivro();
        usuario1.exibirDados();

        System.out.println("---------- bloquear usuario: ----------");
        usuario1.setAtivo(false);
        usuario1.exibirDados();

        System.out.println("---------- ativar usuario: ----------");
        usuario1.setAtivo(true);
        usuario1.exibirDados();
    }
}
