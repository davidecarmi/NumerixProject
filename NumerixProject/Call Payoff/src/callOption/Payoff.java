package callOption;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Payoff implements Serializable {
	private static final long serialVersionUID = 1L;
	private double rate;
	private double volatility;
	private GregorianCalendar maturity;
	private GregorianCalendar today;
	private double S0;
	private double strike;
	private double finalValue;
	
	public Payoff () {	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getVolatility() {
		return volatility;
	}

	public void setVolatility(double volatility) {
		this.volatility = volatility;
	}

	public GregorianCalendar getMaturity() {
		return maturity;
	}

	public void setMaturity(GregorianCalendar maturity) {
		this.maturity = maturity;
	}

	public GregorianCalendar getToday() {
		return today;
	}

	public void setToday(GregorianCalendar today) {
		this.today = today;
	}

	public double getS0() {
		return S0;
	}

	public void setS0(double s0) {
		S0 = s0;
	}

	public double getStrike() {
		return strike;
	}

	public void setStrike(double strike) {
		this.strike = strike;
	}

	public double getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(double finalValue) {
		this.finalValue = finalValue;
	}	
	
}
