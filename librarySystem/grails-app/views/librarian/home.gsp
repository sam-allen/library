<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome Librarian</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css"/>
</head>
<body>
   
    <div id="content" role="main">

	<div class="row">
	
	<div class="first">

		<h3>Courses Management</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="course" action="create">Courses</g:link>
		
		</button>

	</div> 

	<div class="second">

		<h3>Book Management</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="book" action="create">Books</g:link>
		
		</button>

	</div>

	<div class="third">

		<h3>Student Enrolment</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="student" action="create">Students</g:link>
		
		</button>

	</div>

	<div class="fourth">

		<h3>Librarian Management</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="librarian" action="create">Librarians</g:link>
		
		</button>

	</div>

	<div class="fifth">

		<h3>Search</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="student" action="search">Search</g:link>
		
		</button>

	</div>

</div>

</div>

</body>

</html>
