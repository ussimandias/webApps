/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apples;

/**
 *
 * @author usmantarfa
 */
public class GenericMethodTest {
 
   // generic method printArray                         
  public static < E > void printArray( E[] inputArray )
  {      // Display array elements              
        for ( E element : inputArray ){        
           System.out.printf( "%s ", element );
        }
        System.out.println();
   }

    
}
