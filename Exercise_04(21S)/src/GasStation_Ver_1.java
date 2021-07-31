import java.text.*;
import java.util.*;

/*
 * Assesment: Exercise 04 (21S)
 * Student name: Hygor Costa
 * due date: june.18, 2021
 * Lab Section: 313
 * lab Professor: Dave Houtman
 * Ver_01
 */

public class GasStation_Ver_1 {

	
	DecimalFormat decimal = new DecimalFormat("###.#");
		
	
 //Declarations
	    private String name;
	    private String address;
	    private double price;

	    
	    public GasStation_Ver_1(String string, String string2, int i) {
	    	
	    }
	    
 //Mutator Accessor
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
  
 //Function to formatted to one decimal place;
		    public String makeReport() {
			        return (MessageFormat.format("{0}, {1}, {2}", this.name, this.address, decimal.format(this.price)));
	    }
		    
/////////////////////////////////////////////////////////////////////////////////////////
	    
		public static void main(String[] args) {
			
 //Declarations
	        GasStation_Ver_1 gas1 = new GasStation_Ver_1("", "", 0);
	        GasStation_Ver_1 gas2 = new GasStation_Ver_1("", "", 0);
	        GasStation_Ver_1 gas3 = new GasStation_Ver_1("", "", 0);
	        String name;
	        String address;
	        double price;

	        
	        DecimalFormat decimal = new DecimalFormat("###.#");
	        Scanner keyboard = new Scanner(System.in);
	      
 //Input Gas1 
	        System.out.println("Welcome to Gas Station Program Version 1");
	        System.out.println("Enter data for three gas stations");
	        System.out.println("Enter Name");
	        name = keyboard.nextLine();
	        
	        System.out.println("Enter Address");
	        address = keyboard.nextLine();
	        
	        System.out.println("Enter Price");
	        price = keyboard.nextDouble();

 //gas1 setters
	        gas1.setName(name);
	        gas1.setAddress(address);
	        gas1.setPrice(price);

 //Input gas2
	        System.out.println("Enter Name");
	        keyboard.nextLine();
	        
	        name = keyboard.nextLine();
	        System.out.println("Enter Address");
	        
	        address = keyboard.nextLine();
	        System.out.println("Enter Price");
	        
	        price = keyboard.nextDouble();
	        keyboard.nextLine();

//gas2 setters
	        gas2.setName(name);
	        gas2.setAddress(address);
	        gas2.setPrice(price);

 //Input gas3
	        System.out.println("Enter Name");
	        name = keyboard.nextLine();
	        
	        System.out.println("Enter Address");
	        address = keyboard.nextLine();
	        
	        System.out.println("Enter Price");
	        price = keyboard.nextDouble();

 //gas3 setters
	        gas3.setName(name);
	        gas3.setAddress(address);
	        gas3.setPrice(price);
	        
 //declarations
	        double average = ((gas1.getPrice() + gas2.getPrice() + gas3.getPrice()) / 3.0);
	        
 //output reports
	        System.out.println(gas1.makeReport());
	        System.out.println(gas2.makeReport());
	        System.out.println(gas3.makeReport());

 //output average
	        System.out.println("Average Price: " + decimal.format(average));
	        System.out.println("Program By Hygor Costa");
		
	        System.out.println("Teste Gir na Classe");
	        System.out.println("teste dois no Git");
	        System.out.println( "teste 3 Git");
	        System.out.println("teste novo dia seguinte do Gil");
		}
		    
	}
		
		


