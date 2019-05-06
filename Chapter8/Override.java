// Method overriding. 
class A {
    int i, j;
    
    A(int a, int b) {
        i = a;
        j = b;
    }
    
    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    //display k C this overrides show() in A 
    void show(String msg) {
        //super.show(); // this calls A's show()
        System.out.println(msg + k);
    }
}

class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show("This is k: "); // this calls show() in B
        subOb.show();
    }
}