// * Solicitar datos al usuario
let num1 = prompt("Ingresa primer dato");
let num2 = prompt("Ingresa segundo dato");
let num3 = prompt("Ingresa tercer dato");
let num4 = prompt("Ingresa cuarto dato");
let num5 = prompt("Ingresa quinto dato");

let ordenamientoMayor = [num1, num2, num3, num4, num5];
let ordenamientoMenor = [num1, num2, num3, num4, num5];

// * Verificamos el tipo de dato ingresado
console.log("El primer dato ingresado es del tipo:",typeof(num1));
console.log("El segundo dato ingresado es del tipo:",typeof(num2));
console.log("El tercer dato ingresado es del tipo:",typeof(num3));

// * Verificamos que se hayan almacenado en el array
console.log(ordenamientoMayor);
console.log(ordenamientoMenor);

// ! Nota: para evitar errores se usa == en lugar de ===

// * Mostrar un mensaje en consola o por el DOM si los números son iguales.
if(num1 == num2 && num2 == num3){
    console.log("Los numeros que ingresaste son iguales!!!")
}

// * ordenados de mayor a menor, y de menor a mayor.
let almacenamientoTempMayor;
let almacenamientoTempMenor;

// * Ordenamiento de menor a mayor
for(let i = 0; i < ordenamientoMenor.length; i++){
    for(let j = 0; j <(ordenamientoMenor.length); j++){
        if(ordenamientoMenor[i] < ordenamientoMenor[j]){
            almacenamientoTempMenor = ordenamientoMenor[j]
            ordenamientoMenor[j] = ordenamientoMenor[i]
            ordenamientoMenor[i] = almacenamientoTempMenor;
            // almacenamientoTempMenor = almacenamientoNumeros[j];
            // ordenamientoMayor[i] = almacenamientoNumeros[j]
            // almacenamientoNumeros[j] = almacenamientoTempMenor;
        }
    }
}
// * Ordenamiento de mayor a menor
for(let i = ordenamientoMayor.length; i > -1; i--){
    for(let j = ordenamientoMayor.length; j > -1; j--){
        if(ordenamientoMayor[i] < ordenamientoMayor[j]){
            almacenamientoTempMayor = ordenamientoMayor[i]
            ordenamientoMayor[i] = ordenamientoMayor[j]
            ordenamientoMayor[j] = almacenamientoTempMayor;
        }
    }
}

console.log("Ordenamiento de mayor a menor")
console.log(ordenamientoMayor);
console.log("Ordenamiento de menor a mayor")
console.log(ordenamientoMenor);
