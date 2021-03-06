package emc;

import java.util.ArrayList;



/**
 * Class Estudante
 */
public class Estudante {

  //
  // Fields
  //

  private String nome;
  /**
   * um número natural maior que zero – que identifica de maneira unica o estudante. Portanto não ha dois estudantes  com o mesmo código; 
   */
  private int codigo;
  private int anoIngresso;
  private ArrayList<Disciplina> disciplinasMat;
  private ArrayList<TimeSlots> horariosDisponiveis;
  /**
   * das disciplinas que o estudante deve cursar no corrente perıodo letivo 
   */
  private ArrayList<Disciplina> disciplinasCursar;
  
  //
  // Constructors
  //
  public Estudante () { };
  public Estudante (int codigo, String nome, ArrayList<Disciplina> disciplinasCursar) {
	  this.codigo=codigo;
	  this.nome=nome;
	  this.disciplinasCursar = disciplinasCursar;
	  
  };
  
  //
  // Methods
  //
  /**
   * 
   * @param estudantes
   * @param codigoEstudante
   * @return Estudante
   * 	 * <h2>Descrição</h2>
	 * <p>Retorna qual Estudante tem aquele codigo (codigoEstudante) de uma array list de estudante</p>
	 * <p>caso o codigo não pertença a nenhum estudante do array passado por parametro então retorna null</p>
   */
public static Estudante qualEstudante(ArrayList<Estudante> estudantes, int codigoEstudante){
	for (int i = 0; i < estudantes.size(); i++) {
		if (estudantes.get(i).codigo==codigoEstudante) {
			return estudantes.get(i);
		}
	}
	return null;
}

  //
  // Accessor methods
  //

  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  public void setNome (String newVar) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  public String getNome () {
    return nome;
  }

  /**
   * Set the value of codigo
   * um número natural maior que zero – que identifica de maneira unica o estudante.
   * Portanto não ha dois estudantes  com o mesmo código; 
   * @param newVar the new value of codigo
   */
  private void setCodigo (int codigo) {
    this.codigo = codigo;
  }

  /**
   * Get the value of codigo
   * um número natural maior que zero – que identifica de maneira unica o estudante.
   * Portanto não ha dois estudantes  com o mesmo código; 
   * @return the value of codigo
   */
  public int getCodigo () {
    return codigo;
  }

  /**
   * Set the value of anoIngresso
   * @param newVar the new value of anoIngresso
   */
  public void setAnoIngresso (int anoIngresso) {
    this.anoIngresso = anoIngresso;
  }

  /**
   * Get the value of anoIngresso
   * @return the value of anoIngresso
   */
  public int getAnoIngresso () {
    return anoIngresso;
  }

  /**
   * Set the value of disciplinasMat
   * @param newVar the new value of disciplinasMat
   */
  public void setDisciplinasMat (ArrayList<Disciplina> disciplinasMat) {
    this.disciplinasMat = disciplinasMat;
  }

  /**
   * Get the value of disciplinasMat
   * @return the value of disciplinasMat
   */
  public ArrayList<Disciplina> getDisciplinasMat () {
    return disciplinasMat;
  }

  /**
   * Set the value of horariosDisponiveis
   * @param newVar the new value of horariosDisponiveis
   */
  public void setHorariosDisponiveis (ArrayList<TimeSlots> horariosDisponiveis) {
    this.horariosDisponiveis = horariosDisponiveis;
  }

  /**
   * Get the value of horariosDisponiveis
   * @return the value of horariosDisponiveis
   */
  public ArrayList<TimeSlots> getHorariosDisponiveis () {
    return horariosDisponiveis;
  }

  /**
   * Set the value of disciplinasCursar
   * das disciplinas que o estudante deve cursar no corrente perıodo letivo 
   * @param newVar the new value of disciplinasCursar
   */
  public void setDisciplinasCursar (ArrayList<Disciplina> disciplinasCursar) {
    this.disciplinasCursar = disciplinasCursar;
  }

  /**
   * Get the value of disciplinasCursar
   * das disciplinas que o estudante deve cursar no corrente perıodo letivo 
   * @return the value of disciplinasCursar
   */
  public ArrayList<Disciplina> getDisciplinasCursar () {
    return disciplinasCursar;
  }

  //
  // Other methods
  //

  /**
   * @return true se o timeslot está disponivel
   * @return       Boolean
   * @param        timeslot um timeslot especifico para verificar se está livre no
   * horario do
   * 
   */
  public Boolean isTimeSlotAvailable(String timeslot)
  {
	  return true;
  }


}
