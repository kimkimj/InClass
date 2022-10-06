package Week3Day4.Set;

public class Calculator {
    NumberGenerator ng;
    private int baseNum;

    public Calculator(NumberGenerator ng){
        this.ng = ng;
        this.baseNum = 10;
    }

    public Calculator(NumberGenerator ng, int baseNum){
        this.ng = ng;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(num + ng.create(this.baseNum));
    }



}
