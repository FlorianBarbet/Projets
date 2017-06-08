/**Mine est un element, permettra de poser cet element � l'aide d'un piegeur. C'est ici qu'est g�r� la destruction. 
 * et l'endroit o� sera poser la mine
 * 
 * @see Mine#Poser(int, int)
 * @see Mine#getEnergie()
 * @see Mine#takeDamage()
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
public class Mine extends Element{



	/**PositionM permettra au moment o� l'on pose la mine, de la poser � la m�me position qu'un Piegeur.
	 * 
	 */

	private Coordonnee positionM= new Coordonnee();

	/**Recup�re l'equipe du piegeur par un setter afin de bien utiliser le toString()
	 * @see Mine#toString()
	 * @see Mine#setTeam(int)
	 */
	private int equipe;

	/** Permet de d�finir l'equipe � laquelle appartient une Mine
	 * 
	 * @param a
	 */
	public void setTeam(int a) { equipe=a;}

	/**Permet de poser � un endroit c, r sur une grille
	 * 
	 * @param c
	 * @param r
	 */
	public void Poser(int c, int r){
		this.positionM.setCoordonnee(c, r);
		energie = 1;
		//find = true;
	}



	/**retourne l'energie de la mine il s'agit juste d'un simple accesseur
	 * 
	 * @return energie
	 */
	public int getEnergie() {return energie;}


	/**Methode h�rit�, abstraite d'element
	 * permet de detruire la Mine en lui infligeant des d�gats
	 * @see Element#takeDamage()
	 */
	@Override
	public Element takeDamage(){energie--; return this;}

	/**
	 * enleve les points d'energie au Robot r
	 * @param Robot r
	 */

	public void getDamage(Robot r) {
		r.energie-=2;
	}
	/**Selon l'equipe la repr�sentation sera diff�rente
	 * @see Mine#equipe
	 * @see Piegeur#Piegeur(int, int, int, int)
	 * @return "x" ou "X"
	 */
	public String toString() {
		if(equipe == 1)
			return "X";
		else return "x";
	}


}
