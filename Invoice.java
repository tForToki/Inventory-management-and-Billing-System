package books_now;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Invoice {
    private Book[] books;
    private LocalDateTime date;
    private int numberOfBooks=0;

    public Invoice(){

    }

    public Book[] getBook(){
        //TODO: needs to be implemented
    }

    public LocalDateTime getDateTime(){
        //TODO: needs to be implemented
    }

    public void addBook(Book book){
        //TODO: needs to be implemented
    }

    public double getFinalPrice(){
        //TODO: needs to be implemented
    }

    public double calculatePrice(){
        //TODO: needs to be implemented
    }

    public double calculateAuthorDiscountPrice(){
        //TODO: needs to be implemented
    }

    public double calculateBookDiscountPrice(){

    }

    public double calculateGenreDiscountPrice(){

    }

    public double isAuthorDiscountEligible(){

    }

	@Override
	public String toString() {
		return "Invoice [books=" + Arrays.toString(books) + ", date=" + date + ", numberOfBooks=" + numberOfBooks
				+ ", getFinalPrice()=" + getFinalPrice() + ", calculatePrice()=" + calculatePrice()
				+ ", calculateAuthorDiscountPrice()=" + calculateAuthorDiscountPrice()
				+ ", calculateBookDiscountPrice()=" + calculateBookDiscountPrice() + ", calculateGenreDiscountPrice()="
				+ calculateGenreDiscountPrice() + ", isAuthorDiscountEligible()=" + isAuthorDiscountEligible() + "]";
	}

    
}
