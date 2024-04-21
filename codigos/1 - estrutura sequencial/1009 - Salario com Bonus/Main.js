var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = prompt("Digite o seu nome");
var B = parseFloat(prompt("Digite o seu salario"));
var C = parseFloat(prompt("Digite o montante total das vendas efetuadas por voce"));
var D = (B+0.15*C).toFixed(2);
console.log("TOTAL = R$ "+D);