
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
		double[] anArray4 = {13.4, 2.6, 10.9, 5.9, 11.2};
		double[] anArray5 = {11.4, 12.3, 18.69, 10.19, 1.2};
		DimPoint dp1 = new DimPoint(anArray1);
		DimPoint dp2 = new DimPoint(anArray2);
		DimPoint dp3 = new DimPoint(anArray3);
		DimPoint dp4 = new DimPoint(anArray4);
		DimPoint dp5 = new DimPoint(anArray5);
		System.out.println(dp1.getUser()[2] + " AND " + dp2.getUser()[4]);
		
		// test cluster
		dp1.toPrint();
		dp3.toPrint();
		
		Cluster clt = new Cluster();
		clt.addPoint(dp1);
		clt.addPoint(dp2);
		clt.addPoint(dp3);
		clt.addPoint(dp4);
		clt.addPoint(dp5);
		clt.setCenter(dp5);
		
		clt.toPrint();
		
		System.out.println(clt.calCost());
	}

}
