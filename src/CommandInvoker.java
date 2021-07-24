import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandList = new ArrayList<Command>();
    
    public void addCommand(Command c){
        commandList.add(c);
    }
    
    public void executeCommands(){
        for(Command c : commandList){
            c.execute();
            System.out.println("Executing Command. (DEBUGGING)");
        }
    }
}
