package servlets.commands.departments;

import database.dao.DepartmentDao;
import exception.AppException;
import model.Department;
import servlets.commands.Command;
import servlets.commands.CommandContainer;
import servlets.commands.CommandTypes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteDepartment implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, AppException {

        int departmentId = Integer.parseInt(request.getParameter("departmentId"));
        DepartmentDao departmentDao = new DepartmentDao();
        departmentDao.deleteDepartmentById(departmentId);

        return CommandContainer.get(CommandTypes.MANAGE_DEPARTMENT).execute(request, response);
}
}
