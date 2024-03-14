class Book extends  Item{
    @Override
    public void showinfo() {
        System.out.println(this.name+ " " + this.getDescription()+ " " + this.ID+ " " + this.gia+ " " + this.author_name +" "+ this.numberOfPages +" "+ this.genre);
    }
    public String author_name;
    public int numberOfPages;
    public  String genre;
    public Book(String name, String description, String ID, int gia, String author_name, int numberOfPages, String genre){
        super(name, description, ID, gia);
        this.author_name = author_name;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
}
