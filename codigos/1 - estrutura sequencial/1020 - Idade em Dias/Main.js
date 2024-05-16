var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseInt(prompt("Digite sua idade"));
var B = parseInt(A/365);
var C = parseInt((A-365*B)/30);
var D = A-(365*B+30*C);
resultado = 
`${(B)} ano(s)
${(C)} mes(es)
${(D)} dia(s)`; 
console.log(resultado);