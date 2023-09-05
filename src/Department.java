
/*
Fields:
Id
Title
Methods:
Getters
Setters
Constructors: default & non-default
toString()

 */
public class Department {

    public int id;
    public String title;

    public Department() {
    }

    public Department(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
