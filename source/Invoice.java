package source;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Invoice {
	private Book[] books = new Book[10000];
	private LocalDateTime date;
	private int numberOfBooks;
	private int index;

	public Invoice() {
		this.numberOfBooks = 0;
		this.date = LocalDateTime.now();
	}

	public Book[] getBook() {
		return books;
	}

	public String getDateTime() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = date.format(format);
		return formatDateTime;
	}

	public void addBook(Book book) {
		books[this.numberOfBooks] = book;
		this.numberOfBooks++;
	}

	public double getFinalPrice() {
		double d1 = calculateGenreDiscountPrice();
		double d2 = calculateAuthorDiscountPrice();
		double d3 = calculateBookDiscountPrice();
		if(Double.compare(d1, d2) < 0 && Double.compare(d1, d3)<0) {
			return d1;
		}
		else if(Double.compare(d2, d1)<0 && Double.compare(d2, d3)<0) {
			return d2;
		}
		else {
			return d3;
		}
	}

	public double calculatePrice() {
		double withoutDiscountPrice = 0;
		for (int i = 0; i < this.numberOfBooks; i++) {
			withoutDiscountPrice += books[i].getPrice();
		}
		return withoutDiscountPrice;
	}

	public double calculateAuthorDiscountPrice() {

		if (isAuthorDiscountEligible()) {
			return 3.0*books[index].getPrice() * (1 - 0.45);
		} else
			return 0;

	}

	public double calculateBookDiscountPrice() {
		double bookDiscount = 0;
		for (int i = 0; i < this.numberOfBooks; i++) {
			bookDiscount += books[i].getPercentageDiscount();
		}
		return (calculatePrice()-(calculatePrice()*(bookDiscount))/100);
	}

	

	public double calculateGenreDiscountPrice() {
		double genreDiscount = 0;
		for (int i = 0; i < this.numberOfBooks; i++) {
			genreDiscount += books[i].getGenre().getGenreDiscount();
		}
		return (calculatePrice()-calculatePrice()*(genreDiscount/100));
	}

	public boolean isAuthorDiscountEligible() {
		int cnt;
		for (int i = 0; i < this.numberOfBooks; i++) {
			cnt = 1;
			for (int j = i + 1; j < this.numberOfBooks; j++) {
				if (this.books[i].getWriter() == this.books[j].getWriter()) {
					cnt++;
				}
			}
			if (cnt >= 3) {
				this.index = i;
				return true;
			}

		}

		return false;
	}
	
	

	@Override
	public String toString() {
		String s = String.format("purchase date: %s\n",getDateTime());
		for(int i=0;i<this.numberOfBooks;i++) {
			s = String.format(s+"%d. %s : %.1f\n",i+1,this.books[i].getName(),this.books[i].getPrice());
		}
		s = String.format(s+"price: %.1f\n"
				+ "price after discount: %.2f",calculatePrice(),getFinalPrice());
		
		return s;
	}
	

}
