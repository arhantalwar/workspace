<%@page import="com.DAO.DAO"%>
<%@page import="java.util.LinkedList"%>
<%@page import="jakarta.websocket.SendResult"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <link rel="stylesheet" href="home.css">
</head>
<body>

	<%
	
		LinkedList<String> FirstName = new LinkedList<>();
		
		DAO dao = new DAO();
		dao.FirstName(FirstName);
		
		
	
		if(session.getAttribute("username_login") == null){
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	

    <div id="CloseScreen"></div>

    <div id="TopNavContainer">
        
        <div id="TopNavHeaderContainer">
            <h3 id="TopNavHeader">WorkSpace</h3>
        </div>

        <div id="TopNavSearchContainer">
            <input type="text" id="TopNavSearch" />
        </div>

        <div id="TopNavUserWrapper">
            <div id="TopNavUserContainer">
                <div id="TopNavUserHeaderContainer">
                    <h3 id="TopNavUserHeader">${username_login}</h3>
                </div>
                <div id="TopNavUserDropContainer">
                    <div id="TopNavUserDrop"></div>
                </div>
            </div>
        </div>

    </div>

    <div id="DropDownWrapper">
        <div class="DropDownContainer">
            <a class="DropDownOptions" href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Profile</a>
        </div>
        <div class="DropDownContainer">
            <a class="DropDownOptions" href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tag</a>
        </div>
        <div class="DropDownContainer">
            <a class="DropDownOptions" href="">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Logout</a>
        </div>
    </div>
    
        <div id="WelcomeWrapper">
            <div id="WelcomeContainer">
                <h2 id="WelcomeHeader">Hola, ${username_login}</h2>
            </div>
            <div id="ProjectWrapper">
                <div id="NewProjectContainer">
                    <a class="ProjectLink" href="NewProject" >New Project</a>
                </div>
                <div id="ExistingProjectContainer">
                    <a class="ProjectLink" href="" >Existing</a>
                </div>
            </div>
        </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js" integrity="sha512-z4OUqw38qNLpn1libAN9BsoDx6nbNFio5lA6CuTp9NlK83b89hgyCVq+N5FdBJptINztxn1Z3SaKSKUS5UP60Q==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="home.js"></script> 

</body>
</html>