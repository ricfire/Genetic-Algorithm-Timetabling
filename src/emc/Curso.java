package emc;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * Class Curso
 */
public class Curso {

	//
	// Fields
	//
	
	private int numPeriodo = 10;
	/**
	 * 
	 * Turno: e um codigo que identifica qual o turno de oferta do curso. Pode
	 * ser um dos seguintes valores: 1) matutino; 2) vespertino; 3) noturno; 4)
	 * matutino e vespertino; 5) matutino e noturno; 6) vespertino e noturno; 7)
	 * matutino, vespertino e noturno. 
	 */

	private int turno;
	private ArrayList<Disciplina> disciplinas;
	/**
	 * – um numero natural maior que zero – que identifica de maneira ´ unica um
	 * curso (veja a lista ´ anterior); 
	 */
	private int codigo;
	private String nome;

	//
	// Constructors
	//
	
	// Curso: código do curso
//  nome oficial do curso
//  número de períodos que formam o curso
//  turnos de funcionamento do curso
//

	public Curso(int codigo, String nome, int numPeriodo, int turno) {
		this.numPeriodo=numPeriodo;
		this.codigo = codigo;
		this.turno = turno;
		this.nome = nome;
	};

	//
	// Methods
	//
	/**
	 * 
	 * @param cursos
	 * @param codigoCurso
	 * @return Curso ou null
	 * <h2>Descrição</h2>
	 * <p>Retorna qual curso tem aquele codigo (codigoCurso) de uma array list de curso</p>
	 * <p>caso o codigo não pertença a nenhum curso do array passado por parametro então retorna null</p>
	 */
	public Curso qualCurso(ArrayList<Curso> cursos, int codigoCurso){
		for(int i=0;i<cursos.size();i++){
			if(cursos.get(i).codigo==codigoCurso)
				return cursos.get(i);
		}
		return null;
	}
	//
	// Accessor methods
	//

	/**
	 * Set the value of numPeriodo
	 * 
	 * @param newVar
	 *            the new value of numPeriodo
	 */
	public void setNumPeriodo(int numPeriodo) {
		this.numPeriodo = numPeriodo;
	}

	/**
	 * Get the value of numPeriodo
	 * 
	 * @return the value of numPeriodo
	 */
	public int getNumPeriodo() {
		return numPeriodo;
	}

	/**
	 * Set the value of turno Turno: e um codigo que identifica qual o turno de
	 * oferta do curso. Pode ser um dos seguintes valores: 1) matutino; 2)
	 * vespertino; 3) noturno; 4) matutino e vespertino; 5) matutino e noturno;
	 * 6) vespertino e noturno; 7) matutino, vespertino e noturno. 
	 * 
	 * @param newVar
	 *            the new value of turno
	 */
	public void setTurno(int turno) {
		this.turno = turno;
	}

	/**
	 * Get the value of turno Turno: e um codigo que identifica qual o turno de
	 * oferta do curso. Pode ser um dos seguintes valores: 1) matutino; 2)
	 * vespertino; 3) noturno; 4) matutino e vespertino; 5) matutino e noturno;
	 * 6) vespertino e noturno; 7) matutino, vespertino e noturno. 
	 * 
	 * @return the value of turno
	 */
	public int getTurno() {
		return turno;
	}

	/**
	 * Set the value of disciplinas
	 * 
	 * @param newVar
	 *            the new value of disciplinas
	 */
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	/**
	 * Get the value of disciplinas
	 * 
	 * @return the value of disciplinas
	 */
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/**
	 * Set the value of codigo – um numero natural maior que zero – que
	 * identifica de maneira ´ unica um curso (veja a lista ´ anterior); 
	 * 
	 * @param newVar
	 *            the new value of codigo
	 */
	public void setCodigo(int newVar) {
		codigo = newVar;
	}

	/**
	 * Get the value of codigo – um numero natural maior que zero – que
	 * identifica de maneira ´ unica um curso (veja a lista anterior); 
	 * 
	 * @return the value of codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Set the value of nome
	 * 
	 * @param newVar
	 *            the new value of nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Get the value of nome
	 * 
	 * @return the value of nome
	 */
	public String getNome() {
		return nome;
	}

	//
	// Other methods
	//

}
