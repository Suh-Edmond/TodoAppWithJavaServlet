/**
 * 
 */
package com.todoWebApp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suh
 *
 */
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Web Application Development", "Study"));
		todos.add(new Todo("Learn Spring MVC", "Study"));
		todos.add(new Todo("Learn Spring Rest Services", "Study"));
	}
	
	/**
	 * add new todo
	 */
	public void addTodo(Todo newTodo)
	{
		todos.add(newTodo);
	}
	
	/**
	 * retrieve todo
	 */
	public List<Todo> getTodo()
	{
		return todos;
	}
	
	/**
	 * delete todo
	 */
	public void deleteTodo(int id)
	{
		todos.remove(id);
	}
	
	
	/**
	 * check todo
	 */
	public void checkTodo(int id)
	{
		todos.get(id).setStatus(true);
	}
	
	/**
	 * get a specific todo by id
	 */
	public Todo getTodoById(int id)
	{
		return todos.get(id);
	}
	
	
	
	
	
	
	
	
}
