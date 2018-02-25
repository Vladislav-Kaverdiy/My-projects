package servlets.commands;

import java.util.Arrays;
import java.util.Optional;

public enum CommandTypes {

    MANAGE_DEPARTMENT("manageDepartment"),
    MANAGE_WORKER("manageWorker"),
    CREATE_DEPARTMENT("createDepartment"),
    DELETE_DEPARTMENT("deleteDepartment"),
    EDIT_DEPARTMENT("editDepartment"),
    ADD_WORKER("addWorker"),
    DELETE_WORKER("deleteWorker"),
    EDIT_WORKER("editWorker");

    private String commandName;

    CommandTypes(String commandName){
        this.commandName = commandName;
    }

    public String getCommandName(){
        return this.commandName;
    }

    public static CommandTypes getType(String value){
        Optional<CommandTypes> cm = Arrays.stream( CommandTypes.values()).filter(name -> name.getCommandName().equals(value))
                .findFirst();
        return cm.isPresent() ? cm.get() : null;
    }

}

