package exception;

public final class Messages {

    private Messages() {
    }

    // Manipulate Data base errors
    public static final String ERR_CANNOT_OBTAIN_CONNECTION = "Cannot obtain a connection from the pool";
    public static final String ERR_CANNOT_CLOSE_CONNECTION = "Cannot close a connection";
    public static final String ERR_CANNOT_CLOSE_RESULT_SET = "Cannot close a result set";
    public static final String ERR_CANNOT_CLOSE_STATEMENT = "Cannot close a statement";
    public static final String ERR_CANNOT_OBTAIN_DATA_SOURCE = "Cannot obtain the data source";

    // Manipulate Departments errors
    public static final String ERR_CANNOT_OBTAIN_DEPARTMENT_BY_ID = "Cannot obtain a department by its id";
    public static final String ERR_CANNOT_OBTAIN_DEPARTMENTS = "Cannot obtain departments";
    public static final String ERR_CANNOT_UPDATE_DEPARTMENT = "Cannot update a department";
    public static final String ERR_CANNOT_DELETE_DEPARTMENT = "Cannot delete a department";
    public static final String ERR_CANNOT_CREATE_DEPARTMENT = "Cannot create a department";
    public static final String ERR_CANNOT_OBTAIN_DEPARTMENT_BY_WORKER_ID = "Cannot obtain a department by a worker id";


    // Manipulate Workers errors
    public static final String ERR_CANNOT_ADD_WORKER = "Cannot insert worker";
    public static final String ERR_CANNOT_OBTAIN_WORKER_BY_ID = "Cannot obtain a worker by id";
    public static final String ERR_CANNOT_OBTAIN_WORKER_BY_DEPARTMENT_ID = "Cannot obtain a worker by department id";
    public static final String ERR_CANNOT_UPDATE_WORKER= "Cannot update a worker";
    public static final String ERR_CANNOT_DELETE_WORKER= "Cannot delete a worker";



}