var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseFloat(prompt("escreva a nota com peso 3.5"));
var B = parseFloat(prompt("escreva a nota com peso 7.5"));
var MEDIA = ((3.5*A+7.5*B)/11).toFixed(5);
console.log("MEDIA = "+MEDIA);