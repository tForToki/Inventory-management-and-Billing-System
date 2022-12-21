package source;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Invoice {
    private Book[] books;
    private LocalDateTime date;
    private int numberOfBooks=0;

    public Invoice(){

    }

    public Book[] getBook(){
		return books;
        //TODO: needs to be implemented
    }

    public LocalDateTime getDateTime(){
		return date;
        //TODO: needs to be implemented
    }

    public void addBook(Book book){
    	books[numberOfBooks]=book;
    	//TODO: needs to be implemented
    }

    public double getFinalPrice(){
        //TODO: needs to be implemented
    }

    public double calculatePrice(){
    	return books[numberOfBooks].getPrice()-calculateAuthorDiscountPrice()-calculateBookDiscountPrice()-calculateGenreDiscountPrice();
        //TODO: needs to be implemented
    }

    public double calculateAuthorDiscountPrice(){
        //TODO: needs to be implemented
    }

    public double calculateBookDiscountPrice(){
    	return (books[numberOfBooks].getPrice()*(books[numberOfBooks].getPercentageDiscount()/100));
    }

    public double calculateGenreDiscountPrice(){
    	return (books[numberOfBooks].getPrice())*((books[numberOfBooks].getGenre().getGenreDiscount())/100);
    }

    public double isAuthorDiscountEligible(){
    	//TODO: needs to be implemented
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
