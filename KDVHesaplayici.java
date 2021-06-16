import java.utils.Scanner;

public class KDVHesaplayici {
	public static void main(String[] args){
		double tutar, KDVOran = 0.18;
		double KDVTutar;
		Scanner inp = new Scanner(System.in);
		System.out.println("Ücreti giriniz:");
		tutar = inp.nextDouble();
		KDVOran = tutar > 1000? 0.18: 0.08;
		KDVTutar = tutar*KDVOran;
		System.out.println(KDVTutar);
	}
}