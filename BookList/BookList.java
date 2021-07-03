import java.util.ArrayList;

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book(297, "Yaşar Kemal", "12.12.2012", "Kuşlar da gitti"));
        list.add(new Book(96, "Laszlo Bock", "12.12.2011", "Google'ın sırları"));
        list.add(new Book(234, "Linvaneli", "12.12.2013", "Serenad"));
        list.add(new Book(3243, "George Orwell", "12.12.2012", "1984"));
        list.add(new Book(122, "Jules Verne", "12.12.2013", "Ay'a yolculuk"));
        list.add(new Book(34, "Ray Bradbury", "12.12.2014", "Fahreneit 451"));
        list.add(new Book(300, "Lewis Perdue", "12.12.2015", "Tanrı'nın Kızı"));
        list.add(new Book(353, "Oktay Sinanoğlu", "12.12.2016", "Bye Bye Türkçe"));
        list.add(new Book(341, "Jenna B.", "12.12.2002", "Yahudi Sevgili"));
        list.add(new Book(343, "Ömer Seyfettin", "12.12.2009", "Kaşağı"));
        
        list.stream().forEach(book -> System.out.println(book.getAuthor()));

        ArrayList<Book> newList = new ArrayList<>();

        list.stream().filter(elem -> elem.getNumberOfPages()>100).forEach(book -> newList.add(book));
        System.out.println(list.toString());
    }
}