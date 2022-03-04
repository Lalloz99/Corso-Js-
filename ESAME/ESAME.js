var Url="192.168.2.32:4000";

function getRadioValue() {
    for (var i = 0; i < document.getElementsByName('sesso').length; i++) {
        if (document.getElementsByName('sesso')[i].checked) {
            return document.getElementsByName('sesso')[i].value;
        }
    }
}

function promiseInviaDati(method, url) {

    var conferma = document.getElementById("confermapassword").value;
    var password = document.getElementById("psw").value;
    var email = document.getElementById("email").value;
    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var eta = document.getElementById("eta").value;
    var sesso = getRadioValue();
    var regione = document.getElementById("regione").value;
    if (password == conferma) {
        var data = {
            email: email,
            password: password,
            nome: nome,
            cognome: cognome,
            eta: eta,
            sesso: sesso,
            regione: regione
        };
        console.log(email, password, nome, cognome, eta, sesso, regione);
        return new Promise((resolve, reject) => {

            let xhreq = new XMLHttpRequest(); 

            xhreq.open(method, url);
            xhreq.setRequestHeader('Content-Type', 'application/json');
            xhreq.responseType = "json";

            xhreq.send(JSON.stringify(data));
            xhreq.onload = () => {
                if (xhreq.status >= 400) {
                    console.log("Hai sbagliato qualcosa");
                    reject(xhreq.reject);
                }
                if (xhreq.status == 200) {
                    console.log("Ok")
                    resolve(xhreq.response);
                    document.getElementById("demo").innerHTML = "Inserimento Completato";
                }
                if (xhreq.status == 201) {
                    resolve(xhreq.response);
                    console.log("ok");
                    document.getElementById("demo").innerHTML = "Inserimento Completato";
                }
            };
            xhreq.onerror = () => {
                console.log("errore");
            }

        });

    } else {
        document.getElementById("demo").innerHTML = "Password NON Corrispondente";
    }
}

function promisePrendiDati(method, url) {
    var data1 = {
        email: document.getElementById("email").value,
        password: document.getElementById("psw").value
    }
    return new Promise((resolve, reject) => {
        let xhreq = new XMLHttpRequest(); 
        xhreq.open(method, url); 
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";
        xhreq.send(JSON.stringify(data1)); 
            if (xhreq.status <= 201) {
                document.getElementById("demo").innerHTML = "Ricerca Avvenuta";
                console.log("Ok trovato");
                resolve(xhreq.response);
            }
            if(xhreq.status == 403){
                document.getElementById("demo").innerHTML = "Ricerca Avvenuta, Password ERRATA!";
                reject(xhreq.reject);
            }
            if(xhreq.status == 404){
                document.getElementById("demo").innerHTML = "NON TROVATO";
                reject(xhreq.reject);
            }
            
        
    });
}

function promiseAggiornaDati(method, url) {

    var password = document.getElementById("psw").value;
    var email = document.getElementById("email").value;
    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var eta = document.getElementById("eta").value;
    var sesso = getRadioValue();
    var regione = document.getElementById("regione").value;
    var data = {
        email: email,
        password: password,
        nome: nome,
        cognome: cognome,
        eta: eta,
        sesso: sesso,
        regione: regione

    };
    console.log(email, password, nome, cognome, eta, sesso, regione);
    return new Promise((resolve, reject) => {

        let xhreq = new XMLHttpRequest(); 
        xhreq.open(method, url);
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";

        xhreq.send(JSON.stringify(data));
        xhreq.onload = () => {
            if (xhreq.status == 403) {
                document.getElementById("demo").innerHTML = "Aggiornamento non effettuato,password sbagliata";
                reject(xhreq.reject);
            }
            if (xhreq.status == 404) {
                document.getElementById("demo").innerHTML = "non trovato";
                reject(xhreq.reject);
            }
            if (xhreq.status <= 201){
                document.getElementById("demo").innerHTML = "Aggiornamento completato";
                resolve(xhreq.response);
                console.log("ok");
            }
        };
        xhreq.onerror = () => {
            console.log("errore");
        }

    });

}


function promiseCancellaDati(method, url) {
    var data1 = {
        email: document.getElementById("email").value,
        password: document.getElementById("psw").value
    }
    return new Promise((resolve, reject) => {
        let xhreq = new XMLHttpRequest(); 
        xhreq.open(method, url); 
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";
        xhreq.send(JSON.stringify(data1)); 
        xhreq.onload = () => {
            if (xhreq.status == 403) {
                document.getElementById("demo").innerHTML = "Password non conforme";
                reject(xhreq.reject);
            }
            if (xhreq.status == 404) {
                document.getElementById("demo").innerHTML = "nessuna corrispondenza";
                reject(xhreq.reject);
            }
            if (xhreq.status <= 201) {
                document.getElementById("demo").innerHTML = "Account eliminato";
                resolve(xhreq.response);

            }
        };
    });
}

