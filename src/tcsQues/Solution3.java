package tcsQues;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Institution[] arr=new Institution[4];
        for (int i = 0; i < 4; i++) {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();

            arr[i]=new Institution(a,b,c,d,e);

        }
        String location=sc.nextLine();
        String name=sc.nextLine();
        int res1=findNumClearancedByLoc(arr,location);
        if(res1>0){
            System.out.println(res1);
        }else {
            System.out.println("there are no cleared");
        }
        Institution res2=updateInstitutionGrade(arr,name);
        if(res2==null){
            System.out.println("No institution is available with specified name");
        }else{
            System.out.println(res2.getName()+"::"+res2.getGrade());
        }
    }
    public static int findNumClearancedByLoc(Institution[] arr,String location){
        int sum=0;
        for (int i = 0; i < 4; i++) {
            if(arr[i].getLocation().equals(location)){
                sum=sum+arr[i].getNoOfStudentCleared();
            }

        }
        return sum;
    }
    public static Institution updateInstitutionGrade(Institution[] arr,String name){
        for (int i = 0; i < 4; i++) {
            if(arr[i].getName().equals(name)){
                int rating=(arr[i].getNoOfStudentsPlaced()*100)/(arr[i].getNoOfStudentCleared());
                if(rating>=80){
                    arr[i].setGrade("A");
                }else{
                    arr[i].setGrade("B");
                }
                return arr[i];
            }

        }
        return null;
    }


}
class Institution{
    int id;
    String name;
    int noOfStudentsPlaced;
    int noOfStudentCleared;
    String location;
    String grade;

    public Institution(int id, String name, int noOfStudentsPlaced, int noOfStudentCleared, String location) {
        this.id = id;
        this.name = name;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentCleared = noOfStudentCleared;
        this.location = location;
//        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentCleared() {
        return noOfStudentCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public void setNoOfStudentCleared(int noOfStudentCleared) {
        this.noOfStudentCleared = noOfStudentCleared;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
