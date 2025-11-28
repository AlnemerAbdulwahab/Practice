class calculator {
    int ans;
}

class add extends calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class sub extends calculator {
    int sub(int a, int b) {
        return a - b;
    }
}

public class calc {
    public static void main(String[] args) {
        calculator c = new calculator();

        add a = new add();
        c.ans = a.add(1, 2);
        System.out.println(c.ans);

        sub s = new sub();
        c.ans = s.sub(2, 1);
        System.out.println(c.ans);
        
    }
}
