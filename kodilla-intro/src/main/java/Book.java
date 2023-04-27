public class Book {
        private String author;
        private String title;

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public static Book of(String author, String title) {
            return new Book(author, title);
    }
    Book book = Book.of("J.K. Rowling", "Harry Potter and the Philosopher's Stone");
    Book book1 = Book.of("Isaac Asimov", "The Galaxy");
    Book book2 = Book.of("B.A. Paris", "Behind Closed Doors");
}

