class calculator {
    int ans;
}

class mul extends calculator {
    int mul(int a, int b) {
        return a * b;
    }
}

public class calc {
    public static void main(String[] args) {
        calculator c = new calculator();

        mul m = new mul();
        c.ans = m.mul(2, 2);
        System.out.println(c.ans);
        
    }
}
