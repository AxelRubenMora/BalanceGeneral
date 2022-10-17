package bll;
import java.util.Scanner;

public class Validacioens {
	private Scanner scan;
	private String opc;
	
	public Validacioens() {
		super();
	}
	public int validarInt() {
		scan=new Scanner(System.in);
		
		opc=scan.nextLine();
		int numericOpc=0;
		
		try {
			numericOpc=Integer.parseInt(opc);
		}
		catch(Exception ex) {
			System.out.println("opcion Invalida porfavor digite un carcter alfanumerico");
			numericOpc=validarInt();	
		}
		
		return numericOpc;
	}
	public double validarDou() {
		scan=new Scanner(System.in);
		
		opc=scan.next();
		double numericOpc = 0;
		try {
			numericOpc=Double.parseDouble(opc);
		}
		catch(Exception ex) {
			System.out.println("opcion Invalida porfavor digite un carcter alfanumerico");
			numericOpc=validarDou();
		}
		return numericOpc;
	}
	
	
	public double validarExistencia() {
		double num=validarDou();
		if(num==-1.0) {
			return 0.0d;
		}
		
		return num;
		
	}

}
