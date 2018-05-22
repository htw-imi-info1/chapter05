
public class Movie
{
    private String title;
    private int releaseYear = 0;
    private boolean watched;
    public Movie(String title, boolean watched, int releaseYear){
        this.title = title;
        this.watched = watched;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear(){return releaseYear;}

    public boolean isWatched(){return watched;}

    public String toString(){
        return "Movie "+title+" - year: "+releaseYear+ (watched ? " " : " not ") + "watched"; 
    }
}
