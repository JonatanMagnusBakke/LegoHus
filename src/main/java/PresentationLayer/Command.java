package PresentationLayer;

import FunctionLayer.LegoHouseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 The purpose of Command is to...

 @author kasper
 */
abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("PlaceOrder", new PlaceOrder());
        commands.put("ShowOrders", new ShowOrders());
        commands.put("CloseOrder", new CloseOrder());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        
        System.out.println(commandName);
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) throws LegoHouseException;

}
