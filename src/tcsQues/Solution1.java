package tcsQues;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TravelAgencies[] arr = new TravelAgencies[4];

        // Input for 4 agencies
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();

            String b = sc.nextLine();
            String c = sc.nextLine();

            int d = sc.nextInt();
            sc.nextLine();

            boolean e = sc.nextBoolean();
            sc.nextLine();

            arr[i] = new TravelAgencies(a, b, c, d, e);
        }

        // Additional inputs
        int regNo = sc.nextInt();
        sc.nextLine();

        String packageType = sc.nextLine();

        // Function 1
        int max = findAgencyWithHighestPackagePrice(arr);
        System.out.println(max);

        // Function 2
        TravelAgencies result = agencyDetailsForGivenIdAndType(arr, regNo, packageType);

        if (result != null) {
            System.out.println(result.getAgencyName() + ":" + result.getPrice());
        } else {
            System.out.println("No agency found");
        }

        sc.close();
    }

    // Function to find highest package price
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr) {
        int max = arr[0].getPrice();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getPrice() > max) {
                max = arr[i].getPrice();
            }
        }

        return max > 0 ? max : 0;
    }

    // Function to find agency by regNo and packageType with flight facility
    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] arr, int regNo, String packageType) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isFlightFacility() &&
                    arr[i].getRegNo() == regNo &&
                    arr[i].getPackageType().equalsIgnoreCase(packageType)) {

                return arr[i];
            }
        }

        return null;
    }
}

// Class
class TravelAgencies {

    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}