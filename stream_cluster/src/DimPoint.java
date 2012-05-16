import java.util.Arrays;


public class DimPoint {
	private double[] user;
	
	public DimPoint(double[] x){
		this.setUser(x);
	}
	
	public double calDistance(double[] dest){
		double sum = 0d;
		for (int k= 0; k < user.length; k++){
			sum += Math.pow( (Double)user[k] - (Double)dest[k], 2);
		}
		return Math.sqrt(sum);
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
