package firstTask;

public class personTest {
    public static void main(String[] args) {
        person[] person = new person[4];
        person[0] = new person("Robin", "Doe", 12, 1, 1999);
        person[1] = new person("Pat", "Smith", 11, 3, 2002);
        person[2] = new person("Tyler", "Willians", 11, 25, 2002);
        person[3] = new person("Alex", "Park", 10, 1, 2000);
        for (int i = 0; i < 4; i++) {
            person[i].printDetails();
        }
    }
}
