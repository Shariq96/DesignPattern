/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp;

/**
 *
 * @author Sam
 */
interface Chain {

	// Defines the next Object to receive the data
	// if this Object can't process it
	
	public void setNextChain(Chain nextChain);
	
	// Either solves the problem or passes the data
	// to the next Object in the chain
	
	public void calculate(Numbers request);
	
}
