public class Main {
    public static void main(String[] args) {

        Instructor instrutor = new Instructor();
        instrutor.nome = "Claudio";
        instrutor.experiencia = 20;
        instrutor.categoria = "Carro";

        Vehicle veiculo = new Vehicle();
        veiculo.tipo = "Carro";
        veiculo.modelo = "Kwid";
        veiculo.placa = "110XP";

        Student aluno1 = new Student();
        aluno1.nome = "Jorge";
        aluno1.idade = 21;
        aluno1.tipoVeiculo = "Carro";

        Student aluno2 = new Student();
        aluno2.nome = "Jessica";
        aluno2.idade = 19;
        aluno2.tipoVeiculo = "Moto";

        Student aluno3 = new Student();
        aluno3.nome = "Carlos";
        aluno3.idade = 25;
        aluno3.tipoVeiculo = "Carro";

        Student aluno4 = new Student();
        aluno4.nome = "Ana";
        aluno4.idade = 22;
        aluno4.tipoVeiculo = "Carro";

        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.agendarAulaTeorica();
        aluno1.cancelarAulaTeorica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.agendarAulaPratica();
        aluno1.realizarExame();

        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaTeorica();
        aluno2.agendarAulaPratica();
        aluno2.realizarExame();

        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaTeorica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();
        aluno3.agendarAulaPratica();
        aluno3.cancelarAulaPratica();
        aluno3.realizarExame();

        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaTeorica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.agendarAulaPratica();
        aluno4.realizarExame();

        DrivingSchool autoEscola = new DrivingSchool();
        autoEscola.aluno1 = aluno1;
        autoEscola.aluno2 = aluno2;
        autoEscola.aluno3 = aluno3;
        autoEscola.aluno4 = aluno4;

        autoEscola.exibirResumo();
    }
}
