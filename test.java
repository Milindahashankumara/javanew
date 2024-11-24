import java.util.Scanner ;

public class test{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Author author = new Author("Mili","british");

        System.out.println("Author details");
        author.displayauthor();

        System.out.println();

        Book book = new Book("1984","Dystopian", author);
        System.out.println("Book details");
        book.displayinfo();

        System.out.println();

        Magazine magazine = new Magazine("National Geographic", "Issue 202", "November 2024");
        System.out.println();
        magazine.displayinfo();


    }

    }

    class Author{

        String name;
        String nation;

        public Author(String name, String nation){
            this.name = name;
            this.nation = nation;
        }

        public void displayauthor(){
            System.out.println(name);
            System.out.println(nation);
        }

        public String getName(){
            return name;
        }
    }

    class Book extends Item{

        String genre;
        Author author;

        public Book(String title, String genre, Author author){
            super(title);
            this.genre = genre;
            this.author = author;

        }

        public void displayinfo(){
            super.displayinfo();
            System.out.println(genre);
            System.out.println(author.getName());
        }
    }

    class Magazine extends Item{
        String issue;
        String pdate;

        public Magazine(String title, String issue, String pdate){
            super(title);
            this.issue = issue;
            this.pdate = pdate;
        }

        public void displayinfo(){
            super.displayinfo();
            System.out.println(issue);
            System.out.println(pdate);

        }
    }
    class Item{

        String title;

        public Item(String title){
            this.title = title;
        }

        public void displayinfo(){
            System.out.println(title);
        }
    }