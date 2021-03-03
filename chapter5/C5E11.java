public class C5E11 {
    public static void main(String[] args) {
        Tool tool1= new Tool(true);
        Tool tool2 = new Tool(true);

        System.out.println("new tool1 state: " + tool1.inUsage);

        //properly claning:
        tool1.set_aside(); // finalize dont show communicat in console

        System.out.println("new tool1 state " + tool1.inUsage);
        //new reference, creating "problem"
        new Tool(true);
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        // using deprecated since 1.1 method:
        System.runFinalizersOnExit(true);
    }


}
