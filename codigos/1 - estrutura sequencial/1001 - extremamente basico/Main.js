var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseInt(prompt("Digite um número"));
var B = parseInt(prompt("Digite um número"));
var X = A+B;
console.log("X = "+X);