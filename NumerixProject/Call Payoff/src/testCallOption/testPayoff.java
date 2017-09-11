package testCallOption;

import java.util.GregorianCalendar;
import callOption.PayoffFunctions;

public class testPayoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayoffFunctions black = new PayoffFunctions();
		black.setRate(0.5);
		black.setVolatility(0.2);
		black.setS0(1);
		GregorianCalendar calendar1 = new GregorianCalendar(2017, GregorianCalendar.SEPTEMBER,10);
		black.setToday(calendar1);
		GregorianCalendar calendar2= new GregorianCalendar(2020, GregorianCalendar.MARCH,20);
		black.setMaturity(calendar2);
		
		double tau = black.tau(black.getToday(), black.getMaturity());
	    
	    black.setFinalValue(black.gaussian(black.getS0(), black.getRate(), black.getVolatility(), tau));
	    
	    black.setStrike(1);
	    
	    System.out.println("The payoff for this European Call Option is equal to: "+ black.payoff(black.getFinalValue(), black.getStrike()));
	}

}
