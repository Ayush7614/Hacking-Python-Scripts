let addList = document.getElementById("toDoList");
let getInput = document.getElementById("inputField");
let addButton = document.getElementById("addToDo");

addButton.addEventListener("click", function(){
    var para = document.createElement('p');
    para.innerText = getInput.value;
    addList.appendChild(para);
    inputField.value = "";
    para.addEventListener("click", function(){
        para.style.textDecoration = "line-through";
    })

    para.addEventListener("dblclick", function(){
        addList.removeChild(para);  
    })

})

