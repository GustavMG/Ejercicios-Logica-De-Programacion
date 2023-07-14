let numero = prompt("Ingrese un numero");
let numeroEntero = parseInt(numero);
let factorial = 1;

for(let i = 0; i < numeroEntero; i++){
    factorial = factorial * (i + 1);
}

console.log("El factorial es",factorial);