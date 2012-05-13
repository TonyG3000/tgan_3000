
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test for DimPoint
		double[] anArray1 = {3.4, 5.6, 7.9, 8.9, 13.2};
		double[] anArray2 = {13.4, 2.6, 1.9, 0.9, 11.2};
		double[] anArray3 = {11.4, 22.3, 1.69, 0.19, 1.2};
		DimPoint dp1 = new DimPoint(anArray1);
		DimPoint dp2 = new DimPoint(anArray2);
		DimPoint dp3 = new DimPoint(anArray3);
		System.out.println(dp1.getUser()[2] + " AND " + dp2.getUser()[4]);
		
		// test cluster
		dp1.toPrint();
		dp3.toPrint();
		
		Cluster clt = new Cluster();
		clt.addPoint(dp1);
		clt.addPoint(dp2);
		clt.addPoint(dp3);
		
		clt.toPrint();
	}

}
