var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift();};
var A = parseInt(prompt("Escreva o tempo em segundos"));
var B = parseInt(A/3600);
var C = parseInt((A-B*3600)/60);
var D = parseInt(A-B*3600-C*60);
exibicao = `${B}:${C}:${D}`;
console.log(exibicao);