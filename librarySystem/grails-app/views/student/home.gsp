<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome Student</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css"/>
</head>
<body>
   
    <div id="content" role="main">

	<div class="row">
	
	<div class="first">

		<h3>Add Review</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="bookReview" action="create">Book Reviews</g:link>
		
		</button>

	</div> 

	<div class="second">

		<h3>List Reviews</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="bookReview" action="index">Book Reviews</g:link>
		
		</button>

	</div>

	<div class="third">

		<h3>Book Details</h3>

	<p>Lorem Ipsum</p>

		<button type="button" class="btn btn-success">

			<g:link controller="book" action="index">Books</g:link>
		
		</button>

	</div>


	<div class="fourth">

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
