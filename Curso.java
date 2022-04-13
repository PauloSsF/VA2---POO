class Curso {
  String nome;
  Disciplina disciplina1;
  Disciplina disciplina2;
  Disciplina disciplina3;
  
  float calcularMedia() {
    Disciplina disciplina1 + disciplina2 + disciplina3 / 3;   
  }

  boolean estaAprovado(float calcularMedia) {
    if calcularMedia > 60{
      System.out.println("Aprovado");
    else{
      System.out.println("Reprovado");
    }
    }
  }
  
  float notaPorDiciplina() {
    
  }
}