public class Student {

    public String nome;
    public int idade;
    public String tipoVeiculo;
    public int aulasTeoricas;
    public int aulasPraticas;
    public boolean aprovado = false;

    public void agendarAulaTeorica() {
        this.aulasTeoricas += 1;
    }

    public void agendarAulaPratica() {
        this.aulasPraticas += 1;
    }

    public void cancelarAulaTeorica() {
        if (this.aulasTeoricas > 0) {
            this.aulasTeoricas -= 1;
        }
    }

    public void cancelarAulaPratica() {
        if (this.aulasPraticas > 0) {
            this.aulasPraticas -= 1;
        }
    }

    public void realizarExame() {
        if (this.aulasTeoricas >= 5 && this.aulasPraticas >= 5) {
            double resultado = Math.random();
            if (resultado > 0.5) {
                this.aprovado = true;
            } else {
                this.aprovado = false;
            }
        } else {
            System.out.println(this.nome + " nao pode realizar o exame. Aulas insuficientes.");
        }
    }
}