public class SchoolApp {
    public static void main(String[] args) {
        Student miki = new Student("Miki");
        Student mini = new Student("Mini");

        System.out.println("Grade " + miki.getNama() + " " + miki.skor);
        System.out.println("Grade " + mini.getNama() + " " + mini.skor);

        mini.setNama("Mono");

        System.out.println("Grade " + miki.getNama() + " " + miki.skor);
        System.out.println("Grade " + mini.getNama() + " " + mini.skor);
    }
}