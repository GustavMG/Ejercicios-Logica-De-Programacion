let numero = prompt("Ingrese un numero");
let numeroEntero = parseInt(numero);

let numeroSecreto = 35;
let felicidades = false;

while(!felicidades){
    let numero = prompt("Ingrese un numero");
    let numeroEntero = parseInt(numero);

    if(numero == numeroSecreto){
        console.log("Felicidades, adivinaste el número secreto.");
        felicidades = true;
    } else{
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
    }
}