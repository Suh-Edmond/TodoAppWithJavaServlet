package com.todoWebApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckTodoServlet
 */
@WebServlet("/todo/check_todo")
public class CheckTodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	TodoService todoService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckTodoServlet() {
        super();
        todoService = new TodoService();
    }

	 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * mark a todo as done
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		todoService.checkTodo(id);
		response.sendRedirect("/todos");
	}

}
