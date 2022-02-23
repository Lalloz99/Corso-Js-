function cristo() {
    var input = document.getElementsByTagName("input");
    var cognome = input[0];
    var nome = input[1];
    if (cognome.value == "") {
        alert("campo cognome obbligatorio");
        return;
    }
    if (nome.value == "") {
        alert("campo nome obbligatorio");
        return;
    }
}

