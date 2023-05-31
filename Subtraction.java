public class Subtraction extends Operation implements OperInterface{
    Subtraction(float a, float b) {
        super(a, b);
    }

    @Override
    public float oper() {
        return super.getA()-super.getB();
    }
}
