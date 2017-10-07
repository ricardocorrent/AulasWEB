function exibirMensagem() {
    alert("Essa função foi chamada com o evento 'onload'");
}

function verHora() {
    var data = new Date();
    var hora = data.getHours();
    if (hora < 20) {
        alert("Boa noite");
    } else {
        alert("Bom dia");
    }
}

function disparaAlert() {
    alert("Olá está é uma Alert Box!");
}
function disparaConfirm() {
    var r = confirm("Escolha um botão");
    if (r == true) {
        alert("Você escolheu OK");
    } else {
        alert("Você escolheu CANCEL");
    }
}

function disparaPrompt() {
    var name = prompt("Informe seu nome", "Harry Potter");
    if (name != null && name != "") {
        alert("Olá " + name + "! Seja bem vindo.");
    }
}

function verificarIdade() {
    var date = new Date();
    var nome = prompt("Informe seu nome", "");
    var anoNascimento = prompt("Informe seu ano de nascimento", "");
    if ((date.getFullYear() - anoNascimento) >= 18) {
        alert(nome + "!! Esse conteúdo é permitido para você");
    } else {
        alert(nome + " seu criancinha de bosta!! Visite www.disney.com");
    }
}

function exibirHora() {
    var date = new Date();
    var hora = date.getHours() + "h" + date.getMinutes() + "m" + date.getSeconds() + "s";
    alert(hora);
}

function mostrarCor() {
    var cor = prompt("Informe uma cor", "sem #");
    document.write(cor);
    document.write("<span style=\"color: #" + cor + "\">Sua cor foi essa</span>");
}

function gerarCores() {
    var r = new Array("00", "33", "66", "99", "CC", "FF");
    var g = new Array("00", "33", "66", "99", "CC", "FF");
    var b = new Array("00", "33", "66", "99", "CC", "FF");
    document.write("<table>");
    for (var i = 0; i < r.length; i++) {
        for (var ii = 0; ii < g.length; ii++) {
            document.write("<tr>");
            for (var iii = 0; iii < b.length; iii++) {
                var novacor = "#" + r[i] + g[ii] + b[iii];
                //document.write(novacor);
                //document.write("<span style=\"color: " + novacor + "\">Sua cor foi essa</span><br/>");
                document.write("<td bgcolor=\"" + novacor + "\">");
                document.write(novacor);
                document.write("</td>");
            }
            document.write("</tr>");
        }
    }
    document.write("</table>");
}

function gerarCoresForIn() {
    var r = new Array("00", "33", "66", "99", "CC", "FF");
    var g = new Array("00", "33", "66", "99", "CC", "FF");
    var b = new Array("00", "33", "66", "99", "CC", "FF");
    document.write("<table>");
    for (i in r) {
        for (ii in g) {
            document.write("<tr>");
            for (iii in b) {
                var novacor = "#" + r[i] + g[ii] + b[iii];
                //document.write(novacor);
                //document.write("<span style=\"color: " + novacor + "\">Sua cor foi essa</span><br/>");
                document.write("<td bgcolor=\"" + novacor + "\">");
                document.write(novacor);
                document.write("</td>");
            }
            document.write("</tr>");
        }
    }
    document.write("</table>");
}