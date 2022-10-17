package ui;

import doll.ActivosCirculantes;
import doll.ActivosNoCirculante;
import doll.CapitalContribuido;
import doll.CapitalGanado;
import doll.PasivosCirculante;
import doll.PasivosNoCirculantes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import bll.Validacioens;
public class BalanceForm {
	private Validacioens val;
	double monto;
	 
	public BalanceForm() {
	}
	public ActivosCirculantes crearActiCir() throws IllegalAccessException, InvocationTargetException {
		ActivosCirculantes ac= new ActivosCirculantes();
		Field[] atributosDeActivos=ac.getClass().getDeclaredFields();
		Method[] metodosDeActivos= ac.getClass().getDeclaredMethods();
		System.out.println("A continuacion se le presentara una serie de cuentas\nDe no tener datos de esa ceunat digite -1");
		for(Field atributo :atributosDeActivos) {
			for(Method metodo: metodosDeActivos ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
		return ac;
	}
	
	
	public ActivosNoCirculante crearArtiNoCirc() throws IllegalAccessException, InvocationTargetException {
		
		ActivosNoCirculante anc= new ActivosNoCirculante();
		Field[] atributosDeActivosNocirculantes=anc.getClass().getDeclaredFields();
		Method[] metodosDeActivosNoCirculantes=anc.getClass().getDeclaredMethods();
		System.out.println("A continuacion se le presentara una serie de cuentas\nDe no tener datos de esa ceunat digite -1");
		vali(atributosDeActivosNocirculantes,metodosDeActivosNoCirculantes,anc);
		return anc;
		
	}
	
	public PasivosNoCirculantes crearPasivoNoC() throws IllegalAccessException, InvocationTargetException {
		
		PasivosNoCirculantes anc= new PasivosNoCirculantes();
		Field[] atributosDeActivosNocirculantes=anc.getClass().getDeclaredFields();
		Method[] metodosDeActivosNoCirculantes=anc.getClass().getDeclaredMethods();
		System.out.println("A continuacion se le presentara una serie de cuentas\nDe no tener datos de esa ceunat digite -1");
		vali(atributosDeActivosNocirculantes,metodosDeActivosNoCirculantes,anc);
		return anc;
		
	}
	
	public PasivosCirculante crearPasivoC() throws IllegalAccessException, InvocationTargetException {
		
		PasivosCirculante anc= new PasivosCirculante();
		Field[] atributosDeActivosNocirculantes=anc.getClass().getDeclaredFields();
		Method[] metodosDeActivosNoCirculantes=anc.getClass().getDeclaredMethods();
		System.out.println("A continuacion se le presentara una serie de cuentas\nDe no tener datos de esa ceunat digite -1");
		vali(atributosDeActivosNocirculantes,metodosDeActivosNoCirculantes,anc);
		return anc;
		
	}
	
	public CapitalGanado crearCapitaG() throws IllegalAccessException, InvocationTargetException {
		
		CapitalGanado anc= new CapitalGanado();
		Field[] atributosDeActivosNocirculantes=anc.getClass().getDeclaredFields();
		Method[] metodosDeActivosNoCirculantes=anc.getClass().getDeclaredMethods();
		System.out.println("A continuacion se le presentara una serie de cuentas\nDe no tener datos de esa ceunat digite -1");
		vali(atributosDeActivosNocirculantes,metodosDeActivosNoCirculantes,anc);
		return anc;
		
	}
	
	
	public CapitalContribuido crearCapitaC() throws IllegalAccessException, InvocationTargetException {
		
		CapitalContribuido anc= new CapitalContribuido();
		Field[] atributosDeActivosNocirculantes=anc.getClass().getDeclaredFields();
		Method[] metodosDeActivosNoCirculantes=anc.getClass().getDeclaredMethods();
		System.out.println("A continuacion se le presentara una serie de cuentas\nDe no tener datos de esa ceunat digite -1");
		vali(atributosDeActivosNocirculantes,metodosDeActivosNoCirculantes,anc);
		return anc;
		
	}
	
	
	
	public void vali(Field aributoDeClase[],Method metodosDeClase[],ActivosNoCirculante ac) throws IllegalAccessException, InvocationTargetException {
		for(Field atributo :aributoDeClase) {
			for(Method metodo: metodosDeClase ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
	}
	
	public void vali(Field aributoDeClase[],Method metodosDeClase[],ActivosCirculantes ac) throws IllegalAccessException, InvocationTargetException {
		for(Field atributo :aributoDeClase) {
			for(Method metodo: metodosDeClase ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
	}
	public void vali(Field aributoDeClase[],Method metodosDeClase[],PasivosNoCirculantes ac) throws IllegalAccessException, InvocationTargetException {
		for(Field atributo :aributoDeClase) {
			for(Method metodo: metodosDeClase ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
	}
	
	public void vali(Field aributoDeClase[],Method metodosDeClase[],PasivosCirculante ac) throws IllegalAccessException, InvocationTargetException {
		for(Field atributo :aributoDeClase) {
			for(Method metodo: metodosDeClase ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
	}
	
	public void vali(Field aributoDeClase[],Method metodosDeClase[],CapitalContribuido ac) throws IllegalAccessException, InvocationTargetException {
		for(Field atributo :aributoDeClase) {
			for(Method metodo: metodosDeClase ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
	}
	
	public void vali(Field aributoDeClase[],Method metodosDeClase[],CapitalGanado ac) throws IllegalAccessException, InvocationTargetException {
		for(Field atributo :aributoDeClase) {
			for(Method metodo: metodosDeClase ) {
				if("set"+String.valueOf(atributo.getName().charAt(3))+metodo.getName().substring(4)==metodo.getName()) {
					System.out.printf("Digite lo correspondiente a \"%s\"",atributo.getName());
					monto=val.validarExistencia();
					if(monto>0) {
						metodo.invoke(ac, monto);
					}
				}
			}
		}
	}
	
	

}
