package main;

public class StringChanger {
	
	/**
	 * 
	 * @param charArray Tableau de char representant le string a modifier.
	 * @return Une chaine de characteres correspondant le tableau de char en entree, mais en remplacant les ' ' par des "%20".
	 */
	public static String changeString(char[] charArray){
		StringBuilder sb = new StringBuilder(); 
		
		for(char c : charArray){
			if( Character.isWhitespace(c) ){
				sb.append("%20");
			}else{
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args){
		String string1 = "chaine de test";
		String string2 = "";
		String string3 = "   ";
		
		System.out.println( changeString( string1.toCharArray() ) );
		System.out.println( changeString( string2.toCharArray() ) );
		System.out.println( changeString( string3.toCharArray() ) );
	}

}
