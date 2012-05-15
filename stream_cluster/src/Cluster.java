import java.util.ArrayList;


public class Cluster {
	private ArrayList<DimPoint> PointSet;
	private DimPoint Center;
	
	public Cluster(){
		this.PointSet = new ArrayList<DimPoint>();
	}
	
	public Cluster(ArrayList<DimPoint> x){
		this.setPointSet(x);
	}

	public double calCost(){
		double cost = 0d;
		for (DimPoint s : PointSet){
			cost += s.calDistance(Center.getUser());
		}
		return cost;
	}
	
	//public void calMedianCenter(){
	//	for (DimPoint s : PointSet){
	//	}
	//}
	
	public ArrayList<DimPoint> getPointSet() {
		return PointSet;
	}

	public void setPointSet(ArrayList<DimPoint> pointSet) {
		PointSet = pointSet;
	}
	
	public void addPoint(DimPoint s){
		this.PointSet.add(s);
	}
	
	public void toPrint(){
		System.out.println("[Start Printing Cluster...]");
		for (DimPoint s : PointSet){
			s.toPrint();
		}
		System.out.println("[End Of Printing]");
	}

	public int getSize() {
		return PointSet.size();
	}

	public DimPoint getCenter() {
		return Center;
	}

	public void setCenter(DimPoint center) {
		Center = center;
	}

}
