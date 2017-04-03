package com.sallen

class BootStrap {

    def init = { servletContext ->
/*
def library1=new Library(
	building:'Owen',
	address:'31 Cheese Street',
	openingHours:'07:00-18:00',
	location:'Sheffield',
	studySpaces:'200',
).save()

def library2=new Library(
	building:'Arundel',
	address:'12 Arundel Gate',
	openingHours:'05:00-14:00',
	location:'Sheffield',
	studySpaces:'50',
).save()
	
def librarian1=new Librarian(
	name:'Sam Allen',
	email:'samuel.allen@yahoo.co.uk',
	office:'9405',
	userName:'samallen',
	password:'password2',
	telephone:'45494885934',
	library:library1,
).save()
//library1.addToLibrarians(librarian1)

def librarian2=new Librarian(
	name:'Aidan Black',
	email:'aidan.black@yahoo.co.uk',
	office:'9406',
	userName:'aidanblack',
	password:'password3',
	telephone:'42834882801',
	library:library2,
).save()
//library2.addToLibrarians(librarian2)

def course1=new Course(
	title:'BSc Information Technologies',
	code:'IT401',
	leader:'Luke Greenwood',
	department:'Computing',
	description:'A general course concerning all aspects of IT',
	studyMode:'Full-time',
).save()

def course2=new Course(
	title:'BSc Information Tech Studies',
	code:'ITS101',
	leader:'Shane Allen',
	department:'Computing',
	description:'A general course concerning key aspects of IT',
	studyMode:'Full-time',
).save()

def student1=new Student(
	name:'Lee Catling',
	email:'lee.catling@yahoo.co.uk',
	userName:'leecatling',
	password:'password4',
	studentID:'B5026431',
	course:course1,
	library:library1, 
).save()
//course1.addToStudents(student1)
//library1.addToStudents(student1)

def student2=new Student(
	name:'Chisha Chivhenge',
	email:'chisha.chivhenge@yahoo.co.uk',
	userName:'chishachivhenge',
	password:'password5',
	studentID:'B5026432',
	course:course2,
	library:library2,
).save()
//course2.addToStudents(student2)
//library2.addToStudents(student2)

def book1=new Book(
	title:'IT for Spuds',
	subject:'IT',
	author:'Ryan Carpenter',
	isbn:'3024',
	dateBorrowed:new Date('12/01/2017'),
	returnDate:new Date('17/01/2017'),
	student:student1,
	overdue:false,
	library:library1,
).save() 
//student1.addToBooks(book1)
//library1.addToBooks(book1)

def book2=new Book(
	title:'IT for Dummies',
	subject:'IT',
	author:'Patryk Ginter',
	isbn:'2443',
	dateBorrowed:new Date('16/02/2017'),
	returnDate:new Date('25/02/2017'),
	student:student2,
	overdue:true,
	library:library2,
).save()
//student2.addToBooks(book2)
//library2.addToBooks(book2)	

def bookreview1=new BookReview(
	book:book1,
	datePublished:new Date('19/01/2017'),
	student:student1,
	review:'A good educational book',
).save()
//book1.addToBookReviews(bookreview1)
//student1.addToBookReviews(bookreview1)

def bookreview2=new BookReview(
	book:book2,
	datePublished:new Date('28/02/2017'),
	student:student2,
	review:'Lacked the correct content',
).save()
//book2.addToBookReviews(bookreview2)
//student2.addToBookReviews(bookreview2)
*/

    }
    def destroy = {
    }
}
