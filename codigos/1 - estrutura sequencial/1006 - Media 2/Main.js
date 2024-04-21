var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseFloat(prompt("digite sua nota com peso 2"));
var B = parseFloat(prompt("digite sua nota com peso 3"));
var C = parseFloat(prompt("digite sua nota com peso 5"));
var D = ((2*A+3*B+5*C)/10).toFixed(1);
console.log("MEDIA = "+D);