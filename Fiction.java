package books_now;

public class Fiction implements Genre {

    private String GENRE = "Fiction";
    private String subGenre;
    private double genreDiscount = 9.0;


    public Fiction(String subGenre) {
        this.subGenre = subGenre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }

    @Override
    public String getGenre() {
        return GENRE;
    }

    public double getGenreDiscount() {
        return genreDiscount;
    }

    public void setGenreDiscount(double genreDiscount) {
        this.genreDiscount = genreDiscount;
    }
}

