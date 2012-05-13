import java.util.ArrayList;


public class Cluster {
	private ArrayList<DimPoint> PointSet;
	
	public Cluster(){
		this.PointSet = new ArrayList<DimPoint>();
	}
	
	public Cluster(ArrayList<DimPoint> x){
		this.setPointSet(x);
	}

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
}
