public class Tool {
    boolean inUsage = false;

    Tool(boolean usage){
        inUsage = usage;
    }

    void set_aside(){
        inUsage = false;
    }

    void take(){
        inUsage = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if(inUsage){
            System.out.println("Tool still in use.. pls set it aside! ");
        }
    }
}
