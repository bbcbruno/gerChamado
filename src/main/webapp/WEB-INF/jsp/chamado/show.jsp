<head>
	<title>Chamado [show]</title>
</head>
<body>
	<p>
		<b>Numero:</b>
		${chamado.numero}
	</p>
	<p>
		<b>Atendente:</b>
		${chamado.atendente}
	</p>

	<a href="${pageContext.request.contextPath}/chamados/${chamado.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/chamados">Back</a>
</body>