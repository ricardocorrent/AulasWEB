function estadoInicial() {
    estadoForm(true);
    estadoIncluir(false);
    estadoAlterar(false);
    estadoExcluir(true);
    estadoGravar(true);
    estadoCancelar(true);
}

function estadoForm(estado) {
    var myElement = document.forms["formCadastro"];
    var i;
    for (i = 0; i < myElement.length; i++) {
        if (myElement.elements[i].className == "campoTexto" || myElement.elements[i].className == "campoData") {
        //if (myElement.elements[i].className != "botao") {
            myElement.elements[i].disabled = estado;
        }
    }
}

function limparForm() {
    document.getElementById("iFormCadastro").reset();
}

function estadoIncluir(estado) {
    document.getElementById("iIncluir").disabled = estado;
}

function estadoAlterar(estado) {
    document.getElementById("iAlterar").disabled = estado;
}

function estadoExcluir(estado) {
    document.getElementById("iExcluir").disabled = estado;
}

function estadoGravar(estado) {
    document.getElementById("iGravar").disabled = estado;
}

function estadoCancelar(estado) {
    document.getElementById("iCancelar").disabled = estado;
}

function clickIncluir() {
    estadoForm(false);
    estadoIncluir(false);
    estadoAlterar(false);
    estadoExcluir(true);
    estadoGravar(false);
    estadoCancelar(false);
}

function clickAlterar() {
    estadoForm(false);
    estadoIncluir(true);
    estadoAlterar(true);
    estadoExcluir(false);
    estadoGravar(false);
    estadoCancelar(false);
}

function clickExcluir() {
    limparForm();
    alert("Escluído com sucesso!");
    estadoInicial();
}

function clickCancelar() {
    limparForm();
    estadoInicial();
}