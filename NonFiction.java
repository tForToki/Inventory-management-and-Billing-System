package books_now;

public class NonFiction implements Genre {
    private String GENRE = "Non-Fiction";
    private String subGenre;
    private double genreDiscount = 10.0;

    public NonFiction(String subGenre) {
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
