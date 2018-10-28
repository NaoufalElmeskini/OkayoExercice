package main;

public class StringChanger {
	
	/**
	 * 
	 * @param charArray Tableau de char representant le string a modifier.
	 * @return Une chaine de characteres correspondant le tableau de char en entree, mais en remplacant les ' ' par des "%20".
	 */
	public static void changerString(char[] charArray){
		for (int i = 0; i < charArray.length; i++) {
			if( Character.isWhitespace(charArray[i]) ){
				decalerString(charArray, i+1, 2);
				try {
					charArray[i] = '%';
					charArray[i+1] = '2';
					charArray[i+2] = '0';
					i = i+2;					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Chaine de longueur insuffisante.");
				}
			}
		}
	}
	
	/**
	 * Cette methode decale à droite tous les elements du tableau, commencant par l'index 'startingIndex', et par un nombre de case egal a 'pas'.
	 * @param charArray La chaine a decaler.
	 * @param startingIndex L'index du debut.
	 * @param steps Le nombre de pas par lequel les cases seront decalees (i.e. unite de decalage). exemple : step = 2 indique que toutes les cases seront decalees de deux pas vers la droite.
	 */
	public static void decalerString(char[] charArray, int startingIndex, int steps){
		// La taille du tableau doit etre > a l'unite de decalage (steps)
		if( (startingIndex < 0) || (charArray.length -1 < steps) ){ 
			return;
		}
		int i = charArray.length -1;
		while( (i - steps) >= startingIndex){
			charArray[i] = charArray[i - steps];
			i--;
		}
	}
	
	public static String toString(char[] charArray){
		String result = "";
		for(char c : charArray){
			result += c;
		}
		return result;
	}
	
	public static void main(String[] args){
		char[] maChaine = "chaine de test------".toCharArray();
		changerString(maChaine);
		System.out.println( toString(maChaine) );
	}

}
