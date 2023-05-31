public class Multiplication extends Operation implements OperInterface{
    Multiplication(float a, float b) {
        super(a, b);
    }

    @Override
    public float oper() {
        return super.getA()*super.getB();
    }
}
