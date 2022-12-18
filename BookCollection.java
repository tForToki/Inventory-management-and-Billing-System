package books_now;

import java.util.Arrays;

public class BookCollection {
    private Book[] books;
    private int numberOfBooks =0;
    private int MAX_SIZE = 10000;

    public BookCollection(){

    }

    public boolean addBook(Book book){
        return true;
        //TODO: Needs to be filled up
    }

    public boolean removeBook(int index){
        return true;
        //TODO: needs to be implemented
    }

    public Book getBooks(String book) {
        //TODO : needs to be implemented
    }

    public Book[] getBookCollection() {
        return books;
        //todo: needs to be implemented;
    }

    public void resetBooks(){

    }

    public int getNumberOfBooks(){
        return ;
        //TODO: needs to be implemented
    }

    public void sortByIsbn(){
        //TODO: needs to be implemented
    }

    public void sortByYearOfPublish(){
        //TODO: needs to be implemented
    }

    public void sortByPrice(){
        //TODO: needs to be implemented
    }

	@Override
	public String toString() {
		return "BookCollection [books=" + Arrays.toString(books) + ", numberOfBooks=" + numberOfBooks + ", MAX_SIZE="
				+ MAX_SIZE + ", getBookCollection()=" + Arrays.toString(getBookCollection()) + ", getNumberOfBooks()="
				+ getNumberOfBooks() + "]";
	}
    
    
    
    
}
