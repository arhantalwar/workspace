<!DOCTYPE html>
<%@page import="java.util.LinkedList"%>
<%@page import="com.DAO.DAO"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>WorkSpace</title>
    <link rel="stylesheet" href="Workspace.css">
</head>
<body>

	<%
	
	LinkedList<String> FirstName = new LinkedList<String>();
	
	DAO dao = new DAO();
	dao.FirstName(FirstName);
	
	String LongName = "";
	
	for(int i = 0; i < FirstName.size(); i++){
		LongName += "," + FirstName.get(i);
	}
	
	System.out.println(LongName);
	
	session.setAttribute("LongName", LongName);
	
	%>

    <div id="TopNavWrapper">
        <div id="WorkSpaceHeaderContainer">
            <h3 id="WorkSpaceHeader">WorkSpace</h3>
        </div>
        <div id="Alert">
            <div id="AlertEmptyContainer">
                <h3>Add a Goal</h3>
            </div>
            <div id="AlertBusContainer">
                <h3>Bus Added</h3>
            </div>
        </div>
        <div id="TopNavBtnContainer">
            <div id="SaveBtnContainer">
                <input type="button" value="SAVE" id="SaveBtn" />
            </div>
            <div id="NewBrickBtnContainer">
                <input type="button" value="+" id="NewBtn" onclick="NewBus()" />
            </div>
        </div>
    </div>

    <div id="RouteWrapper">
        
        <div id="Route1Container">

            <input type="text" id="TitleTextBox" placeholder="Title" autocomplete="off" />
            <input type="button" id="SetTitleBtn" value="Done" onclick="SetTitle()" />

            <div id="ColorSectionContainer">
                <div class="ColorSection">
                    <h5>Members</h5>
                    <input type="color" Class="ColorPicker" />
                </div>
                <div class="ColorSection">
                    <h5>Goals</h5>
                    <input type="color" Class="ColorPicker" />
                </div>
                <div class="ColorSection">
                    <h5>Files</h5>
                    <input type="color" Class="ColorPicker" />
                </div>
            </div>

        </div>

        <div id="Route2Container">

            <div id="MembersHeaderContainer">
                <h5>Members</h5>
            </div>
            <div id="MembersContainer">

            </div>

        </div>

        <div id="Route3Container">
            
            <textarea id="GoalTextBox" placeholder="Goals"></textarea>
            <input type="button" id="SetGoalBtn" value="Add" onclick="AddGoal()" />

        </div>

        
    </div>

    <div id="BusWrapper">
        
        <div class="Bus" id="Bus0">
            
            <div class="HomeLayer" id="HomeLayer0"></div>

            <div class="BusHeaderContainer" id="BusHeaderContainer0">
                <h3 class="BusHeader" id="BusHeader0"> Title </h3>
            </div>

            <div class="BrickContainer" id="BrickContainer0">

                <div class="MembersContainer" id="MembersContainer0">

                </div>

                <div class="FileContainer" id="FileContainer0">

                </div>

                <div class="GoalContainer" id="GoalContainer0">
                    
                </div>

            </div>

        </div>

    </div>

    
    <div id="${LongName}" class="LongName"></div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/3.2.1/anime.min.js" integrity="sha512-z4OUqw38qNLpn1libAN9BsoDx6nbNFio5lA6CuTp9NlK83b89hgyCVq+N5FdBJptINztxn1Z3SaKSKUS5UP60Q==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="Workspace.js"></script>

</body>
</html>