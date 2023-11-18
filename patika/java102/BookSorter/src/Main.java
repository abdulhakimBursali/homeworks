import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main thisClass = new Main();
        thisClass.printByName();
        System.out.println("***************************");
        thisClass.printByPageNumber();
    }

    public void printByName(){
        TreeSet<Book> bookListOrderedByName = new TreeSet<>(new BookComparatorByName());

        bookListOrderedByName.add(new Book("G-Book", 40));
        bookListOrderedByName.add(new Book("A-Book", 20));
        bookListOrderedByName.add(new Book("Z-Book", 60));

        for (Book bk: bookListOrderedByName){
            System.out.println("İsim " + bk.getBookName());
        }
    }

    public void printByPageNumber(){
        TreeSet<Book> bookListOrderedByName = new TreeSet<>(new BookComparatorByPageNumber());

        bookListOrderedByName.add(new Book("G-Book", 40));
        bookListOrderedByName.add(new Book("A-Book", 20));
        bookListOrderedByName.add(new Book("Z-Book", 60));

        for (Book bk: bookListOrderedByName){
            System.out.println("İsim " + bk.getBookName() + " Sayfa sayısı: " + bk.getNumberOfPages());
        }
    }
}