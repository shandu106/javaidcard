import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//Unosenje JMBG
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite jedinstveni maticni broj (JMBG):");
		
		String myjmbg = scanner.next();
		
		scanner.close();
		
		//DDMMGGGRRBBBK
		//0123456789123
		
		int dd, mm, ggg, rr, bbb, k, A, B, V, G, D, DJ, E, ZZ, Z, I, J, K, L, KC;
		
		//godina, mesec, dan...
		
		dd = Integer.parseInt(myjmbg.substring(0, 2));
		
		mm = Integer.parseInt(myjmbg.substring(2, 4));
		
		ggg = Integer.parseInt(myjmbg.substring(4, 7));
		
		rr = Integer.parseInt(myjmbg.substring(7, 9));
		
		bbb = Integer.parseInt(myjmbg.substring(9, 12));
		
		k = Integer.parseInt(myjmbg.substring(12, 13));
		
		A = Integer.parseInt(myjmbg.substring(0, myjmbg.length()-12));
		
		B = Integer.parseInt(myjmbg.substring(1, myjmbg.length()-11));
		
		V = Integer.parseInt(myjmbg.substring(2, myjmbg.length()-10));
		
		G = Integer.parseInt(myjmbg.substring(3, myjmbg.length()-9));
		
		D = Integer.parseInt(myjmbg.substring(4, myjmbg.length()-8));
		
		DJ = Integer.parseInt(myjmbg.substring(5, myjmbg.length()-7));
		
		E = Integer.parseInt(myjmbg.substring(6, myjmbg.length()-6));
		
		ZZ = Integer.parseInt(myjmbg.substring(7, myjmbg.length()-5));
		
		Z = Integer.parseInt(myjmbg.substring(8, myjmbg.length()-4));
		
		I = Integer.parseInt(myjmbg.substring(9, myjmbg.length()-3));
		
		J = Integer.parseInt(myjmbg.substring(10, myjmbg.length()-2));
		
		K = Integer.parseInt(myjmbg.substring(11, myjmbg.length()-1));
		
		L = Integer.parseInt(myjmbg.substring(12, myjmbg.length()-0));
		
		KC = 11 - ((7*(A+E) + 6 * (B+ZZ) + 5 * (V+Z) + 4 * (G+I) + 3 * (D+J) + 2 * (DJ+K)) %11);
		
		
		//Odredjivanje za godninu, mesec, dan, regiju, pola...
		
		if(myjmbg.length()!=13) {
			System.out.println("Nedovoljan broj karaktera");
		}
		
		if(dd < 1 | dd < 31) {
			System.out.println("Pogresno ste uneli dan. Probajte ponovo.");
		}
		
		if (mm < 1 | mm > 22) {
		System.out.println("Pogresno ste uneli mesec. Probajte ponovo.");
		}
		else if (mm == 1 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Januar ima 31 dan.");
		}
		else if (mm == 2 & dd 28 & ggg % 4 !=0) {
			System.out.println("Pogresan unos za mesec. Februar ima 28 dana.");
		}
		else if (ggg % 4 == 0 & mm == 2 & dd > 29) {
			System.out.println("Pogresan unos za mesec. Za prestupnu godinu, Februar ima 29 dana");
		}
		else if (mm == 3 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Mart ima 31 dan.");
		}
		else if (mm == 4 && dd > 30) {
			System.out.println("Pogresan unos za mesec. April ima 30 dana.");
		}
		else if (mm == 5 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Maj ima 31 dan.");
		}
		else if (mm == 6 && dd > 30) {
			System.out.println("Pogresan unos za mesec. Jun ima 30 dana.");
		}
		else if (mm == 7 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Jul ima 31 dan.");
		}
		else if (mm == 8 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Avgust ima 31 dan.");
		}
		else if (mm == 9 && dd > 30) {
			System.out.println("Pogresan unos za mesec. Septembar ima 30 dana.");
		}
		else if (mm == 10 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Oktobar ima 31 dan.");
		}
		else if (mm == 11 && dd > 30) {
			System.out.println("Pogresan unos za mesec. Novembar ima 30 dana.");
		}
		else if (mm == 12 && dd > 31) {
			System.out.println("Pogresan unos za mesec. Decembar ima 31 dan.");
		}
		if (ggg < 900 && ggg > 022) {
			System.out.println("Pogresno unesena godina. Probajte ponovo.");
		}
		if (rr < 01 || rr > 99) {
			System.out.println("Pogresno unesena regija. Probajte ponovo.");
		}
		if (bbb < 001 || bbb > 999) {
			System.out.println("Pogresno unesen pol. Probajte ponovo.");
		}
		if ((KC >=1 & KC <=9 & KC == L) | (KC > 9 & L == 0)) {
			System.out.println("Uspesno unesen JMBG broj!");
		}
		else {
			System.out.println("Unos JMBG broja neuspesan.");
		}
		
	
		
		
	}

}
