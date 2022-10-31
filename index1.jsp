<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styl1.css"> 
<title>Register</title>
</head>
<!-- Concevons le formulaire HTML d'inscription des employés avec les champs suivants :.first Name.last Name.username.password.address.contact -->
<body>
 <div class="container">
  <h1>Sign up</h1>
  <form action="indexcuss1.jsp" method="post">
   <div class="user-details">
    
     <div class="input-box">
        
        <input type="text" placeholder="enter you name" required>
    </div>
   
    <div class="input-box">
        
        <input type="text" placeholder="enter you username" required>
    </div>
    
     <div class="input-box">
        
        <input type="email" placeholder="enter you email" required>
    </div>
    
      <div class="input-box">
       
        <input type="tel" placeholder="enter you telephone" required>
    </div>
    
    <div class="input-box">
       
        <input type="password" placeholder="enter you password" required>
    </div>
    
        <div class="input-box">
        
                <input type="password" placeholder="enter you confirm password" required>
    </div>
   
   <input type="submit" value="envoyer" class="btn">
   </div>
  </form>
 </div>
</body>
</html>