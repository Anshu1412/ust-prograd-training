import java.util.Stack;

class Bookshelf{
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("c");
        books.push("Java");
        books.push("Oracle");
        books.push("Python");
        System.out.println(books);
        books.push("Oracle");
        System.out.println(books);
        System.out.println(books.search("Python"));

    }

}