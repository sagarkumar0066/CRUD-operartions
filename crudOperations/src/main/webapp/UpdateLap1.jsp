<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
		input[type=text],input[type=password],input[type="number"] 
		{
			width: 100%;
			padding: 15px;
            border:none;
            background-color: #f1f1f1;
            margin: 5px 0px 22px 0px;
		}
		input[type=text]:focus, input[type=password]:focus,input[type=number]:focus
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
          padding: 10px;
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

  <form action="updateLap" method="post">
   <div class="container">
	<h2>Update Laptop Data</h2>
	<p>Please Enter Laptop id</p>
	<hr>
	<label><b>Id</b></label>
	<input type="text" name="id" placeholder="Id" value="${id}"required>

    <div >
	<label><b>Brand</b></label>
	<input type="text" name="brand" placeholder="Brand name" value="${brand}" required>

	<label><b>Generation</b></label>
	<input type="text" name="generation" placeholder="Generation" value="${gen}" required>

	<label><b>Ram</b></label>
	<input type="text" name="ram" placeholder="Ram" value="${ram}"required>
	</div>

     <div>
    	<button type="submit" class="submitbtn">Update</button>
    </div>
    </div>
</form>

</body>
</html>