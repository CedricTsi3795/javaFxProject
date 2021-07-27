public class Main {
    public static void main(String[] args) throws Exception {
        ShapeDrafter drafter = new ShapeDrafter();
        drafter.setColor("Rouge");
        drafter.mainLaunch(args);
        //Command rectangleCommand = new DrawRectangle(null, drafter);
        Command rectangleCommand = new DrawRectangle(drafter);
        Command circleCommand = new DrawCircle(drafter);
        
        CommandInvoker invoker = new CommandInvoker();
        invoker.addCommand(rectangleCommand);
        invoker.addCommand(circleCommand);
        invoker.executeCommands();
    }
}
