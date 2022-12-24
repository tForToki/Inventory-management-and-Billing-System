package source;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Iterator;

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
    	return calculateAuthorDiscountPrice()+calculateBookDiscountPrice()+calculateGenreDiscountPrice();
        //TODO: needs to be implemented
    }

    public double calculateAuthorDiscountPrice(){
    	int cnt =1;
    	int index = 0 ;
    	for (int i = 0; i < books.length; i++) {
    		if(cnt ==3) {
    			index = i;
    		}
			if ((i<books.length-1) && books[i].getWriter() == books[i+1].getWriter()) {
				cnt++;
			}
		}
        boolean bool = isAuthorDiscountEligible();
        if(bool == true)
        	return (books[index].getPrice()-(books[index].getPrice())*((45/100)));
        else
        	return 0;
       
    }

    public double calculateBookDiscountPrice(){
    	double total =0;
    	for (int i = 0; i < books.length; i++) {
    		total +=(books[i].getPrice()-(books[i].getPrice())*((books[i].getPercentageDiscount())/100));
		}
    	return total;
    	
    }

    public double calculateGenreDiscountPrice(){
    	double total =0;
    	for (int i = 0; i < books.length; i++) {
    		total +=(books[i].getPrice()-(books[i].getPrice())*((books[i].getGenre().getGenreDiscount())/100));
		}
    	return total;
    }

    public boolean isAuthorDiscountEligible(){
    	int cnt =1;
    	for (int i = 0; i < books.length; i++) {
			if ((i<books.length-1) && books[i].getWriter() == books[i+1].getWriter()) {
				cnt++;
			}
		}
    	if(cnt>=3)
    		return true;
    	else
    		return false;
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
