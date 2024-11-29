class Student{
    static int mark = 0;
    static String teacher = "Guru";
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.mark=50;
        s2.mark=100;

        Student.mark = 200;


        System.out.println(s1.mark);

    }
}
