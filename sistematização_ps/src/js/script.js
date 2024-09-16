function sortearNumero() {
    const inicio = parseInt(document.getElementById("inicio").value);
    const fim = parseInt(document.getElementById("fim").value);

    if (isNaN(inicio) || isNaN(fim) || inicio > fim) {
        document.getElementById("resultado").innerText = "Por favor, insira um intervalo válido.";
        return;
    }

    const numeroSorteado = Math.floor(Math.random() * (fim - inicio + 1)) + inicio;
    document.getElementById("resultado").innerText = "Número sorteado: " + numeroSorteado;
}

function sortearElemento() {
    const elementos = document.getElementById("elementos").value.split(",");
    const elementosLimpos = elementos.map(e => e.trim()).filter(e => e !== "");

    if (elementosLimpos.length === 0) {
        document.getElementById("resultado").innerText = "Por favor, insira elementos válidos.";
        return;
    }

    const indexSorteado = Math.floor(Math.random() * elementosLimpos.length);
    const elementoSorteado = elementosLimpos[indexSorteado];
    document.getElementById("resultado").innerText = "Elemento sorteado: " + elementoSorteado;
}