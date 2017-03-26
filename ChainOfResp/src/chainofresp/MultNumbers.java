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
 class MultNumbers implements Chain{

	private  Chain nextInChain;
	
	
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}


	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "mult"){
			
			System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
					(request.getNumber1()*request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}

	
	
}

 
