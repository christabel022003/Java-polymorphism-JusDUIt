package com.java;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	ArrayList<Footwear> shoes = new ArrayList<Footwear>();
	
	String name;
	String type;
	double height;
	int price;
	int total_wheel;
	
	public Main() {
		int menu = 0;
		do {
			Menu();
			
		 menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				AddFootwear();
				break;
				
			case 2:
				ViewFootwear();
				break;
				
			case 3:
				UpdateFootwear();
				break;
				
			case 4:
				DeleteFootwear();
				break;
				
				default:
					break;
			}
			
		}while (menu!=5);
		
		System.exit(0);
	}
		
	


	
	private void Menu() {
		
			
			System.out.println("Just DU It!!");
			System.out.println("============");
			System.out.println("1. Add Footwear");
			System.out.println("2. View Footwear");
			System.out.println("3. Update Footweaar");
			System.out.println("4. Delete Footwear");
			System.out.println("5. Exit");
			System.out.println(">>");
			
			
			
			
	}





	private void AddFootwear() {
		do {
			System.out.println("Name [3 - 25 characters]: ");
			name = sc.nextLine();
		}while(name.length()<3 || name.length()>25);
		
		do {
			System.out.println("Price [more than 10000]: ");
			price = sc.nextInt();
			sc.nextLine();
		}while(price<10000);
		
		do {
			System.out.println("Type [Heels or RollerSkate]: ");
			type = sc.nextLine();
		}while(!type.equals("Heels") && !type.equals("RollerSkate"));
		
		if(type.equals("Heels")) {
			do {
				System.out.println("input heels height [1.0 - 9.0]: ");
				try{
					height = input.nextDouble();
				input.nextLine();
				}catch (Exception e) {
					height = 0;
					System.out.println("Input must be numeric!");
				}
				input.nextLine();
				
			}while(height <1.0 || height >9.0);		
		shoes.add(new Heels(name, type, price, height));
		}
		
		
		else if(type.equals("RollerSkate")) {
		do {
			System.out.println("Input shoe total wheel [2 - 4 inclusive]: ");
		try {
			total_wheel =  input.nextInt();
		input.nextLine();
		}catch(Exception e) {
			total_wheel = 0;
		}input.nextLine();	
		}while(total_wheel <2 || total_wheel>4);
		shoes.add(new Rollerskate (name, type, price, total_wheel));
		}
		System.out.println("Foot wear added successfully!!");	
	
		}


	private void ViewFootwear() {
		
		if(shoes.isEmpty()) {
			System.out.println("There are no footwears to display!");
		}else {
			
			for(int i = 0; i < shoes.size(); i++) {
				
				System.out.println(i + 1 + ". ");
				System.out.println("Name: "+ shoes.get(i).name);
				System.out.println("Price: "+ shoes.get(i).price);
			
				String tipe = shoes.get(i).type;
				
				if(tipe.equals("Heels")) {
					Heels hl = (Heels)shoes.get(i);
					System.out.println("Height: " +hl.height);
				}else {
					Rollerskate rl = (Rollerskate) shoes.get(i);
					System.out.println("Wheel: " + rl.total_wheel);
				}
	 
				}
			}
	}
		
		private void UpdateFootwear() {
		
		int index = 0;
		
		if(shoes.isEmpty()) {
			System.out.println("There are no footwear to update!");
			
		}else {
		do {
			System.out.println("Which index to update ");
			index = sc.nextInt();
		} while (index < 1 || index > shoes.size());
		
		
		do {
			System.out.println("Input Footwear Name [3-25 Characters] = ");
			name = sc.nextLine();
		} while (name.length() < 3 || name.length() > 25);
		
		do {
			System.out.println("Input Footwear Price [More than 10000] = ");
			price = sc.nextInt();
			sc.nextLine();
		} while (!(price > 10000));
		
		do {
			System.out.println("Footwear Type [Heels/RollerSkate] = ");
			type = sc.nextLine();
		} while (!type.equalsIgnoreCase("Heels") && !type.equalsIgnoreCase("RollerSkate"));
		
		if (type.equals("Heels")) {
			do {
				System.out.println("Input Footwear Height [1.0-9.0] = ");
				height = sc.nextDouble();
			} while (height <= 1.0 && height >= 9.0);
			
			Footwear heels = new Heels(name, type, price, height);
			shoes.set(index - 1, heels);
			System.out.println("Footwear Updated");
		}
		
		else if (type.equals("RollerSkate")) {
			
			do {
				System.out.println("Input Footwear Wheel [2-4] = ");
				total_wheel = sc.nextInt();
			} while (total_wheel <= 2 && total_wheel >=4);
			
			Footwear rollerskate = new Rollerskate(name, type, price, total_wheel);
			shoes.set(index - 1, rollerskate);
			System.out.println("Footwear Updated");
		}
		
	}	
		}
	

	private void DeleteFootwear() {
		if(shoes.isEmpty()) {
			System.out.println("There are no footwear to update! ");
		} 
		else {
			for(int i = 0; i<shoes.size(); i++) {
				System.out.println(i + 1 + ". ");
				shoes.get(i).detail();
			}
			int index = 0;
			do {
				System.out.println("Which index to delete ");
				index = sc.nextInt();
			} while (index < 1 || index > shoes.size());
			
			shoes.remove(index-1);
			System.out.println("shoe removed");
		}
	}
		
	





	public static void main(String[] args) {
		new Main();

	}



}
