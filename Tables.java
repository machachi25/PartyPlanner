/**
Tables.java
@author Chinmay Machavaram
@since 11/26/23
This class's purpose is to print out people to a table, 
and to make sure that no one from the same company is also sitting at the same table as someone else from the same company 
*/

import java.util.ArrayList;


public class Tables
{
    ArrayList<Attendees> place = new ArrayList<Attendees>(); // arraylist of people at one table
    public Object roster;

    public int arraySize() //
    {
        return place.size();
    }
    //method to add the attendees to the singualr table
    public void addAttendee(Attendees guest)
    {
        place.add(guest);
    }
    //boolean to check if people at the same table have the same company ID
    public boolean sole(int companyID)
    {
        for(Attendees person : place)
        {
            if(person.company() == companyID)
            {
                return false; //ends the program then and there if the company ids are the same for the two people at one table
            }
        }
        return true;
    }
    //print method for ONE table
     public void printM()
        {
            int seat = 1; 
            for(Attendees persona : place)
            {
                System.out.println("Seat " + seat + ": " + persona);
                seat++;
            }
        }
        public void setTable(Attendees person, int tableCounter) //method to get the table number of one table, then in the party and attendees classes for all 10 will occur
        {
			int index = -1;
			int count = 0; 
			for(Attendees guest: place)
			{
				if(guest.getName().equals(person.getName()))
				{
					index = count;
					break;
				}
				count++; 
			}
			place.get(index).setTable(tableCounter) ;
			
		}
		
		public void setSeat()
		{
			int seater = 1;
			
			for(Attendees attendee : place)
			{
				attendee.setSeat(seater);
				seater++;
			}
		}
}
