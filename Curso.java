class Curso {
  String nome;
  Disciplina disciplina1;
  Disciplina disciplina2;
  Disciplina disciplina3;
  float media;
  
  float calcularMedia() {
    media = (disciplina1 + disciplina2 + disciplina3) / 3;
    return media;
  }

  boolean estaAprovado(float media) {
      if media >= 60{
        System.out.println("Aprovado");
      else{
        System.out.println("Reprovado");
      }
    }
  }
  
  float notaPorDiciplina() {
    return notaFinal;
  }
}