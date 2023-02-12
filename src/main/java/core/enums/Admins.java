package core.enums;

public enum Admins {
    Admin(395042016, "Admin"),
    Admin2(777832425, "Admin"),
    Artyom(408933640, "Admin");
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
