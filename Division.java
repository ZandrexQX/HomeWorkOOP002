public class Division extends Operation implements OperInterface{
    Division(float a, float b) {
        super(a, b);
    }

    @Override
    public float oper() {
        if(super.getB() !=0) return super.getA()/super.getB();
        else throw new RuntimeException("Деление на ноль");
    }
}
