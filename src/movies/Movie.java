package movies;

/** Create a class named Movie.*/
public class Movie {

    /** Should have private fields for name and category: */
    private String name;
    private String category;

/** and a constructor that sets both of these: */
    public Movie(String name, String category){
        this.name = name;
        this.category = category;

    }

/** Create methods to access these properties and change them (getters and setters).*/
    public void setMovie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String[] getMovie(){
        String[] movie = {this.name, this.category};
        return movie;
    }
}
