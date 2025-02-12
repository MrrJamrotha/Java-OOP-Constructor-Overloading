public class Book {
    private final String title;
    private final String author;
    private Double price;

    //Default constructor
    public Book(){
        this.title="Unknown";
        this.author="Unknown";
        this.price=0.0;
    }

    public Book(String title , String author){
        this.title=title;
        this.author = author;
        // Initialize price to 0.0
        this.price = 0.0;
    }

    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }
}
