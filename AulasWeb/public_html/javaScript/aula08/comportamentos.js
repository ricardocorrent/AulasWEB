function message() {
    var txt = "";
    try {
        adddlert("Bem Vindo!");
    } catch (err) {
        txt = "Ocorreu um erro nesta pagina.\n\n";
        txt += "Clique em OK para continuar a visualizar a pagina,\n";
        txt += "ou Cancel para ir para pagina do Integrado.\n\n";
        if (!confirm(txt)) {
            document.location.href = "http://www.grupointegrado.br/";
        }
    }
}

function controle(form1) {
    var test = document.form1.texto.value;
    alert("O texto escrito foi: " + test);
}