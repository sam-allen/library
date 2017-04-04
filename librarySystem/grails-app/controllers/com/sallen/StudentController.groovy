package com.sallen

class StudentController {

	def scaffold = Student

	def login() { 

	}	
	
	def validate() {
		def user = Student.findByUserName(params.username)
		if (user && user.password == params.password){
			session.user = user
			session.role = 'student'
			render view:'home'
		}else{
			flash.message = "Invalid username and password."
			render view:'login'
		}
	
	}
	
	def logout = {
		session.user = null	
		redirect(uri:'/')
	}

	def search(){
	
	}
	
	def results(String name){

	
	def students=Student.where{
		name=~name
	}.list()

	return [students:students,
		term:params.name,
		totalStudents:Student.count()]
	}

}
