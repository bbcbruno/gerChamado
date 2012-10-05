<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/pessoas" method="post">
  
	<c:if test="${not empty pessoa.id}">
		<input type="hidden" name="pessoa.id" value="${pessoa.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Name:<br />
		<input type="text" name="pessoa.name" value="${pessoa.name}"/>
	</div>
	<div class="field">
		Time:<br />
		<input type="text" name="pessoa.time" value="${pessoa.time}"/>
	</div>

<div class="actions">
	<button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/pessoas">Back</a>
