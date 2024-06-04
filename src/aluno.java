public class aluno {
    private String nome;
    private int ra;
    private String cidade;


    public int setRA(int c){
        this.ra = c;
        return this.ra;



    }


    public void getRA() throws Exception{

        if (this.ra <= 0)
            throw new Exception("RA não pode ser negativo ou zero!");



    }


    public String setNome(String n){
        this.nome = n;
        return this.nome;
    }
    public void getNome() throws Exception{
        if ((this.nome == null) || (this.nome.isEmpty()))
            throw new Exception("Nome não pode ser nulo ou vazio!");


    }




    public String setCidade(String c1){
        this.cidade = c1;
        return this.cidade;
    }
    public void getCidade() throws Exception{
        if ((this.cidade == null) || (this.cidade.isEmpty()))
            throw new Exception("Cidade não pode ser nula ou vazia!");




    }



}
