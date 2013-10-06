/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apples;

/**
 *
 * @author usmantarfa
 */


public class tuna {
	//public void simpleMessage(){
		//System.out.println("This is another class");
		
	//}
	
	//public void simpleMessage(String name){
		//System.out.println("hello " + name);
	
	
	private String girlName;
	//only methods in this class can use a private variable
	
	public void setName(String name){
		girlName = name;
		
		}
	public String getName(){
	//method returns a string	
		return girlName;
		}
	
	public void saying(){
		
		System.out.printf("Your first girfriend was %s", getName());
	
	}
	
	
	

	
//multiple variable	
		//Scanner input = new Scanner(System.in);
		//tuna tunaObject = new tuna();
		//System.out.println("Enter name of first gf here: ");
		//String temp = input.nextLine();
		//tunaObject.setName(temp);
		//tunaObject.saying();
		
//Arrays		
		//int uss[]={3,4,56,7};
		//System.out.println(uss[1]);
		
	
}
