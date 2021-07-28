import java.util.Scanner;
import java.text.*;

/*
 * Assesment: Exercise 04 (21S)
 * Student name: Hygor Costa
 * due date: june.18, 2021
 * Lab Section: 313
 * lab Professor: Dave Houtman
 */

	public class GasStation {
	
	  //Class variables
				String name = "";
			    String address = "";
			    double price = 0;
			    double average = 0;
			    
			    static DecimalFormat decimal = new DecimalFormat("###.##");
				Scanner keyboard = new Scanner(System.in);
				
			    //Constructor
			    GasStation(String name, String address, double price) {
			        this.name = name;
			        this.address = address;
			        this.price = price;
			    }
			
		//Accessor Mutators
			    public String getName() {
			        return name;
			    }
			    
			    public String getAddress() {
			        return address;
			    }

			    public double getPrice() {
			        return price;
			    }
	 
			    public void setName(String name) {
			        this.name = name;
			    }
			   
			    public void setAddress(String address) {
			        this.address = address;
			    }
			
			    public void setPrice(double price) {
			        this.price = price;
			    }

			    
			        public void gasstationname() {
			    	System.out.println("Please, Type the Gas Station Name ");
			    	String inputValue = keyboard.nextLine();
			    	this.setName(inputValue);
			    	
			    }
			    
			    public void gasstationaddress() {
			    	System.out.println("Please, type the Address ");
			    	String inputValue = keyboard.nextLine();
			    	this.setAddress(inputValue);
			    				    	
			    }
			    
			    public void prices() {
			    	System.out.println("please, type a Value of Gas");
			    	double inputValue = keyboard.nextDouble();
					this.setPrice(inputValue);
			    	
			    }
			    
			    public void Report1() { 
			       	System.out.println("Gas Station Name: " + this.getName() + ", Address: " + this.getAddress() + ", " + " CAD " + decimal.format(this.getPrice()));
			    }	
			    
			    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			    
			    
			    public static void main(String[] args) {	    
			        
	        GasStation gs[] = new GasStation[3];
			        
			        gs[0] = new GasStation("", "", 0);
			        gs[1] = new GasStation("", "", 0);
			        gs[2] = new GasStation("", "", 0);

	
			        System.out.println("\n***** Welcome to Gas Station Program Version 1 ****\n");
			        System.out.println("Enter data for three Gas Stations");
		
			        
			        
//		Set Gas Station 1      
			        gs[0].gasstationname();
			        gs[0].gasstationaddress();
			        gs[0].prices();
			        
//		Set Gas Station 2  			        
			        gs[1].gasstationname();
			        gs[1].gasstationaddress();
			        gs[1].prices();
		
//		 Set Gas Station 3   
			        gs[2].gasstationname();
			        gs[2].gasstationaddress();
			        gs[2].prices();

//       Report1 (Name,Address,Price)	
			        System.out.println("------------------------------------------------------");
			        gs[0].Report1();
			        gs[1].Report1();
			        gs[2].Report1();
			        
			        double average = ((gs[0].getPrice() + gs[1].getPrice() + gs[2].getPrice())/3);
			        System.out.println("Average Price: Cad -> " + decimal.format(average));
			        System.out.println("Program By Hygor costa");
			        
		    }
		    
	}


