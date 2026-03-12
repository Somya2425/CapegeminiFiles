package dependancy_injection;

public class Pan {
    private int panId;
    private String panName;

    public void setPanId(int panId) {
        this.panId = panId;
    }

    public void setPanName(String panName) {
        this.panName = panName;
    }

    @Override
    public String toString() {
        return (panId +" "+ panName);
    }
}
