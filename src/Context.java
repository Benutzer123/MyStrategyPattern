public class Context {
	private Strategy myStrat = null;
	
	public void dosomething() {
		myStrat.Allgorithm();
	}

	public Strategy getStrategy() {
	return myStrat;
	}

	public void setStrategy(Strategy s) {
this.myStrat = s;	
}
}