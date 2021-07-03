
public class Book {
    private int numberOfPages;
    private String name, author, releaseDate;

    Book(int pages, String author, String date, String name) {
        this.numberOfPages = pages;
        this.author = author;
        this.releaseDate = date;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Name: "+name +
               "Author: " + author +
               "Number of pages: " + numberOfPages+
               "Published at: " + releaseDate;
    }

}