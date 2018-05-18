
import java.util.ArrayList;
public class MovieDatabase
{
    ArrayList<Movie> movies = new ArrayList<>();
    public void printWatchedInYear(int year){
        movies.stream()
        .filter(movie -> movie.getReleaseYear() == year)
        .filter(movie -> movie.getWatched())
        .forEach(movie -> System.out.println(movie.toString()));
    }
}
