let numero = prompt("Ingrese un numero");
let numeroEntero = parseInt(numero);

let fibonacci1 = [0, 1];
let fibonacci2 = 1;

for(let i = 2; i < numeroEntero; i++){
    fibonacci1[i] = fibonacci1[i - 1] + fibonacci1[i - 2];
    // fibonacci2 = fibonacci2 + (i - 1);
    // fibonacci.push(fibonacci2);
}
console.log(fibonacci1);