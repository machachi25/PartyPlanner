/**
Attendees.java
@author Chinmay Machavaram
@since 11/26/23
This class is where the attendee objects contian their attributes and their methods
 * party is where they are added and such
 */


import java.util.*; 


public class Attendees
{
	private int iD;
	private String name;
	private int companyID;
	
	public Attendees(int newID, String newName, int newCompanyID) //constructor
	{
			iD = newID;
			name = newName;
			companyID = newCompanyID;
	}
	
	//getters and setters
	public void setID(int newID)  {//updates the new ID into the original object 
		iD = newID;
	}
	public void setName(String newName)  {//same thing but with name and company ID
		name = newName;
		}
	public void setCompany(int newCompanyID) {
		companyID = newCompanyID;
	}
	    //getters
		public int getID()  {//
		return iD;
	}
	public String getName()  {//
		return name;
		}
	public int setCompany() {
		return companyID;
	}
	
	
	public String toString() 
	{
		return(name + " has an ID of: " + iD + " and works for " + companyID + " .");
	}
	
	public int company() //will return the company ID for purposes in the party class and for table boolean in Tables class file
	{
		return companyID;
	}	
	public void table() //unused method
	{

	}
}



