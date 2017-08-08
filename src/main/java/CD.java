import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class CD {
    private final String artist;
    private final String genre;
    private final int year;
    private final int price;
    private static ArrayList<CD> myCds = new ArrayList<>();


    public CD(String artist, String genre, int year, int price){
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.price = price;
        myCds.add(this);

    }
    public String getValue(){
        return artist;
    }

    public static ArrayList<CD> getAll() {
        return myCds;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public static void clearAllCDs(){
        myCds.clear();
    }
}

