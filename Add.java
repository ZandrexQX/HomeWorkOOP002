public class Add extends Operation{

    Add(float a, float b) {
        super(a, b);
    }

    @Override
    public float oper() {
        return super.getA()+super.getB();
    }
}
