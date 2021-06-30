package Tienda;
import java.util.*;
public class Tienda {

	static Scanner s = new Scanner(System.in);
	static Tienda d = new Tienda();
	 
	public static void main(String[] args) {
		boolean seguir;
		do {
			try {
				seguir = false;
		System.out.println("*************************************");
		System.out.println();
		System.out.println("   Bienvenido, Seleccione el Modo:  ");
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		String Modo[] = {"1.Empleador","2.Usuario"};
		for(int i = 0; i< Modo.length; i++) {
			System.out.println("Modo:" + Modo[i]);
		}
		System.out.println("Seleccione un Modo:");
		int mod = s.nextInt();
		while (mod<1 || mod>2) {
			System.out.println("Seleccione una opcion valida :");
			mod = s.nextInt();
		}
			switch(mod) {
			case 1:
				// empleador
				do {
					try {
						seguir = false;
				d.Empleador();
				}catch (InputMismatchException ex) {
		            System.out.println("Debe ingresar obligatoriamente una opcion valida.");
		            	  s.next();
		            	  System.out.println();
		            	  seguir = true;
				}
				}while(seguir);{
				}
				break;
			case 2:
				//usuario
				do {
					try {
						seguir = false;
				d.Usuario();
					}catch (InputMismatchException ex) {
			            System.out.println("Debe ingresar obligatoriamente una opcion valida.");
			            	  s.next();
			            	  System.out.println();
			            	  seguir = true;
					}
					}while(seguir);{
					}
				break;
				
			}
	}
			catch (InputMismatchException ex) {
	            System.out.println("Debe ingresar obligatoriamente una opcion valida.");
	            	  s.next();
	            	  System.out.println();
	            	  seguir = true;
			}
			}while(seguir);{
			}
			/// primer parte
	}
	public void Empleador() {
		System.out.println("Bienvenido\nSeleccione :");
		String Ver[]= {"1.Catalogo de Juguetes","2.Pedidos","3.Envios"};
		for(int i = 0 ; i<Ver.length; i++) {
			System.out.println("Ver " + Ver[i]);
		}
		int res = s.nextInt();
		while (res<1 || res>3) {
			System.out.println("Seleccione una opcion valida :");
			res = s.nextInt();
		}
		switch(res) {
		case 1:
			System.out.println("**************************");
			System.out.println("         CATALOGO         " );
			System.out.println("**************************");
			
			String Juguetes[] = {"1.Usados = 750C$","2.Nuevos = 1200C$","3.Semi-Nuevos = 850C$"};
			for(int i =0 ; i<Juguetes.length;i++) {
				System.out.println("Juguetes " + Juguetes[i]);
			}
			System.out.println("Desea Cambiar el precio?\n1.Si\n2.No");
			int resp = s.nextInt();
			while (resp<1 || resp>2) {
				System.out.println("Seleccione una opcion valida :");
				resp = s.nextInt();
			}
			switch(resp) {
			case 1:
				System.out.println("1.Usados = 750C$");
				System.out.println("Ingrese el nuevo precio :");
				double Us = s.nextDouble();
				System.out.println("2.Nuevos = 1200C$");
				System.out.println("Ingrese el nuevo precio :");
				double Nv = s.nextDouble();
				System.out.println("3.Semi-Nuevos = 850C$");
				double Sv = s.nextDouble();
				System.out.println("****************************");
				System.out.println("       PRECIOS NUEVOS ");
				System.out.println("****************************");
				System.out.println("1.Usados = C$ " + Us);
				System.out.println("2.Nuevos = C$ " + Nv);
				System.out.println("3.Semi-Nuevos = C$ " + Sv);
				break;
			case 2:
				System.out.println("Gracias por usar la App");
				break;
			}//CAmbio de precios
			break; 
		case 2:
			System.out.println("**************************");
			System.out.println("         PEDIDOS         " );
			System.out.println("**************************");
			String Ped[] = {"Marta:\n4 Pacas de Juguetes nuevos\n Total = 4600 C$ ","Alejandro:\n 2 Pacas de Juguetes Usados\n Total = 1500 C$ "};
			for(int i =0;i<Ped.length;i++) {
				System.out.println("Pedidos : " + Ped[i]);
			}//ped
		case 3:
			System.out.println("**************************");
			System.out.println("          ENVIOS          " );
			System.out.println("**************************");
			String Env[] = {"1.Juan\n Pedido N^005\n 5 Pacas de Juguetes nuevos\n Fecha : 18/5/2021\n Monto total : 14000 C$ ","2.Rivas\n Pedido N^006\n 3 Pacas de Juguetes usados\n Fecha : 25/8/2020\n Monto total : 6500 C$ ","3.Manuel\n Pedido N^001\n 8 Pacas de Juguetes Semi-nuevos\n Fecha : 15/06/2021\n Monto total : 6875 C$ "};
			for(int i =0;i<Env.length;i++) {
				System.out.println("Pedidos : " + Env[i]);
			}
			System.out.println();
			System.out.println("Gracias Por usarme ;)");
			break;
			//final ver
		}
	}//final metodo empleador
	public void Usuario() {
		System.out.println("Ingrese su nombre: ");
		String nom = s.next();
		System.out.println("Bienvenido, " + nom);
		System.out.println();
		System.out.println(" Que Desea hacer: ");
		String Compras[] = {"1.Comprar","2.Ver mi envio","3.Devolucion","4.Catalogo"};
		for(int i = 0 ; i<Compras.length;i++) {
			System.out.println("Accion : " + Compras[i]);
		}
		System.out.println("Seleccione una Accion : " );
		int Acc = s.nextInt();
		while (Acc<1 || Acc>4) {
			System.out.println("Seleccione una opcion valida :");
			Acc = s.nextInt();
		}
		switch(Acc) {
		case 1 :
			System.out.println("**************************");
			System.out.println("          COMPRAS         " );
			System.out.println("**************************");
			System.out.println();
			System.out.println("EN seguida le mostraremos nuestro catalogo : ");
			String Juguetesa[] = {"1.Usados = 750C$","2.Nuevos = 1200C$","3.Semi-Nuevos = 850C$"};
			for(int i =0 ; i<Juguetesa.length;i++) {
				System.out.println("Juguetes " + Juguetesa[i]);
			}
			System.out.println("Seleccione el que desee agregar al carrito!!!");
			int CM = s.nextInt();
			while (CM<1 || CM>3) {
				System.out.println("Seleccione una opcion valida :");
				CM = s.nextInt();
			}
			switch(CM) {
			case 1:
				System.out.println("**************************");
				System.out.println("          COMPRA          " );
				System.out.println("**************************");
				System.out.println();
				System.out.println("Su compra esta siendo efectuada........");
				System.out.println("Seleccione la cantidad de pacas :\n Precio : 750 C$ ");
				int can = s.nextInt();
				System.out.println("Su Monto total sera de : "+ can*750);
				System.out.println();
				System.out.println("Gracias por preferirnos.");
				break;
			case 2:
				System.out.println("**************************");
				System.out.println("          COMPRA          " );
				System.out.println("**************************");
				System.out.println();
				System.out.println("Su compra esta siendo efectuada........");
				System.out.println("Seleccione la cantidad de pacas :\n Precio : 1200 C$ ");
				int can2 = s.nextInt();
				System.out.println("Su Monto total sera de : "+ can2*1200);
				System.out.println();
				System.out.println("Gracias por preferirnos.");
				break;
			case 3:
				System.out.println("**************************");
				System.out.println("          COMPRA          " );
				System.out.println("**************************");
				System.out.println();
				System.out.println("Su compra esta siendo efectuada........");
				System.out.println("Seleccione la cantidad de pacas :\n Precio : 850 C$ ");
				int can3 = s.nextInt();
				System.out.println("Su Monto total sera de : "+ can3*850);
				System.out.println();
				System.out.println("Gracias por preferirnos.");
				break;
			}
			
			break;
		
