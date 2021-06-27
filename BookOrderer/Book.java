public class Book implements Comparable<Book>{
    private int pages;
    private String name, authorName, publishDate;


    public Book(int pages, String name, String author, String pubDate) {
        this.pages = pages;
        this.name = name;
        this.authorName = author;
        this.publishDate = pubDate;
    }

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return pages+ ", " + name + ", " + authorName + ", "+ publishDate;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public String getAuthorName() {
        return authorName;
    }
    
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    public String getPublishDate() {
        return publishDate;
    }
    
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    
}
