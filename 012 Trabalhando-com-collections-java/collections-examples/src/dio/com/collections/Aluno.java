package dio.com.collections;

/* Criar classe Aluno com seu nome, nome do curso que faz,
sua nota para depois modificar a classe ListaAluno.
*/
public class Aluno implements Comparable<Aluno> {  //implementação da interface Comparable
    //Comparable implementa uma ordenação natural que é a ordem alfabética em String,
    //para uma classe wrapper (Integer, Float etc) a ordenação natural é a ordem numérica.//
    private String nome;
    private String curso;
    double nota;

    Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String toString() {  //String é classe comparavel, implementa Comparable
        return this.nome;
        //return this.curso;
    }

    public int compareTo(Aluno aluno) { //chamada para atributos nome e curso (tipos String)
        //implementado metodo compareTo() para comparar nomes dos alunos/curso do tipo String
        return this.nome.compareTo(aluno.getNome());
        //return this.curso.compareTo(aluno.getCurso());
    }

    public boolean equals(Object o) {
        Aluno a = (Aluno) o; //definido que 2 alunos são iguais quando têm nomes iguais
        return this.nome.equals(a.getNome());
        //metodo equals() retorna comparação entre nomes de 2 alunos
    }

    //Definido que aluno terá código hash igual ao hash do nome (String)
    public int hashCode() {
        return this.nome.hashCode(); //hashCode() retorna código hash do nome do aluno
    }

    // Métodos getters e setters

    public String getNome() {
        return this.nome;

    //public String getCurso() {
    //  return this.curso;
    }
}