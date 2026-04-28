package tcsQues;

import java.util.*;

public class solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Movie[] arr=new Movie[4];
        for (int i = 0; i < arr.length; i++) {
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Movie(a,b,c,d);

        }
        String genre=sc.nextLine();
        String res= Arrays.toString(getMovieByGenre(arr,genre));
        for (int i = 0; i < res.length(); i++) {
            System.out.println(res[i]);
        }

    }
    public static String[] getMovieByGenre(Movie[] arr,String genre){
        String[] arr2=new String[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getGenre().equalsIgnoreCase(genre)){
                if(arr[i].getBudget()>80000000){
                    arr2=Arrays.copyOf(arr2,arr2.length+1);
                    arr2[arr2.length-1]="High Budget Movie";
                }else{
                    arr2=Arrays.copyOf(arr2,arr2.length+1);
                    arr2[arr2.length-1]="Low Budget Movie";
                }
            }
        }
        return arr2;

    }
}

class Movie{
    String movieName;
    String company;
    String genre;
    int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
