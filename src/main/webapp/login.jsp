<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>

    <div id="BigWrapper">

        <div id="LoginBoxContainer">
            
            <div id="LoginBoxHeaderContainer">

                <h2 id="LoginBoxHeader">Sign In</h2>

            </div>

            <div id="LoginFormContainer">

                <form action="LoginValidation" method="POST">

                    <div class="LoginFormContainerInput">

                        <h2 class="LoginFormLabel"> Username </h2>
                        <input type="text" class="LoginFormInput" name="username_login" />

                    </div>

                    <div class="LoginFormContainerInput">

                        <h2 class="LoginFormLabel"> Password </h2>
                        <input type="password" class="LoginFormInput" name="password_login" />

                    </div>

                    <div class="LoginFormSubmitContainer">

                        <input type="submit" class="LoginFormButton" value="SIGN IN" />

                    </div>

                </form>

                <div class="LoginBoxExtraContainer">
                    <h5 class="LoginBoxExtraPara">Forgot Username?&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Forgot Password?</h5>
                </div>

                <div class="LoginBoxExtraContainer">
                    <h5 class="LoginBoxExtraPara">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OR&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h5>
                </div>

                <div class="LoginFormSubmitContainer">
                <form action="createAccount.jsp">
                    <input type="submit" id="CreateAccountBtn" class="LoginFormButton" value="CREATE ACCOUNT" />
                </form>
                </div>

            </div>

        </div>

    </div>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js" integrity="sha512-z4OUqw38qNLpn1libAN9BsoDx6nbNFio5lA6CuTp9NlK83b89hgyCVq+N5FdBJptINztxn1Z3SaKSKUS5UP60Q==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="login.js"></script> 

</body>
</html>