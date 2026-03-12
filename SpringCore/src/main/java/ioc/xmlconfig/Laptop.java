package ioc.xmlconfig;

public class Laptop {

    int id;
    private String name;
    private String model;

//    public Laptop(int id, String name, String model) {
//        this.id = id;
//        this.name = name;
//        this.model = model;
//   }

   

    @Override
    public String toString() {
        return id + " " + name + " " + model;
    }

    public void setId(String id) {
    }

    public void setName(String name) {
    }
    public void setModel(String model){

    }
}