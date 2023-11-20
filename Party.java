import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import for the array list

public class Party
{
	 ArrayList<Attendees> roster = new ArrayList<Attendees>();
	String myArray;
 
 
 
 public void loadGuests()
 {
 
  try {
      File myObj = new File("partyguests.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        // "123, Mike, Smith, 12"
        myArray = data.split(",");
        //["123", "Mike Smith", "12"]
        System.out.println(data);
      }
      myReader.close();
    } 
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    
}
}
	 
	 
	
	
	
