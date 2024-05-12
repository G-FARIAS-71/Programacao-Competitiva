var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var h = parseInt(prompt());
var km = parseInt(prompt());
var gasto = (h * km / 12.0).toFixed(3);
console.log(gasto);