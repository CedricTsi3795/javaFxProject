public class Main {
    public static void main(String args[]) throws Exception {
        ShapeDrafter drafter = new ShapeDrafter(2);
        drafter.main(args);
        //Command rectangleCommand = new DrawRectangle(null, drafter);
        Command rectangleCommand = new DrawRectangle(drafter);
        
        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(rectangleCommand);
        invoker.executeCommands();
    }
}
