var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var Pi = 3.14159;
var R = parseFloat(prompt("Digite o raio do circulo"));
var V = (4.0/3.0 * Pi * Math.pow(R,3)).toFixed(3);
console.log("VOLUME = "+V);