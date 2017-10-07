function atualizarResultado() {
    var nota01 = parseFloat(document.calcularNotas.nAv11bNp.value);
    var nota012 = parseFloat(document.calcularNotas.nAv12bNp.value);
    var nota02 = parseFloat(document.calcularNotas.nAv2Np.value);
    var nota03 = parseFloat(document.calcularNotas.nAv3Np.value);
    var valor = parseFloat(nota01 + nota012 + nota02 + nota03);

    valor = valor.toFixed(1);
    var divResultado = document.getElementById("mostrarResultado");


    /* document.calcularNotas.resultado.value = "\"<p>\"Sua média final é \"</p>\" " + valor; */

    if(valor < 4){
        divResultado.innerHTML = "<p>Sua média final é  <span id='valorReprovado'>" + valor + "</span></p> <span id='valorRepro'>Você precisa estudar mais. Está REPROVADO,<br>procure sua Coordenação. =(</span>";
    }else if(valor < 7){
        divResultado.innerHTML = "<p>Sua média final é  <span id='valorReprovado'>" + valor + "</span></p> <span id='valorRepro'>Você está habilitado a fazer o EXAME. Estude um<br>pouco mais e será aprovado =(</span>";
    }else{
        divResultado.innerHTML = "<p>Sua média final é  <span id='valorAprovado'>" + valor + "</span></p> <span id='valorApro'>Parabéns, você foi aprovado =D</span>";
    }
}
function av11(){
    var notaV1 = document.calcularNotas.nAv11b.value;
    notaV1 = notaV1 * 0.25;
    notaV1 = notaV1.toFixed(2);
    document.calcularNotas.nAv11bNp.value = notaV1;
}
function av12() {
    var notaV12 = document.calcularNotas.nAv12b.value;
    notaV12 = notaV12 * 0.25;
    notaV12 = notaV12.toFixed(2);
    document.calcularNotas.nAv12bNp.value = notaV12;
}
function av2() {
    var notaV2 = document.calcularNotas.nAv2.value;
    notaV2 = notaV2 * 0.30;
    notaV2 = notaV2.toFixed(2);
    document.calcularNotas.nAv2Np.value = notaV2;
}
function av3() {
    var notaV3 = document.calcularNotas.nAv3.value;
    notaV3 = notaV3 * 0.20;
    notaV3 = notaV3.toFixed(2);
    document.calcularNotas.nAv3Np.value = notaV3;
}