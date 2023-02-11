let i = 1;
let a = 0;
let b = 0;
let c = 0;
let d = 0;
let e = 0;
let f = 0;
let g = 0;
let h = 0;
let j = 0;
let k = 0;

const BusWrapper = document.getElementById('BusWrapper');

function NewBus(){

    const Bus = document.createElement('div');
    const HomeLayer = document.createElement('div');
    const BusHeaderContainer = document.createElement('div');
    const BusHeader = document.createElement('h3');
    const BrickContainer = document.createElement('div');
    const MembersContainer = document.createElement('div');
    const FileContainer = document.createElement('div');
    const GoalContainer = document.createElement('div');

    Bus.className = 'Bus';
    Bus.id = "Bus"+i;

    HomeLayer.className = 'HomeLayer';
    HomeLayer.id = "HomeLayer"+i;

    BusHeaderContainer.className = 'BusHeaderContainer';
    BusHeaderContainer.id = "BusHeaderContainer"+i;

    BusHeader.className = 'BusHeader';
    BusHeader.id = "BusHeader"+i;
    BusHeader.innerText = "Title";

    BrickContainer.className = 'BrickContainer';
    BrickContainer.id = "BrickContainer"+i;

    MembersContainer.className = 'MembersContainer';
    MembersContainer.id = "MembersContainer"+i;

    FileContainer.className = 'FileContainer';
    FileContainer.id = "FileContainer"+i;

    GoalContainer.className = 'GoalContainer';
    GoalContainer.id = "GoalContainer"+i;

    BusWrapper.appendChild(Bus);
    Bus.appendChild(HomeLayer);
    Bus.appendChild(BusHeaderContainer);
    BusHeaderContainer.appendChild(BusHeader);
    Bus.appendChild(BrickContainer);
    BrickContainer.appendChild(MembersContainer);
    BrickContainer.appendChild(FileContainer);
    BrickContainer.appendChild(GoalContainer);
    
    i++;

    AlertBus();

}

const HomeLayer = document.getElementsByClassName('HomeLayer');
const MembersContainer = document.getElementsByClassName('MembersContainer');
const GoalContainer = document.getElementsByClassName('GoalContainer');

const Route1Container = document.getElementById('Route1Container');
const Route2Container = document.getElementById('Route2Container');
const Route3Container = document.getElementById('Route3Container');

const TitleTextBox = document.getElementById('TitleTextBox');

function Route1(){
    Route1Container.style.display = 'block';
    Route2Container.style.display = 'none';
    Route3Container.style.display = 'none';
}

function Route2(){
    Route1Container.style.display = 'none';
    Route2Container.style.display = 'block';
    Route3Container.style.display = 'none';
}

function Route3(){
    Route1Container.style.display = 'none';
    Route2Container.style.display = 'none';
    Route3Container.style.display = 'block';
}

let HomeLayerIndicator = "";
let IndexIndicator = "";
let GoalListIndicator = "";

function SetTitle(){
    let Title = document.getElementById('BusHeader'+IndexIndicator);
    Title.innerText = TitleTextBox.value;
    TitleTextBox.value = "";
}

function AddGoal(){
    
    const GoalTextBox = document.getElementById('GoalTextBox');
    
    if(GoalTextBox.value != ""){
    
    const GoalContainer = document.getElementById('GoalContainer'+IndexIndicator);
    const GoalList = document.createElement('p');
    const DeleteListItemButton = document.createElement('button');
    GoalList.innerText = GoalTextBox.value;
    GoalList.className = "GoalList";

    if(IndexIndicator == 0){
        GoalList.id = "GoalListA"+a;
        a++;
    }else if(IndexIndicator == 1){
        GoalList.id = "GoalListB"+b;
        b++;
    }else if(IndexIndicator == 2){
        GoalList.id = "GoalListC"+c;
        c++;
    }else if(IndexIndicator == 3){
        GoalList.id = "GoalListD"+d;
        d++;
    }else if(IndexIndicator == 4){
        GoalList.id = "GoalListE"+e;
        e++;
    }else if(IndexIndicator == 5){
        GoalList.id = "GoalListF"+f;
        f++;
    }else if(IndexIndicator == 6){
        GoalList.id = "GoalListG"+g;
        g++;
    }else if(IndexIndicator == 7){
        GoalList.id = "GoalListH"+h;
        h++;
    }else if(IndexIndicator == 8){
        GoalList.id = "GoalListI"+j;
        j++;
    }else if(IndexIndicator == 9){
        GoalList.id = "GoalListJ"+k;
        k++;
    }

    DeleteListItemButton.id = "DeleteListItemButton";
    DeleteListItemButton.onclick = function(e){

        DeleteGoal(e);
        
    
    };
    GoalContainer.appendChild(GoalList);
    GoalList.appendChild(DeleteListItemButton);
    GoalTextBox.value = "";

    }else if(GoalTextBox.value == ""){
        AlertEmpty();
    }

}

function DeleteGoal(e){

        const ListItem = document.getElementById(e.target.parentNode.id);
        ListItem.remove();

}

function AlertEmpty(){

    const AlertBox = document.getElementById('AlertEmptyContainer');
    AlertBox.style.animation = "none";
    AlertBox.offsetHeight;
    AlertBox.style.animation = null;

}

function AlertBus(){

    const AlertBox = document.getElementById('AlertBusContainer');
    AlertBox.style.animation = "none";
    AlertBox.offsetHeight;
    AlertBox.style.animation = null;

}

BusWrapper.addEventListener('click', (e) => {

    if(e.target.matches(".HomeLayer")){
        Route1();
        HomeLayerIndicator = e.target.id;
        IndexIndicator = HomeLayerIndicator.charAt(9);
    }

    if(e.target.matches(".MembersContainer")){
        Route2();
        HomeLayerIndicator = e.target.id;
        IndexIndicator = HomeLayerIndicator.charAt(16);
    }

    if(e.target.matches(".GoalContainer")){
        Route3();
        HomeLayerIndicator = e.target.id;
        IndexIndicator = HomeLayerIndicator.charAt(13);
    }

    if(e.target.matches(".GoalList")){
        Route3();
        HomeLayerIndicator = e.target.parentNode.id;
        IndexIndicator = HomeLayerIndicator.charAt(13);
    }

})