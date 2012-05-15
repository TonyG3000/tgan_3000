import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class  HQKmedian{
	private ArrayList<DimPoint> data; //set N
	private ArrayList<Cluster> clusters; 
	private ArrayList<DimPoint> clusterCenters;

	private int clusterNum; // k
	private int facilityCost; //facility cost z
	
	//public double calFacilityCost(ArrayList<DimPoint> a){
	//	double fc = a.size()*facility;
	//	return clusterNum;
	//}
	
	public void initialSolution(){
		//Random randomGenerator = new Random();
		//int first = randomGenerator.nextInt(data.size());
		Collections.shuffle(data); //Reorder data points randomly
		int count = 0;
		for (DimPoint s : data){ // For all of the points in data set N
			if ( count == 0 ){ // first point
				clusterCenters.add(s);
			}else{ //so some check to decide if need to add this point as centre
				int nearIndex = findNearestCentre(s, clusterCenters);
				if ( s.calDistance(clusterCenters.get(nearIndex).getUser()) >= facilityCost ){
					clusterCenters.add(s); // add the point as a cluster centre
					Cluster newCluster = new Cluster();
					newCluster.addPoint(s);
					clusters.add(newCluster);
				}else{
					clusters.get(nearIndex).addPoint(s); // add to nearest cluster
				}
			}
			count++;
		}
	}
	
	//public void
	
	public int findNearestCentre(DimPoint a, ArrayList<DimPoint> centers){
		int index=0;
		double shortestDist=a.calDistance(centers.get(index).getUser());
		
		int curr=0;
		for (DimPoint b : centers){
			double distance=a.calDistance(b.getUser());
			if ( distance <= shortestDist ){ // if distance is shorter, assign as the nearest
				shortestDist=distance;
				index = curr;
			}
			curr++;
		}
		return index;
	}
	
	public void toPrint(){
		for (Cluster b : clusters){
			b.toPrint();
		}
	}
	
	
	public ArrayList<Cluster> getClusters() {
		return clusters;
	}

	public void setClusters(ArrayList<Cluster> clusters) {
		this.clusters = clusters;
	}

	public ArrayList<DimPoint> getClusterCenters() {
		return clusterCenters;
	}

	public void setClusterCenters(ArrayList<DimPoint> clusterCenters) {
		this.clusterCenters = clusterCenters;
	}

	public ArrayList<DimPoint> getData() {
		return data;
	}

	public void setData(ArrayList<DimPoint> data) {
		this.data = data;
	}

	public int getClusterNum() {
		return clusterNum;
	}

	public void setClusterNum(int clusterNum) {
		this.clusterNum = clusterNum;
	} 
	
}