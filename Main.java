import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        Present present1 = new Present("Teddy Bear");
        present1.addTag("Soft");
        present1.addTag("For Kids");
        present1.display();

        Present present2 = new Present("Diamond Ring");
        present2.addTag("Luxury");
        present2.addTag("Expensive");
        present2.display();

        Present present3 = new Present("Disney Lego Set");
        present3.addTag("Brainwork");
        present3.addTag("Teenager");
        present3.display();
 
    }
}
