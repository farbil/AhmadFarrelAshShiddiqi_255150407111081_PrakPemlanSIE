public class Student {
    public String nama;
    public int skor;

    public Student(String nama) {
        this.nama = nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    public int getSkor() {
        return this.skor;
    }
}