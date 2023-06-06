package Book;

public class BookShelf implements Aggregate {
    private Book[] books; // 책의 집합
    private int last = 0; // 마지막 책이 꽂힌 위치

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        if (index < 0 || index >= last) {
            throw new IndexOutOfBoundsException();
        }
        return books[index];
    }

    public void appendBook(Book book) {
        if (last >= books.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
