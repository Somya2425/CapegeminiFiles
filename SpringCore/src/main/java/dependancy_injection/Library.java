package dependancy_injection;

import java.util.List;

public class Library {
    private int id;
    private String name;
    private List<Pan> pans;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPans(List<Pan> pans) {
        this.pans = pans;
    }


    @Override
    public String toString() {
        return (id+" " + name+ " "+ pans);
    }
}

