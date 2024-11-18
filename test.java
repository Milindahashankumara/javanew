import java.util.Scanner ;

public class test{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Author author = new Author("Mili","british");

        System.out.println("Author details");
        author.displayauthor();

        System.out.println();

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
    }