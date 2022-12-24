package source;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Invoice {
	private Book[] books;
	private LocalDateTime date;
	private int numberOfBooks;
	private int index;

	public Invoice() {
		this.books = new Book[10000];
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
		books[numberOfBooks] = book;
		numberOfBooks++;
	}

	public double getFinalPrice() {
		double finalPrice = 0;
		finalPrice += (3*calculateAuthorDiscountPrice()) + calculateBookDiscountPrice() + calculateGenreDiscountPrice();
		return finalPrice;
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
			return books[index].getPrice() * (1 - 0.45);
		} else
			return 0;

	}

	public double calculateBookDiscountPrice() {
		double total = 0;
		for (int i = 0; i < books.length; i++) {
			total += (books[i].getPrice() - (books[i].getPrice()) * ((books[i].getPercentageDiscount()) / 100));
		}
		return total;

	}

	public double calculateGenreDiscountPrice() {
		double total = 0;
		for (int i = 0; i < books.length; i++) {
			total += (books[i].getPrice() - (books[i].getPrice()) * ((books[i].getGenre().getGenreDiscount()) / 100));
		}
		return total;
	}

	public boolean isAuthorDiscountEligible() {
		int cnt = 1;
		for (int i = 0; i < books.length; i++) {
			for (int j = i + 1; j < books.length; j++) {
				if ((j < books.length - 1) && books[i].getWriter() == books[j].getWriter()) {
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
		return "Invoice [books=" + Arrays.toString(books) + ", date=" + date + ", numberOfBooks=" + numberOfBooks
				+ ", getFinalPrice()=" + getFinalPrice() + ", calculatePrice()=" + calculatePrice()
				+ ", calculateAuthorDiscountPrice()=" + calculateAuthorDiscountPrice()
				+ ", calculateBookDiscountPrice()=" + calculateBookDiscountPrice() + ", calculateGenreDiscountPrice()="
				+ calculateGenreDiscountPrice() + ", isAuthorDiscountEligible()=" + isAuthorDiscountEligible() + "]";
	}

}
