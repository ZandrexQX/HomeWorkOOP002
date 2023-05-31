public class Add extends Operation implements OperInterface{

    Add(float a, float b) {
        super(a, b);
    }

    @Override
    public float oper() {
        return super.getA()+super.getB();
    }
}
