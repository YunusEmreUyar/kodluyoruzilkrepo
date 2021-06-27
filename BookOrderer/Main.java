import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(12, "İnce Memed", "Yaşar Kemal", "12/04/2000");
        Book book2 = new Book(16, "Teneke", "Yaşar Kemal", "12/04/1999");
        Book book3 = new Book(122, "Ortadirek", "Yaşar Kemal", "12/04/2001");
        Book book4 = new Book(88, "Kuşlar da gitti", "Yaşar Kemal", "12/04/2002");
        Book book5 = new Book(300, "Tek kanatlı bir kuş", "Yaşar Kemal", "12/04/2003");

        TreeSet<Book> set1 = new TreeSet<>();

        set1.add(book1);
        set1.add(book2);
        set1.add(book3);
        set1.add(book4);
        set1.add(book5);

        for(Book b: set1) {
            System.out.println(b);
        }

        TreeSet<Book> set2 = new TreeSet<>(new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPages()- o2.getPages() ;
            }
        });

        set2.add(book1);
        set2.add(book2);
        set2.add(book3);
        set2.add(book4);
        set2.add(book5);

        System.out.println("***********************");
        for (Book item: set2) {
            System.out.println(item);
        }
        

    }
}