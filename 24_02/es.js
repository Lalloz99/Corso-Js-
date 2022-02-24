var v=[1,2,3,4];

function moltipilicare(v,d){
    for(var i=0; i<v.length; i++){
        v[i]*=d
        //x *= y  x = x * y


        
    

    }
    return v;

}
console.log(moltipilicare(v,2));


function sostituisci(s){
    var y="";
    for(var i=s.length-1;i>=0; i--){
        y+=s[i];


    }

    console.log(y);
}
sostituisci("miao");