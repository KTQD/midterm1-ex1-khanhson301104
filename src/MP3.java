class MP3 extends Item{
    @Override
    public void showinfo() {
        System.out.println(this.name + this.getDescription() + this.ID + this.gia + this.duration);
    }

    public int duration;
    public MP3(String name, String description, String ID, int gia, int duration){
        super(name,description,ID, gia);
        this.duration = duration;
    }
}
