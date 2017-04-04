<!doctype html>
<html>
<head>
	<meta name="Layout" content="main"/>
	<title>Student Search</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
	<div class="row">
		<h1>Student Search</h1>
	
	<formset>
		<legend>Search for Students</legend>
		<g:form action="results">
		<label for="name">Student Name</label>
			<g:textField name="name"/>
			<g:submitButton name="search" value="Search"/>
			</g:form>
	</formset>
	</div>
</body>
</html>
