public class Lingkaran {
    public static float PI = 3.14f;
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    static public float luas() {
        return Lingkaran.PI * r * r;
    }
}