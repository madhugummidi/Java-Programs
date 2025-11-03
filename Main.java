import java.util.Scanner;

class Book {
    String author;
    String title;
    double price;

    Book(String a, String t, double p) {
        author = a;
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Author name is " + author + ", Title Name is " + title + ", Price is " + price);
    }
}

class BookCreator {
    static Book create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Author Name");
        String a = sc.nextLine();
        System.out.println("Enter Title Name");
        String t = sc.nextLine();
        System.out.println("Enter Price");
        double p = sc.nextDouble();
        return new Book(a, t, p);
    }
}

class Main {
    public static void main(String[] args) {
        Book b = BookCreator.create();
        Book b1 = BookCreator.create();
        b.display();
        b1.display();
    }
}