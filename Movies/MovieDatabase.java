
import java.util.ArrayList;
public class MovieDatabase
{
    ArrayList<Movie> movies = new ArrayList<>();

    public MovieDatabase(){
        generateSomeTestData();
    }

    private void generateSomeTestData(){
        movies.add(new Movie("a",true,1950));
        movies.add(new Movie("b",false,1950));
        movies.add(new Movie("c",true,1980));
        movies.add(new Movie("d",true,1950));
        movies.add(new Movie("e",true,1951));

    }

    public void printWatchedInYear(int year){
        movies.stream()
        .filter(movie -> movie.getReleaseYear() == year)
        .filter(movie -> movie.getWatched())
        .forEach(movie -> System.out.println(movie.toString()));
    }
}
