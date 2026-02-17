public abstract class User {
    private String name;
    private int id;
    // TODO: declare fields
    // name
    // id
    public User(String name,int id){
        this.name = name;
        this.id = id;
    }
    public abstract void manageService(Service s);
    public abstract void useService(Service s);
    public String getName() {
    return name;
}
    // TODO: constructor


    // TODO: abstract method manageService(Service s)


    // TODO: abstract method useService(Service s)

}