
public class Movie
{
    private int releaseYear = 0;
    private boolean watched;
    public int getReleaseYear(){return releaseYear;}

    public boolean getWatched(){return watched;}

    public String toString(){
        return "Movie - year: "+releaseYear+ (watched ? "" : "not ") + "watched"; 
    }
}
