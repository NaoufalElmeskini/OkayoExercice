package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringChangerTest {

	@Test
	public void testChangerString() {
		char[] maChaine0 = "ma chaine------------".toCharArray();
		char[] maChaineAttendue0= "ma%20chaine----------".toCharArray();
		
		char[] maChaine1 = "ma chaine de test------------".toCharArray();
		char[] maChaineAttendue1= "ma%20chaine%20de%20test------".toCharArray();
		
		char[] maChaine2 = "".toCharArray();
		char[] maChaineAttendue2= new char[0];
		
		StringChanger.changerString( maChaine0 );
		assertArrayEquals(maChaineAttendue0, maChaine0);
		
		StringChanger.changerString( maChaine1 );
		assertArrayEquals(maChaineAttendue1, maChaine1);
		
		StringChanger.changerString( maChaine2 );
		assertArrayEquals(maChaineAttendue2, maChaine2);
	}

	@Test
	public void testDecalerString() {
		char[] maChaine0 = "chaine".toCharArray();
		char[] maChaineAttendue0= "cchain".toCharArray();
		
		char[] maChaine1 = "chaine a decaler".toCharArray();
		char[] maChaineAttendue1= "chchaine a decal".toCharArray();
		
		StringChanger.decalerString(maChaine0, 0, 1);
		assertArrayEquals(maChaineAttendue0, maChaine0);
		
		StringChanger.decalerString(maChaine0, 0, 10);
		assertArrayEquals(maChaine0, maChaine0);
		
		StringChanger.decalerString(maChaine1, 0, 2);
		assertArrayEquals(maChaineAttendue1, maChaine1);
	}

}
