<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
		body 
		  {
			 font-family: Arial, Helvetica, sans-serif;
		  }
		 *
		 {
		 	box-sizing: border-box;
		 }
		input[type=text]
		{
			width: 100%;
			padding: 15px;
            border:none;
            background-color: #f1f1f1;
            margin: 5px 0px 22px 0px;
		}
		input[type=text]:focus
		{
           background-color: #ddd;
           outline: none;
        }
		
		button 
		{
		  color:white;
		  border:none;
		  margin: 8px 0px 0px 100px; 
		  cursor: pointer;
		  width: 100%;
		  opacity: 0.9;
        }
        button:hover 
        {
		  opacity:1;
		}
		.container
		{
          padding: 20px;
		}
		.submitbtn 
		{
		  padding: 14px 20px;
		  background-color: #33A5FF;
		}
		.submitbtn 
		{
		  float: left;
		  width: 80%;
		}


	</style>
</head>
<body>

<form action="deleteLap">
   <div class="container">
	<h2>Delete Laptop Data</h2>
	<p>Please Enter Laptop Id</p>
	<hr>
	<label><b>Id</b></label>
	<input type="text" name="id" placeholder="Id" required>
	</div>
	<div>
    	<button type="submit" class="submitbtn">SUBMIT</button>
    </div>
</form>	

</body>
</html>