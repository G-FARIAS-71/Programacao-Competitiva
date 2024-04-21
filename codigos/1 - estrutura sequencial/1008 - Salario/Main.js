var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseInt(prompt("Escreva o numero do funcionario"));
var B = parseInt(prompt("Escreva o numero de horas trabalhadas pelo funcionario"));
var C = parseFloat(prompt("Escreva o o valor que o funcionario recebe por hora trabalhada"));
var D = (B*C).toFixed(2);
W = `NUMBER = ${(A)}
SALARY = U$ ${(D)}`;
console.log(W);