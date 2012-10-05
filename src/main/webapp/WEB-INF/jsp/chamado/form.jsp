<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/chamados" method="post">
  
	<c:if test="${not empty chamado.id}">
		<input type="hidden" name="chamado.id" value="${chamado.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Numero:<br />
		<input type="text" name="chamado.numero" value="${chamado.numero}"/>
	</div>
	<div class="field">
		Atendente:<br />
		<input type="text" name="chamado.atendente" value="${chamado.atendente}"/>
	</div>

<div class="actions">
	<button type="submit">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/chamados">Back</a>
