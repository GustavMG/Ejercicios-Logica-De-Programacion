let temperaturaCelsius = prompt("Ingresa temperatura en grados Celsius, recuerda que  0º C el punto de congelación del agua y 100º C el punto de ebullición del agua");
temperaturaCelsius = parseInt(temperaturaCelsius);

let temperaturaFarenheit;
let temperaturaKelvin;

temperaturaFarenheit = (temperaturaCelsius * 1.8) +32;
temperaturaKelvin = temperaturaCelsius + 273.15;

console.log("La temperatura original en Celsius es:", temperaturaCelsius);
console.log("La temperatura en Farenheit es:",temperaturaFarenheit);
console.log("La temperatura en Kelvin es:",temperaturaKelvin);