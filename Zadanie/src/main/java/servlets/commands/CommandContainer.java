package servlets.commands;

import org.apache.log4j.Logger;
import servlets.commands.departments.CreateDepartment;
import servlets.commands.departments.DeleteDepartment;
import servlets.commands.departments.EditDepartment;
import servlets.commands.departments.ManageDepartment;
import servlets.commands.workers.AddWorker;
import servlets.commands.workers.DeleteWorker;
import servlets.commands.workers.EditWorker;
import servlets.commands.workers.ManageWorker;

import java.util.HashMap;
import java.util.Map;

public class CommandContainer {
    static final Logger LOG = Logger.getLogger(CommandContainer.class);

    private static Map<CommandTypes, Command> commands = new HashMap<>();


    static {
        commands.put(CommandTypes.MANAGE_DEPARTMENT, new ManageDepartment());
        commands.put(CommandTypes.MANAGE_WORKER, new ManageWorker());
        commands.put(CommandTypes.CREATE_DEPARTMENT, new CreateDepartment());
        commands.put(CommandTypes.DELETE_DEPARTMENT, new DeleteDepartment());
        commands.put(CommandTypes.EDIT_DEPARTMENT, new EditDepartment());
        commands.put(CommandTypes.ADD_WORKER, new AddWorker());
        commands.put(CommandTypes.DELETE_WORKER, new DeleteWorker());
        commands.put(CommandTypes.EDIT_WORKER, new EditWorker());
    }

    public static Command get(CommandTypes commandTypes) {
        return commands.get(commandTypes);
    }


}