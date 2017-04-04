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
		
		<table>
		<g:form action="results">
		<tr>
			<td><label for="name">Student Name</label></td>
			<td><g:textField name="name"/></td>
		</tr>
		<tr>
			<td><label for="studentID">Student ID</label></td>
			<td><g:textField name="studentID"/></td>
		</tr>
		<tr>
			<td><label for="email">Student Email</label></td>
			<td><g:textField name="email"/></td>
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
