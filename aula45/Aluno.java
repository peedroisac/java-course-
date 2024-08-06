package aula45;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso(){

        this.nomeVisibilidade = "sasasasas";
        super.nomeVisibilidade = "sasasasata";

        //this.setNomeVisibilidade(nomeVisibilidade);

    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer(){
        super.setCpf("2121212121");
        //ou
        this.setCpf("34343434");
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereço do Aluno: ";
        s += this.getEndereco();
        return s;
    }
}
