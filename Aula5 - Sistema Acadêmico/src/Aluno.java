public class Aluno extends Pessoa{
    private double nota1;
    private double nota2;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double calcularMedia(double nota1, double nota2) {
        media = (nota1 + nota2)/2;
        return media;

    }
}