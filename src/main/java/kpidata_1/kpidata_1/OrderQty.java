package kpidata_1.kpidata_1;

public class OrderQty {

	private String actual;
	private String target;


	public OrderQty(){}

	public OrderQty(String actual, String target){

		this.actual = actual;
		this.target = target;

	}


	public String getActual() {
		return actual;
	}

	public void setActual(String actual) {
		this.actual = actual;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}


	
}
