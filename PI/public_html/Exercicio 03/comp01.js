function buscarId() {
    var myElement = document.getElementById("iId");
    alert(myElement);
}

function buscarName() {
    var myElement = document.getElementsByTagName("iName");
    alert(myElement);
}

function buscarClassName() {
    var myElement = document.getElementsByClassName("botao");
    alert(myElement);
}

function buscarCssSelector() {
    var myElement = document.querySelectorAll("span.lines");
    var i;
    for (i = 0; i < myElement.length; i++) {

        alert(myElement[i].innerHTML);
    }
}

function buscarHtmlOC() {
    var myElement = document.forms["formBotoes"];
    var i;
    for (i = 0; i < myElement.length; i++) {
        alert(myElement.elements[i].value);
    }
}
