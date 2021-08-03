package com.todoWebApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/todos/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TodoService todoService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        todoService = new TodoService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Todo edited = todoService.getTodoById(id);
		request.setAttribute("todo", edited);
		request.setAttribute("id", id);
		request.getRequestDispatcher("/WEB-INF/views/todo/edit_todo.jsp").forward(request, response);
		System.out.println(request.getParameter("status"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Todo edited = todoService.getTodoById(id);
		edited.setName(request.getParameter("name"));
		edited.setCategory(request.getParameter("category"));
		response.sendRedirect("/todos");
	}

}
