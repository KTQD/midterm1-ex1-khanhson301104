abstract class Item{
    public String name;
    private String description;

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    protected String ID;
    int gia;
    public abstract void showinfo();
    public Item(String name, String description, String ID, int gia){
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.gia = gia;
    }
}
