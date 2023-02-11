<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link rel="stylesheet" href="createAccount.css">
</head>
<body>

    <div id="BigWrapper">

        <div id="LoginBoxContainer">
            
            <div id="LoginBoxHeaderContainer">

                <h2 id="LoginBoxHeader">Sign Up</h2>

            </div>

            <div id="LoginFormContainer">

                <form action="AddUser" method="POST">

                    <div class="LoginFormContainer">

                        <h2 class="LoginFormLabel"> Email (SGGS) </h2>
                        <input type="text" class="LoginFormInput" name="email" />

                    </div>

                    <div class="LoginFormContainer">

                        <h2 class="LoginFormLabel"> Authokey </h2>
                        <input type="password" class="LoginFormInput" name="authokey" />

                    </div>

                    <div class="LoginFormContainer">

                        <h2 class="LoginFormLabel"> First Name </h2>
                        <input type="text" class="LoginFormInput" name="firstName" />

                    </div>

                    <div class="LoginFormContainer">

                        <h2 class="LoginFormLabel"> Last Name </h2>
                        <input type="text" class="LoginFormInput" name="lastName" />

                    </div>

                    <div class="LoginFormContainer">

                        <h2 class="LoginFormLabel"> Username </h2>
                        <input type="text" class="LoginFormInput" name="username" />

                    </div>

                    <div class="LoginFormContainer">

                        <h2 class="LoginFormLabel"> Password </h2>
                        <input type="password" class="LoginFormInput" name="password" />

                    </div>

                    <div class="LoginFormContainer">

                        <input type="submit" id="LoginFormSubmit" value="CREATE ACCOUNT" />

                    </div>

                </form>

            </div>

        </div>

    </div>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js" integrity="sha512-z4OUqw38qNLpn1libAN9BsoDx6nbNFio5lA6CuTp9NlK83b89hgyCVq+N5FdBJptINztxn1Z3SaKSKUS5UP60Q==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="createAccount.js"></script> 

</body>
</html>