
import java.util.Scanner;

public  class Solution{
    public static void main(String[] args){

        int regNo;
        String agencyName;
        String packageName;
        int price;
        boolean flightFacility;

        TravelAgencies[] travelAgencies = new TravelAgencies[4];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
             regNo = sc.nextInt();
            sc.nextLine();
             agencyName = sc.nextLine();
             packageName = sc.nextLine();
             price = sc.nextInt();
             flightFacility = sc.nextBoolean();

             travelAgencies[i] = new TravelAgencies(regNo , agencyName, packageName, price, flightFacility);
        }

        int regNo1 = sc.nextInt();
        sc.nextLine();
        String packageName1 = sc.nextLine();

        int highestPackagePrice = findAgencyWithTheHighestPackagePrice(travelAgencies);
        System.out.println(highestPackagePrice);

        TravelAgencies travelAgencies1 = agencyDetailsForGivenIdAndType(travelAgencies,regNo1, packageName1 );
        System.out.println(travelAgencies1.getAgencyName() +":"+ travelAgencies1.getPrice());

    }

    public static int findAgencyWithTheHighestPackagePrice(TravelAgencies[] travelAgencies){

        int highestPackagePrice = 0;
        for(int i=0;i<travelAgencies.length;i++){
            if(travelAgencies[i].getPrice()>highestPackagePrice){
                highestPackagePrice = travelAgencies[i].getPrice();
            }
        }

        return  highestPackagePrice;
     }


    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] travelAgencies, int regNo, String packageType){

       for(int i=0;i<travelAgencies.length;i++){
           if(travelAgencies[i].getFlightFacilty()){
               if(travelAgencies[i].getRegNo()==regNo && travelAgencies[i].getPackageType().equalsIgnoreCase(packageType)){
                   return travelAgencies[i];
               }
           }
       }
        return null;
    }


}

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo , String agencyName, String packageType, int price , boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo(){
        return  this.regNo;
    }

    public String getAgencyName(){
        return this.agencyName;
    }

    public String getPackageType(){
        return this.packageType;
    }

    public int getPrice(){
        return this.price;
    }
    public boolean getFlightFacilty(){
        return this.flightFacility;
    }

    public void setRegNo(int regNo){
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName){
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType){
       this.packageType = packageType;
    }

    public void setPrice(int price){
       this.price = price;
    }

    public void setFlightFacility(boolean flightFacility){
        this.flightFacility = flightFacility;

    }

}














// inputs : 
/*

123
A2Z agency 
Platinum
50000
true
345
SSS agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond

*/



