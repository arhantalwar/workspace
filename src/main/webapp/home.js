const DropDown = document.getElementById("DropDownWrapper");
const UserIcon = document.getElementById("TopNavUserDrop");
const CS = document.getElementById('CloseScreen');

UserIcon.onclick = function(){
    DropDown.style.display = 'block';
    CS.style.display = "block";
}

CS.addEventListener("click", (e) => {
    if(e.target == CS){
        CS.style.display = 'none';
        DropDown.style.display = 'none';
    }
})