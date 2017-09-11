package callOption;

import java.util.GregorianCalendar;
import java.util.Random;

public class PayoffFunctions extends Payoff {
	private static final long serialVersionUID = 1L;

	public PayoffFunctions() {
		super();
	}
	
	public double tau(GregorianCalendar x, GregorianCalendar y) {
		long xMillSecond = x.getTimeInMillis();
	    long yMillSecond = y.getTimeInMillis();
	    long dateDifference = yMillSecond - xMillSecond;

	    double tau = (dateDifference / 86400000 )/360.0;
	    return tau;
	}
	
	
	public double gaussian(double x0, double y, double z, double t) {
		Random r =new Random();
	    double normal = r.nextGaussian();
	    
	    double ST=x0*(Math.exp((y-Math.pow(z, 2)*t)+Math.sqrt(z*t)*normal));
	    
	    return ST;
	}
	
	public double payoff(double x, double y) {
		double payoff;
		if(x>y) {
	    	payoff = x-y;
	    }
	    else {
	    	payoff=0;
	    }
		return payoff;
	}
	
    

}
