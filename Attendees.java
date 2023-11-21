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
	public String setName()  {//
		return name;
		}
	public int setCompany() {
		return companyID;
	}
	
	
	public String toString()
	{
		return(name + " has an ID of: " + iD + " and works for " + companyID + " .");
	}
		
}

