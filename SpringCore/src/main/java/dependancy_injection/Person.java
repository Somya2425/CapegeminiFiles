package dependancy_injection;

public class Person {
    private String name;
    private String id;
    private Pan pan;


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    @Override
    public String toString() {
        return (name + " " +id+ " " + pan);
    }
}
