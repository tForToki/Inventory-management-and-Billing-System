package source;

public class BookCollection {
    private Book[] books;
    private int numberOfBooks;
    private int MAX_SIZE = 10000;

    public BookCollection(){
    	this.books = new Book[MAX_SIZE];
    	this.numberOfBooks =0;
    }

    public boolean addBook(Book book){
    	books[numberOfBooks] = book;
    	numberOfBooks++;
        return true;
        //TODO : Needs to be filled up
    }

    public boolean removeBook(int index){
        return true;
        //TODO : needs to be implemented
    }

    public Book getBook(String book) {
    	return books[numberOfBooks-1];
        //TODO : needs to be implemented
    }

    public Book[] getBookCollection() {
        return books;
        //TODO : needs to be implemented;
    }

    public void resetBooks(){

    }

    public int getNumberOfBooks(){
        return numberOfBooks;
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
		String str = "Books \n";
		for (int i = 0; i < numberOfBooks; i++) {
			str.concat(books[i].toString());
		}
		return str;
	}
    
    
}
