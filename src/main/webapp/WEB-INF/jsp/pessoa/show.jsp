<head>
	<title>Pessoa [show]</title>
</head>
<body>
	<p>
		<b>Name:</b>
		${pessoa.name}
	</p>
	<p>
		<b>Time:</b>
		${pessoa.time}
	</p>

	<a href="${pageContext.request.contextPath}/pessoas/${pessoa.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/pessoas">Back</a>
</body>