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
public class FingerPrints implements Chain{
     private Chain nextInChain;
    public void setNextChain(Chain nextChain)
    {
        nextInChain = nextChain;
    }
    public void process(Application app)
    {
           System.out.println("Applicant : "+ app.getName() + " has gave his/her Finger Print. Pleas go to Verify nd Submit Counter ");
           nextInChain.process(app);
    }
    }
