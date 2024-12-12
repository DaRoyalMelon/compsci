package pkg;

public class Movie{

String movie;
double rating;
int numberOfRatings;
int revenue;

public Movie(){
    movie = "Avengers";
    rating = 8.0;
    numberOfRatings = 33;
    revenue = 623357910;
}
    public Movie(String mov, double rat, int nOR, int rev){
    movie = mov;
    rating = rat;
    numberOfRatings = nOR;
    revenue = rev;
}    
    public void movieToString(){
        System.out.println(movie);
        System.out.println(rating);
        System.out.println(numberOfRatings);
        System.out.println(revenue);
        System.out.println("");
}
    public String getMovieName(){
        return(movie);
    }
    public int getRevenue(){
        return(revenue);
    }
    public double addRating(){
        double rat1;
        double rat2;
        rating = rating + rat1 + rat2;
    }
}



    
