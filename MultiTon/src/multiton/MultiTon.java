/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiton;

/**
 *
 * @author Sam
 */
public class MultiTon {

   public  static MultiTon [] instance = new MultiTon [3];
       public static int count;
        private MultiTon()
        {
            
        }
        public static MultiTon getObj()
        {
            if (count <3) {
                instance[count] = new MultiTon();
                System.out.println("New Instance created " + count);
                count++;
              
            }
            
           if (count > 2) {
                count = 0;
               count++;
            }
           return instance[count-1];
           // System.out.println("New Instance created " + count);
           // return instance[count-1];
        
}
}
