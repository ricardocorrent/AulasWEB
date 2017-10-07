function getCookie(cName) {
    if (document.cookie.length > 0) {
        c_start = document.cookie.indexOf(cName + "=");
        if (c_start != -1) {
            c_start = c_start + cName.length + 1;
            c_end = document.cookie.indexOf(";", c_start);
            if (c_end == -1) c_end = document.cookie.length;
            return unescape(document.cookie.substring(c_start, c_end));
        }
    }
    return "";
}

function setCookie(c_name, value, expiredays) {
    var exdate = new Date();
    exdate.setDate(exdate.getDate() + expiredays);
    if (expiredays == null) {
        expiredays = "";
    } else {
        expiredays = ";expires=" + exdate.toGMTString();
        document.cookie = c_name + "=" + escape(value) + expiredays;
    }
}

function checkCookie() {
    var username = getCookie("username");
    if (username != null && username != "") {
        alert("Bem vindo novamente " + username + "!");
    } else {
        username = prompt("Por favor, informe seu nome:", "");
    }
    if (username != null && username != "") {
        setCookie("username", username, 365);
    } else {
        checkCookie();
    }
}