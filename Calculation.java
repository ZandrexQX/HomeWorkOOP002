public class Calculation {
    public static void main(String[] args) {
        Add a1 = new Add(2f,5.4f);
        Subtraction s1 = new Subtraction(43.5f,32.1f);
        Multiplication m1 = new Multiplication(3.4f,2.5f);
        Division d1 = new Division(4.4f,4f);
        System.out.println(a1.oper());
        System.out.println(s1.oper());
        System.out.println(m1.oper());
        System.out.println(d1.oper());
    }
}
