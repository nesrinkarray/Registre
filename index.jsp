<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Créons un formulaire HTML de connexion avec les champs suivants :
 nom d'utilisateur le mot de passe -->
<title>login</title>
 <link rel="stylesheet" href="styl.css"> 
</head>
<body>
 <div class="login-box">
    <h1>Login</h1>
      <form method="post" action="indexsucc.jsp">
        <div class="textbox">
          <input type="text" placeholder="Username" required>
          </div>
          
          <div class="textbox">
          <input type="password" placeholder="password" required>
         </div>
        
         <input type="submit" value="Login" class="btn">
        <div class="pass">Forgot Password?</div>
        
        <div class="signup_link">
          Not a member? <a href="index1.jsp">Signup</a>
        </div>
  </form>
  </div>
</body>
</html>