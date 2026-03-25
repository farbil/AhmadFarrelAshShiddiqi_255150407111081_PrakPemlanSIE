public class Student {
    private String nama;
    public int skor;

    public Student(String nama) {
        this.nama = nama;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    public int getSkor() {
        return this.skor;
    }

    public String getNama() {
        return this.nama;
    }
}