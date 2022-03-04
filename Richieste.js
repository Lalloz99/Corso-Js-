var Url="http://192.168.2.32:4000/test";
var input=document.getElementsByTagName("input");
function promiseGetData(method, url){
    return new Promise((resolve, reject) => {
        let x = new XMLHttpRequest();
        x.open(method, url);
        x.send(null);

        x.onload = () => {
            resolve(console.log(x.response));
        }

    
});
}
promiseGetData("get","http://192.168.2.32:4000/test");
console.log("The_master");

function simplesendData(method, url){
       
    var nome=document.getElementById("1").value;
    var cognome=document.getElementById("2").value;
    var email=document.getElementById("3").value;
    var descrizione=document.getElementById("4").value;
    var numero=document.getElementById("5").value;

    var data={
        
        nome: nome,
        cognome: cognome,
        email: email,
        descrizione: descrizione,
        numero: numero
    };
    var y = new XMLHttpRequest();

    y.open(method, url);
    y.setRequestHeader("Content-Type","application/json");
    y.responseType = "json";  

    y.send(JSON.stringify(data));

    y.onload= () => {
        if(y.status>=400){
            console.log(y.response);
        }
    }
    var z = new XMLHttpRequest();

z.open(method, Url);
    z.setRequestHeader("Content-Type","application/json");
    z.responseType = "json";  

    z.send(JSON.stringify(data));

    z.onload= () => {
        
    }
  

    
}
simplesendData("POST","http://192.168.2.32:4000/test");


   







   
        