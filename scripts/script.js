function actualizarReloj(){

    const ahora = new Date();

    document.getElementById("hora").innerHTML =
        ahora.toLocaleTimeString();

    document.getElementById("fecha").innerHTML =
        ahora.toLocaleDateString('es-CO');
}

setInterval(actualizarReloj,1000);

actualizarReloj();