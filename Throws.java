class Test{
    void Age() throws Exception {
        System.out.println(10/0);
    }
}

public class Throws {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.Age();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
