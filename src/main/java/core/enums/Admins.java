package core.enums;

public enum Admins {
    Admin(1, "Admin");
    private int id;
    private String rank;
    Admins(int id, String rank){
        this.id = id;
        this.rank = rank;
    }
    public int getId(){
        return this.id;
    }
}
