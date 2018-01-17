import java.util.ArrayList;
import java.util.Random;

public class Spel {
	
	
	void starten() {
		System.out.println(dobbelsteenGooien());
	}
	//dobbelsteen gooien
	int dobbelsteenGooien = dobbelsteenGooien();
	int dobbelsteenGooien() {
		Random random = new Random();
		return (random.nextInt(6)+1);
	}
	
	int aantalStappen = dobbelsteenGooien;
	
	//void toonBord() {
		//for(Stad stad : steden) {
			//System.out.println(stad.naamStad);
		//}
	//}
	
	//BORD
	ArrayList<Object> bord = new ArrayList<>();
	
	
	
	void spelerPos(int pos) {
	}
	
	int eerstePos = dobbelsteenGooien;
	int nieuwePos = eerstePos + dobbelsteenGooien;
	
	int startPos = bord.get(0);
	
}
