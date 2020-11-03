package JavaVM.No2;

public class StackOverFlow {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOverFlow stackOverFlow = new StackOverFlow();
        try {
            stackOverFlow.stackLeak();
        } catch (Throwable e){
            System.out.println("stackLenth:" + stackOverFlow.stackLength);
            throw e;
        }
    }
}
