public class C5E10 {
    public static void main(String[] args) {
        Tool tool = new Tool(true);
        System.out.println("new tool state: " + tool.inUsage);

        //properly claning:
        tool.set_aside(); // finalize dont show communicat in console

        System.out.println(tool.inUsage);
        //new reference, creating "problem"
        new Tool(true);

        //isisting on cleaning
        System.gc();
    }


}
