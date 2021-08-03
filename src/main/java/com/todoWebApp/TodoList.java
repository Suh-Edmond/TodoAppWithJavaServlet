package com.todoWebApp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodoList
 */
@WebServlet("/todos")
public class TodoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TodoService todoService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoList() {
        super();
        todoService = new TodoService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List todosList = todoService.getTodo();
		 request.setAttribute("todos", todosList);
		 request.getRequestDispatcher("/WEB-INF/views/todo/todoList.jsp").forward(request, response);
	}

	 

}
