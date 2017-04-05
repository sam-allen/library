<!doctype html>
<html>
<head>
	<meta name="Layout" content="main"/>
	<title>Book Search</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
	<div class="row">
		<h1>Book Search</h1>
	
	<formset>
		<legend>Search for Books</legend>
		
		<table>
		<g:form action="results">
		<tr>
			<td><label for="title">Book Title</label></td>
			<td><g:textField name="title"/></td>
		</tr>
		<tr>
			<td><label for="subject">Subject</label></td>
			<td><g:textField name="subject"/></td>
		</tr>
		<tr>
			<td><label for="author">Author</label></td>
			<td><g:textField name="author"/></td>
		</tr>
		<tr>
			<td>Query Type:</td>
			<td><g:radioGroup name="queryType" labels="['And','Or','Not']" values="['and','or','not']" 				value="and"> ${it.radio} ${it.label} </g:radioGroup></td>		
		</tr>
		<tr>
			<td></td>	
			<td><g:submitButton name="search" value="Search"/></td>
		</tr>
			</g:form>
		</table>
	</formset>
	</div>
</body>
</html>
