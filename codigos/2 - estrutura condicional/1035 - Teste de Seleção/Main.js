var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) {return lines.shift();};

function get_validade(A,B,C,D) {
    return B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0;
}

function main(){
    let numeros = prompt().split(' ').map(Number);
    let eh_valido = get_validade(...numeros);
    if (eh_valido) console.log("Valores aceitos");
    else console.log("Valores nao aceitos");
}

main()