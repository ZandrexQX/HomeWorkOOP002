public abstract class Operation {
    private float a;
    private float b;
    Operation(float a, float b){
        this.a = a;
        this.b = b;
    }
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}
