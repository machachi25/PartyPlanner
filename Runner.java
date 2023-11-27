/**
Runner.java
@author Chinmay Machavaram
@since 11/26/23
The main method class, the class that will be executed for the code to run 
*/


import java.util.*;


public class Runner
{
	public static void main(String[] args)
	{
		Party p1 = new Party();
		p1.loadGuests();
		p1.addGuests();
		p1.tables();
		p1.comp();
		p1.search();
	}
}
