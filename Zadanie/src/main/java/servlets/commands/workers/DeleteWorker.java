package servlets.commands.workers;

import database.dao.WorkerDao;
import exception.AppException;
import servlets.Path;
import servlets.commands.Command;
import servlets.commands.CommandContainer;
import servlets.commands.CommandTypes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteWorker implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, AppException {

        int workerId = Integer.parseInt(request.getParameter("workerId"));
        WorkerDao workerDao = new WorkerDao();
        workerDao.deleteWorkerById(workerId);
        return CommandContainer.get(CommandTypes.MANAGE_DEPARTMENT).execute(request, response);

    }
}
