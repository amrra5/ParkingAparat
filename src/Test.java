import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int brKovanica = 0;
		double iznosKovanice = 0;

		Aparat aparat = new Aparat();

		while (true) {
			System.out.println("\n******Parking aparat******");
			System.out.println("\nTime: " + new Date());
			System.out
					.println("\n1- KREIRANJE KARTE\n2- POSTAVI CIJENU DNEVNE KARTE\n3- POSTAVI CIJENU SATNE KARTE\n4- ISPIS SVIH IZDATIH KARTI\n5- EXIT");
			System.out.print("Vas izbor: ");
			int unos = sc.nextInt();
			switch (unos) {
			case 1:
				System.out.print("\nUnesite ukupan broj kovanica: ");
				brKovanica = sc.nextInt();
				System.out.print("Unesite iznos pojedinacne kovanice: ");
				iznosKovanice = sc.nextDouble();

				aparat.izdajKartu(brKovanica, iznosKovanice);
				System.out.println("\nKarta uspjesno kreirana...");
				break;
			case 2:
				System.out.print("Unesite cijenu dnevne karte: ");
				double cijenaDnevne = sc.nextDouble();
				aparat.setDnevna(cijenaDnevne);
				System.out
						.println("\nCijena dnevne karte uspjesno postavljena...");
				break;
			case 3:
				System.out.print("Unesite cijenu satne karte: ");
				double cijenaSatne = sc.nextDouble();
				aparat.setSatna(cijenaSatne);
				System.out
						.println("\nCijena satne karte uspjesno postavljena...");
				break;
			case 4:
				System.out.println("\nLista svih izdatih karti:");
				for (int i = 0; i < aparat.getBrojIzdatihKarti(); i++) {
					System.out.println(aparat.getKartu(i).getInfo());
				}
				System.out.print("\nUkupan broj izdatih karti: "
						+ aparat.getBrojIzdatihKarti());
				break;
			default:
				System.exit(unos);
			}

		}
	}

}
