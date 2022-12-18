package books_now;

public class Fiction implements Genre {

    private String GENRE = "Fiction";
    private String subGenre;
    private double genreDiscount;


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
        return null;
    }

    public double getGenreDiscount() {
        return genreDiscount;
    }

    public void setGenreDiscount(double genreDiscount) {
        this.genreDiscount = genreDiscount;
    }
}

