package csm10jlab06;

import java.util.Vector;

public class Professional {
	
	String name;	//to store name
	Vector<String> qualifications;	//to store list of qualification(multiple qualification)
	
	public Professional(String name)	//constructor function receive name string type value
	{
		this.name=name;		//assign name received to class level variable name
		this.qualifications=new Vector<String>();	// dynamically memory allocatin for list of qualification
	}
	
	String getName()	//	procedure to get class level variable name
	{
		return this.name;	//return current objects's name 
	}
	
	public String[] getQualifications()	//procedureto get qualification list in the form  of string array
	{
		String[] mulitpleQualifications=new String[qualifications.size()];	//dynamically allocate memory to the string of size same as the qualification numbers
		
		for(int i=0;i<qualifications.size();i++)
		{
			mulitpleQualifications[i]=qualifications.get(i);
		}
		return mulitpleQualifications;
	}
	
	//procedure to add qualification to multiple qualification list
	public void addQualification(String qualification)
	{
		if(qualification!=null)
		{
			qualifications.add(qualification);
		}
	}

	//procedure has qualification determines that the current professional has qualifaction or not
	public boolean hasQualification(String qualification)
	{
		if(qualifications.contains(qualification))
		{
			return true;
		}
		else 
			return false;
	}

	
}
