public class Lingkaran {
    public static float PI = 3.14f;
    static public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return Lingkaran.PI * r * r;
    }
}