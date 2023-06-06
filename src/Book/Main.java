package Book;

import Book.Book;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("The Great Gatsby"));
        bookShelf.appendBook(new Book("To Kill a Mockingbird"));
        bookShelf.appendBook(new Book("1984"));
        bookShelf.appendBook(new Book("Pride and Prejudice"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}