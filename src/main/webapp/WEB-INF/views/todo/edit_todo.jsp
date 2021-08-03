<%@ include file="/WEB-INF/common/header.jsp"%>
<%@ include file="/WEB-INF/common/nav.jsp"%>


<section class="mt-5">
	<div class="row d-flex justify-content-center">
		<div class="col-4">
			<form action="/todos/edit?id=${id}" method="post">
			  <div class="d-flex justify-content-center">
			  		<h5>Edit Todo</h5>
			  </div>
			  <div class="mb-3">
			    <label for="name" class="form-label">Name</label>
			    <input type="name" class="form-control" name="name" value="${todo.name}" aria-describedby="name" required>
			   
			  </div>
			  <div class="mb-3">
			    <label for="category" class="form-label">Category</label>
			    <input type="category" class="form-control" name="category" required value="${todo.category}">
			  </div>
			  <button type="submit" class="btn btn-primary btn-sm">Submit</button>
			</form>
		</div>
	</div>
</section>

<%@ include file="/WEB-INF/common/footer.jsp"%>











