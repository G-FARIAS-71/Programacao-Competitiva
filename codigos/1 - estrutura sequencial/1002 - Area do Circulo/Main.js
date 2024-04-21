var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var Pi = 3.14159;
var R = parseFloat(prompt("Digite o raio do circulo"));
var A = (Pi*(Math.pow(R,2))).toFixed(4);
console.log("A="+A);