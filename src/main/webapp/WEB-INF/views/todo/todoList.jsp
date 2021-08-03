<%@ include file="/WEB-INF/common/header.jsp"%>
<%@ include file="/WEB-INF/common/nav.jsp"%>


<section class="mt-5">
	<div class="d-flex justify-content-between mt-3">
		<h5>Our Todo List</h5>
		<h6><a href="/todo/add" class="btn btn-primary btn-sm">Add</a></h6>
	</div>
	<div class=" row d-flex justify-content-center">
		<div class="col-lg-12">
			 	<ul class="list-group">
					<c:forEach items="${todos}" var="todo">
					<c:if test="${!todo.status}">
						  <li class="list-group-item"> 
							    	<input class="form-check-input " type="checkbox" name="status"/> 
							    		${todo.name} ${todo.status}
						   			<div class="d-flex justify-content-end">
								   			<a class="btn btn-secondary btn-sm" type="submit" href="/todos/edit?id=${todos.indexOf(todo)}&name="${todo.name}">Edit</a>
								   			<span class="px-5">
												   <form action="/todos/delete?id=${todos.indexOf(todo)}" method="post">
												    		<button class=" btn btn-danger btn-sm" type="submit">Del</button>
												   </form>
								    		</span>
						    		</div>
						  </li>
					  </c:if>
					  <c:if test="${todo.status}">
							  <li class="list-group-item  "> 
								    	<input class="form-check-input " type="checkbox" name="status" onchange="markTodo()" id="checkedTodo"/> 
								    		${todo.name} ${todo.status}
							   			<div class="d-flex justify-content-end">
									   			<a class="btn btn-secondary btn-sm" type="submit" href="/todos/edit?id=${todos.indexOf(todo)}">Edit</a>
									   			<span class="px-5">
													   <form action="/todos/delete?id=${todos.indexOf(todo)}" method="post">
													    		<button class=" btn btn-danger btn-sm" type="submit">Del</button>
													   </form>
									    		</span>
							    		</div>
							  </li>
						</c:if>
					</c:forEach>
				</ul>
		</div>
	</div>
</section>


<%@ include file="/WEB-INF/common/footer.jsp"%>











