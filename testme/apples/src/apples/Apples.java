/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apples;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;

// tells java you want to input info from keyboard


/**
 *
 * @author usmantarfa
 */
public class Apples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("internet programming with java cs673" );
 
		
        x ob1 = new x();
        ob1.add(10, 10);
        y ob2 = new y();
        ob2.add(100, 120);

        
		//create a scanner variable, in this case we called it usman
		//Scanner usman = new Scanner(System.in);
		//System.out.println(usman.nextLine());
		//System.out.println("Hello world");
		//double fnum, snum, answer;
		//System.out.println("Enter first num");
		//fnum = usman.nextDouble();
		//System.out.println("Enter second num");
		//snum = usman.nextDouble();
		//answer = fnum + snum;
		//System.out.println(answer);
		
		
		//int tuna = 5, bass = 6;
		//++tuna;
		//increment operators, you can increment in the system out method too.
		//System.out.println(tuna++);
		//System.out.println(tuna);
		
		
		//int test = 6;
		
		//if (test == 9){
			//System.out.println("yes");
		//}
		
		//else {
				//System.out.println("this is else");
			//}
		
		
		//int boy, girl;
		//boy = 18;
		//girl = 99;
		//if (boy > 10 && girl < 60){
			//System.out.println("you can enter");
		//}
		//else{ System.out.println("you can not enter");
			//}
	
		
		//int age;
		//age = 3;
		
		//switch (age){
		
		//case 1:
			//System.out.println("You can crawl");
			//break;
		//case 2:
			//System.out.println("You can talk");
			//break;
		//case 3:
			//System.out.println("you can get in trouble");
		//default:
			//System.out.println("i dont know how old you are");
		//break;
		
		//The last thing in a switch statement is a 'default' and remember to 'break'.			
		//}
		
		
		//int counter = 0;
		//while (counter < 10) {
			//System.out.println(counter);
			//counter++;
			
		//}
		
//for loop:
               // for(int counter=0;counter <10;counter++){
               // System.out.println(counter);
                
                
        
        
        
        
        
//in order to use a method in another class, you should create an object of the class.
		//tuna tunaObject = new tuna();
		//tunaObject.simpleMessage();
		

//methods with parameters
		//Scanner input = new Scanner(System.in);***
		//allows you to use scanner after its imported from library
		//tuna tunaObject = new tuna();
		//make an object 'tunaObject' that allows you to use the tuna class
		//System.out.println("Enter your name here");
		//String name = input.nextLine();****
		//the variable 'name' allows you type anything you input 
		//tunaObject.simpleMessage(name);
		//use the object call the method
		

//multiple variable	
		//Scanner input = new Scanner(System.in);
		//tuna tunaObject = new tuna();
		//System.out.println("Enter name of first gf here: ");
		//String temp = input.nextLine();
		//tunaObject.setName(temp);
		//tunaObject.saying();
		
//Arrays		
		
        //can only hold one kind of data and once declared it can not be changed
        int [] randomArray;
        randomArray = new int[10];
        randomArray[0]= 12;
        for(int i = 0; i < randomArray.length; i++)
        {
            //randomArray[5] = 4;
            System.out.println(i);
        }
        
        //String dairy[]={"Banana", "apple", "pinapple" , "carrot"};
        //System.out.println(dairy[3]);
		
                                         
        //String[] creatures = new String[5];
 
        //creatures[0] = "Lions";
        //creatures[1]= "Bears";
        //creatures[2]= "Eagles";
        //creatures[3]= "Elephants";
 
        
 
        //int[] random = new int[5];
        //random[2] = 4;
        //random[1] = 3;
        //for (int i=0; i < random.length; i++){
        
        //System.out.println(random[2]);
// }
    
//ArrayList        
        
    ArrayList<String> creatures =new ArrayList<String>();
    
    
    //for(String x: creatures)
    creatures.add("a");
    creatures.add("c");
    creatures.add("d");
    creatures.add("e");
    creatures.add("f");
    
    
    
    for(int i = 0; i < creatures.size(); i++)
    //and to get the values in the list, use .get method
    {
        System.out.println(creatures.get(i));
    
    }
    
 //String creatures[] = input.nextLine();
 //System.out.println(creatures[]);
 
    //create an ArrayList varaiable
    ArrayList arrayListOne;
    //create arraylist object
    arrayListOne  =new ArrayList();
        
    ArrayList arrayListTwo  =new ArrayList();   
    //create arraylist with strings
    ArrayList<String> name =new ArrayList<String>();
    //create an arraylist that only takes strings
    //call the add function to add to the arraylist: name
    name.add("lion");
    name.add("bear");
    name.add("eagle");
    name.add("tiger");
    //to add a new value to a specific index 
    name.add(2, "cobra");
    
     //to replace a value use .set and enter the index no. and value to replace
    name.set(2,"elephant");//this will replace cobra from the list
    //to retrieve use for loop and .size for entire list
    
    //to remove a value use .remove and enter the index no.to remove
    name.remove(3);
    
    
    for(int i = 0; i < name.size(); i++)
    //and to get the values in the list, use .get method
    {
        System.out.println(name.get(i));
    
    }
    
   
            }
	
}