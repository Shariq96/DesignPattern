/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadraapp;

/**
 *
 * @author Sam
 */
public class NadraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chain chain1 = new PayFees();
        Chain chain2 = new ClickPicture();
        Chain chain3 = new DataEntry();
        Chain chain4 = new FingerPrints();
        Chain chain5 = new VerifynSubmit();
        
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);
        
        
        Application ap = new Application("Sharik","20");
        chain1.process(ap);
    }
    
}
