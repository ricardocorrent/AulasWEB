
function createCookie() {
    var seuEmail = prompt("Informe seu e-mail", "");
    var oCookie = "email=" + escape(seuEmail);
    document.cookie = oCookie;
    alert("Obrigado!");
}

function readCookie() {
    if(!document.cookie){
        createCookie();
    }else{
        var oCookie = document.cookie;
        var quebraDeLinha = oCookie.split("=");
        var eMail = quebraDeLinha[1];
        eMail = unescape(eMail);
        var resposta = confirm("Este e-mail [" + eMail + "] é seu?");
        if(resposta == true){
            alert("Obrigado")
        }else{
            alert("Você precisa cadastrar um e-mail");
            createCookie();
        }
    }
}
