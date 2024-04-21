var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseInt(prompt("Digite um número"));
var B = parseInt(prompt("Digite um número"));
SOMA=A+B;
console.log("SOMA = "+SOMA);