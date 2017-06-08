/**Vide est un Element, permettra d'evaluer toute les cases libres dans Monde
 * 
 * @see Monde
 * @see Vide#toString()
 * @see Vide#takeDamage()
 * @see Vide#Vide()
 * @see Element
 * @author BARBET Florian
 * @author LEICHT Theo
 * @author MURAT Edouard
 * @author SKAWAND Dylan
 * @author RICHARD Alexandre
 * @author CORNET Thomas
 * @author BRUNI XAVIER
 *
 */

public class Vide extends Element{

	/**Constructeur de vide, le vide est d�voil� !
	 * @see Element#find
	 */
	public Vide(){
		find=true;
	}

	/**Methode h�rit�, permet d'envoyer un message d'erreur.
	 * @see Element#takeDamage()
	 */
	public Element takeDamage(){System.out.println("Vous avez tir� dans le vide"); return this;}

	/**Repr�sentation du vide
	 * @return " "
	 */
	public String toString(){
		return " ";

	}
}
