public class testStaticBlock {

    testStaticBlock()
    {
        System.out.println("in Constructor");
    }

    static {
        System.out.println("in Static block");
    }

    public static void main(String[] args) {

        testStaticBlock t = new testStaticBlock();
        System.out.println("main method");
    }
}
