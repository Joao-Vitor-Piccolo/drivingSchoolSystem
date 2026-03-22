public class DrivingSchool {

    public Student aluno1;
    public Student aluno2;
    public Student aluno3;
    public Student aluno4;

    public void exibirResumo() {
        System.out.println("===== RESUMO DA AUTOESCOLA =====");

        System.out.println("\nAluno: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Aulas Teoricas: " + aluno1.aulasTeoricas);
        System.out.println("Aulas Praticas: " + aluno1.aulasPraticas);
        System.out.println("Aprovado: " + aluno1.aprovado);

        System.out.println("\nAluno: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);
        System.out.println("Aulas Teoricas: " + aluno2.aulasTeoricas);
        System.out.println("Aulas Praticas: " + aluno2.aulasPraticas);
        System.out.println("Aprovado: " + aluno2.aprovado);

        System.out.println("\nAluno: " + aluno3.nome);
        System.out.println("Idade: " + aluno3.idade);
        System.out.println("Aulas Teoricas: " + aluno3.aulasTeoricas);
        System.out.println("Aulas Praticas: " + aluno3.aulasPraticas);
        System.out.println("Aprovado: " + aluno3.aprovado);

        System.out.println("\nAluno: " + aluno4.nome);
        System.out.println("Idade: " + aluno4.idade);
        System.out.println("Aulas Teoricas: " + aluno4.aulasTeoricas);
        System.out.println("Aulas Praticas: " + aluno4.aulasPraticas);
        System.out.println("Aprovado: " + aluno4.aprovado);
    }
}