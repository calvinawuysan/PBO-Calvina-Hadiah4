import java.util.Scanner;
public class hadiah4{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	String nama;
	double tugas1, tugas2, tugas3, mid, nilaifinal;
	double ratatugas,nilaiakhir;
	
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.print("Masukkan Nilai Tugas 1 = ");
	tugas1 = masukan.nextDouble();
	System.out.print("Masukkan Nilai Tugas 2 = ");
	tugas2 = masukan.nextDouble();
	System.out.print("Masukkan Nilai Tugas 3 = ");
	tugas3 = masukan.nextDouble();
	System.out.print("Masukkan Nilai MID = ");
	mid = masukan.nextDouble();
	System.out.print("Masukkan Nilai Final = ");
	nilaifinal = masukan.nextDouble();
	ratatugas = (tugas1+tugas2+tugas3) /3 ;
	System.out.println("Rata Rata Nilai Tugas = " +ratatugas);
	
	System.out.println();
	System.out.println("Nama = "+nama);
	nilaiakhir = (ratatugas*0.3) + (mid*0.3) + (nilaifinal*0.4) ;
	System.out.println("Nilai Akhir = " +nilaiakhir);
	
	if (nilaiakhir>=80) {
		System.out.println("Nilai Akhir = A");
	}
	else if (nilaiakhir>=60) {
		System.out.println("Nilai Akhir = B");
	}
	else if (nilaiakhir>=50) {
		System.out.println("Nilai Akhir = C");
	}
	else if (nilaiakhir>=40) {
		System.out.println("Nilai Akhir = D");
	}
	else {
		System.out.println("Nilai Akhir = E");
	}

	}
}