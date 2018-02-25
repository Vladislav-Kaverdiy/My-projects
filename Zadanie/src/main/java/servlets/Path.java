package servlets;

public interface Path {
    String ERROR_PAGE = "/errorPage.jsp";
    String COMMAND_MANAGE_DEPARTMENT = "/servlet.do?command=manageDepartment";
    String PAGE_WORKERS = "/workers.jsp";
    String COMMAND_MANAGE_WORKER = "/servlet.do?command=manageWorker";
    String DEPARTMENT_PAGE = "/departments.jsp";
    String CREATE_DEPARTMENT = "/createDepartment.jsp";
    String ADD_WORKER = "/servlet.do?command=addWorker";
    String EDIT_DEPARTMENT = "/editDepartment.jsp";
    String EDIT_WORKER = "/editWorker.jsp";
    String MANAGE_WORKER =  "/servlet.do?command=manageWorker&departmentId=${department.getDepartmentId()}";

}
