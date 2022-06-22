import java.util.*;


public class MyClass{
	public static void main(String args[]) {
		
		int beachId;
		String beachName;
		String location;
		String beachType;
		int rating;
		int avgVisitorsPerday;
		
		
		Beach beach[] = new Beach[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<beach.length;i++) {
			beachId = sc.nextInt() ;
			sc.nextLine();
			beachName = sc.nextLine();
			location = sc.nextLine();
			beachType = sc.nextLine();
			rating = sc.nextInt();
			avgVisitorsPerday = sc.nextInt() ; 
			
			beach[i] = new Beach(beachId, beachName , location, beachType , rating , avgVisitorsPerday);
			
	
		}
		
	sc.nextLine();
	String queryLocation = sc.nextLine();
	int avgVisitors = sc.nextInt();
	
	int result = findBeachWithLowestRating(beach , queryLocation , avgVisitors);
	if(result == 0) {
		System.out.println("No such beach");
	}else {
		System.out.println(result);
	}
		

		
	}
	
	static int findBeachWithLowestRating(Beach[] b,String location , int avgVisitors ) {
		
		ArrayList<Beach> beach = new ArrayList<Beach>();
		
		for(int i=0;i<b.length;i++) {
			if(b[i].getLocation().equals(location) && b[i].getAvgVisitorsPerday() > avgVisitors) {
				beach.add(b[i]);
			}
		}
		
		if(beach.size()==0) {
			return 0;
		}else {
			Comparator<Beach> mySort = Comparator.comparing(Beach :: getRating);
			Collections.sort(beach , mySort);
			return beach.get(0).getRating();
		}
		

		
		
		
	}
	
	
}

class Beach{
	int beachId;
	String beachName;
	String location;
	String beachType;
	int rating;
	int avgVisitorsPerday;
	
	
	Beach( int beachId, String beachName , String location, String beachType, int rating, int visitors ){
		this.beachId = beachId;
		this.beachName = beachName;
		this.location = location;
		this.beachType = beachType;
		this.rating = rating;
		this.avgVisitorsPerday = visitors;
	}
	
	public int getBeachId() {
		return this.beachId;
	}

	public String getBeachName() {
		return this.beachName;
	}

	public void setBeachName(String beachName) {
		this.beachName = beachName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBeachType() {
		return this.beachType;
	}

	public void setBeachType(String beachType) {
		this.beachType = beachType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getAvgVisitorsPerday() {
		return avgVisitorsPerday;
	}

	public void setAvgVisitorsPerday(int avgVisitorsPerday) {
		this.avgVisitorsPerday = avgVisitorsPerday;
	}

	public void setBeachId(int beachId) {
		this.beachId = beachId;
	}
	
	
	
}