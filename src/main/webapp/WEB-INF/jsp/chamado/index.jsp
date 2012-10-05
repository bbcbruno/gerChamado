<head>
	<title>Chamado [index]</title>
</head>
<body>
	<h1>Listing Chamados</h1>

	<table>
		<tr>
			<th>Numero</th>
			<th>Atendente</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${chamadoList}" var="chamado">
			<tr>
				<td>${chamado.numero}</td>
				<td>${chamado.atendente}</td>
				<td><a href="${pageContext.request.contextPath}/chamados/${chamado.id}">show</a></td>
				<td><a href="${pageContext.request.contextPath}/chamados/${chamado.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/chamados/${chamado.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

	<br />
	<a href="${pageContext.request.contextPath}/chamados/new">New Chamado</a> 
</body>