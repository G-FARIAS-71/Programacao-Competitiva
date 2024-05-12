var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var N = 2 * parseInt(prompt("Digite um número"));
console.log(N + " minutos")