import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import for the array list

public class Party
{
	ArrayList<Attendees> roster = new ArrayList<Attendees>();
	String myArray[];
	Scanner scan  = new Scanner(System.in);
	// create instance variables the add method
	int guestID, compID;
	String guestName;
 
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
        String aName = myArray[2] + myArray[1];
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
	
}
	 
	 
	
	
	
