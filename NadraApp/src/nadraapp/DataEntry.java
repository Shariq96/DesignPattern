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
public class DataEntry implements Chain {
 private Chain nextInChain;
    public void setNextChain(Chain nextChain)
    {
        nextInChain = nextChain;
    }
    public void process(Application app)
    {
           System.out.println("Applicant : "+ app.getName() + " has Done DataEntry. Please gave Finger Prints ");
           nextInChain.process(app);
    }
    }
