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
public interface Chain {
    
    public void setNextChain(Chain nextChain);
    public void process(Application app);
    
}
