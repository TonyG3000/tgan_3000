import java.util.Arrays;


public class DimPoint {
	private double[] user;
	
	public DimPoint(double[] x){
		this.setUser(x);
	}

	public double[] getUser() {
		return user;
	}

	public void setUser(double[] user) {
		this.user = user;
	}
	
	public void toPrint() {
		System.out.println(Arrays.toString(user));
	}
}
