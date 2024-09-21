package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		
		System.out.println("-------Valores Iniciales-------");
		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();
		System.out.println("-------Valores modificados-------");
		
		cuenta1.setSaldo(444);
		cuenta2.setTipo("D");
		cuenta3.setSaldo(567);
		
		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();
		
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		
		Cuenta cuenta6 = new Cuenta("0666","A",0);
		
		cuenta4.ImprimirConMiEstilo();
		cuenta5.ImprimirConMiEstilo();
		cuenta6.ImprimirConMiEstilo();
	}

}
