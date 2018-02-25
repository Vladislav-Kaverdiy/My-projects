package database;

public class DBQueries {
    // Queries for Department, DepartmentDao class
    public static final String SQL_FIND_ALL_DEPARTMENTS = "SELECT * FROM departments";
    public static final String SQL_FIND_DEPARTMENTS_BY_ID = "SELECT * from departments WHERE department_id=?";
    public static final String SQL_INSERT_DEPARTMENT = "INSERT INTO departments(full_name, importance, register_date)VALUE(?,?,?)";
    public static final String SQL_DELETE_DEPARTMENT_BY_DEPARTMENT_ID = "DELETE FROM departments WHERE department_id=?";
    public static final String SQL_UPDATE_DEPARTMENT = "UPDATE departments SET full_name=?, importance=?"
            + "	WHERE department_id=?";



    //Queries for Worker, WorkerDao class
    public static final String SQL_INSERT_WORKER = "INSERT INTO workers(first_name, last_name, age, email, phone, register_date, department_id )VALUE(?,?,?,?,?,?,?)";
    public static final String SQL_FIND_ALL_WORKERS_BY_DEPARTMENT_ID = "SELECT * FROM workers WHERE department_id=?";
    public static final String SQL_FIND_WORKER_BY_ID = "SELECT * from workers WHERE worker_id=?";
    public static final String SQL_DELETE_WORKER_BY_WORKER_ID = "DELETE FROM workers WHERE worker_id=?";
    public static final String SQL_UPDATE_WORKER = "UPDATE workers SET first_name=?, last_name=?, age=?, email=?, phone=?"
            + " WHERE worker_id=?";
}
