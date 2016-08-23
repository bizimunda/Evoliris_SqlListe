package evoliris.com.evoliris_sqlliste.model;

import java.util.Date;

/**
 * Created by temp on 23/08/2016.
 */
public class Album {

    private int id;
    private String title;
    private Date outDate;
    private float rating;
    private String genre;
    private String url;
    private boolean Favourite;

    public Album(){

    }

    public Album(String title, Date outDate, float rating, String genre, String url, boolean favourite) {
        this.title = title;
        this.outDate = outDate;
        this.rating = rating;
        this.genre = genre;
        this.url = url;
        Favourite = favourite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isFavourite() {
        return Favourite;
    }

    public void setFavourite(boolean favourite) {
        Favourite = favourite;
    }
}
