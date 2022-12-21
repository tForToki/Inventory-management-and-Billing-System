package books_now;

public class Book implements Comparable{

    private String name;
    private double price;
    private Author writer;
    private double percentageDiscount;
    private Genre genre;
    private String isbn;
    private int yearOfPublish;

    public Book(String name, double price, Author writer, double percentageDiscount, Genre genre, String isbn, int yearOfPublish){
       this.name = name;
       this.price = price;
       this.writer = writer;
       this.percentageDiscount = percentageDiscount;
       this.genre = genre;
       this.isbn = isbn;
       this.yearOfPublish = yearOfPublish;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getWriter() {
        return writer;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int compareTo(Book book){
        /* TODO: have to fill this up */
        return 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", writer=" + writer +
                ", percentageDiscount=" + percentageDiscount +
                ", genre=" + genre +
                ", isbn='" + isbn + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                '}';
    }
}
