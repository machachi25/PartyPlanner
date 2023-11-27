/**
Party.java
@author Chinmay Machavaram
@since 11/26/23
This class is where all of the "meat" of the project will go; 
 * the addition fo attendees, prinitng of all 10 tables, and rosters by company, along with the search ggtter method all are here in this class
*/

import java.io.File;  // Import the File class 
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import for the array list



public class Party
{
	static ArrayList<Attendees> roster = new ArrayList<Attendees>(); // array list for all party guests
	ArrayList<Tables> places = new ArrayList<Tables>(); // array list of all 10 tables
	String myArray[];
	Scanner scan  = new Scanner(System.in);
	// create instance variables the add method
	int guestID, compID;
	String guestName;
	String member;
 
//method to print out the 90 original guests
 public void loadGuests() 
 {
 
  try {
      File myObj = new File("partyguests.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // "123, Smith, Mike, 12"
        myArray = data.split(",");
        //["123", "Smith", "Mike", "12"]
        int aID = Integer.parseInt(myArray[0]);
        String aName = myArray[2] + " " + myArray[1];
        int cID = Integer.parseInt(myArray[3]);
        Attendees a1 = new Attendees(aID, aName, cID);
        System.out.println(a1);
        roster.add(a1);
        
        
      }
      myReader.close();
    } 
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    
	}//close load guests
	
	// method to add the 10 additional attendees
	public void addGuests() 
	{
		for(int i = 0; i < 10; i++)
			{
				System.out.println("Enter your guest's ID: ");
				guestID = scan.nextInt();
				String temp = scan.nextLine(); //clearing our buffers
				System.out.println("Enter your guest's name: ");
				guestName = scan.nextLine();
				System.out.println("Enter your guest's company ID: ");
				compID = scan.nextInt();
				Attendees a2 = new Attendees(guestID, guestName, compID);
				System.out.println(a2);
				roster.add(a2);
			}
	}

	//method to create the 10 tables with the assigned people
	public void tables() 
	{
		for(int c = 0; c < 10; c++)
		{
			places.add(new Tables());
		}

		for(Attendees attendee : roster)
		{
			for(Tables table : places)
			{
				if((table.arraySize() < 10) && (table.sole(attendee.company())))
				{
					table.addAttendee(attendee);
					break;
				}
			}
		}

		//print statements for the method above(the tables() method),also aspect of project: "print roster by table"
		int count = 1; 

		for(Tables table : places)
		{
			System.out.println("Table " + count);
			table.printM();
			count++;
			System.out.println("");
		}
	}

	//method for the aspect of the project: "print roster by company"
	public void comp() 
	{
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 1)
			{
				System.out.println("Wal-mart: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 2)
			{
				System.out.println("Kroger: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 3)
			{
				System.out.println("Amazon: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 4)
			{
				System.out.println("Lowes: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 5)
			{
				System.out.println("Best Western: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 6)
			{
				System.out.println("Kmart: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 7)
			{
				System.out.println("Fusian: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 8)
			{
				System.out.println("Heinz: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 9)
			{
				System.out.println("Gucci: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 10)
			{
				System.out.println("Prada: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 11)
			{
				System.out.println("Nike: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 12)
			{
				System.out.println("Dodge: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 13)
			{
				System.out.println("Maserati: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 14)
			{
				System.out.println("Razor: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 15)
			{
				System.out.println("AMD: " + employee.toString());
			}
		}
		for(Attendees employee : roster)
		{
			if(employee.setCompany() == 16)
			{
				System.out.println("Razer: " + employee.toString());
			}
		}
		
	}

	//method for the aspect of the project: "getter fucntionality to get an attendee and return their table # and their position #"
	public void search()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("What attendee are you looking for? ");
		member = scan1.nextLine();
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < places.size(); j++)
			{
				if(member.equalsIgnoreCase(places.get(i).roster.get(j)))
				{

				}
			}
		}
		
		
	}

	
}
	 
	 
	
	
	

	 
	 
	
	
	
