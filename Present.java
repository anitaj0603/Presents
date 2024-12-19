import java.util.ArrayList;

public class Present {
    private String name;
    private ArrayList<String> tags; 
    private String TimeBought;

    public Present(String name) {
        this.name = name;
        this.tags = new ArrayList<>(); 

    }
    public String Time (String TimeBought) {
        this.TimeBought = TimeBought;
        return TimeBought;
    }

    public void display() {
        System.out.println("Present: " + name);
        System.out.println("Tags: " + tags);
    }


    public void addTag(String tag) {
        tags.add(tag);

    }
}
