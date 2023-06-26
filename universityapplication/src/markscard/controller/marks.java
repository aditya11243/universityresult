package markscard.controller;

public class marks {
    @Autowired
    public String totalmarks;

    public String getTotalmarks() {
        return totalmarks;
    }

    public void setTotalmarks(String totalmarks) {
        this.totalmarks = totalmarks;
    }
}
