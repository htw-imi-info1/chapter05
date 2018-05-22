
import java.util.ArrayList;
import java.util.stream.Collectors;
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
        movies.add(new Movie("f",false,1950));
    }

    public void printWatchedInYear(int year){
        movies.stream()
        .filter(movie -> movie.getReleaseYear() == year)
        .filter(movie -> movie.isWatched())
        .forEach(movie -> System.out.println(movie.toString()));
    }

    public String getWatchedInYear(int year){
        return movies.stream()
        .filter(movie -> movie.getReleaseYear() == year)
        .filter(movie -> movie.isWatched())
        .map(movie -> movie.toString())
        .collect(Collectors.joining("\n"));
    }

    public void demo1(){
        System.out.println(getWatchedInYear(1950));
    }

}
