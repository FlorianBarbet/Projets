/**Permet de simplifier la gestion du cas o� l'utilisateur veut faire du hors map
 * @see Monde
 * @see Jouer
 * @author florian
 *
 */
public class OutOfMapException extends Exception {
	/**
	 * Id de serie de l'exception
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * String renvoy� quand il y a erreur
	 */
	private String err;

	/**
	 * constructeur vide string � null
	 */
	public OutOfMapException() {
		err = null;
	}
	/**
	 * Constructeur avec err prends valeur de s
	 * @param s
	 */
	public OutOfMapException(String s) {
		err = s;
	}

	/**
	 * Message affich� si il y a erreur
	 */
	@Override
	public String toString() {
		return err;
	}
}

