/**
 * Higher Order Functions (HOFs)
 * 
 * These are functions that EITHER take a function as a parameter OR return a function
 */

// Callback functions we pass to higher order functions

// Write a function that returns another function

const timesX = (x) => {
    // This is a closure
    // A closure is when an inner scope maintains reference to an outer scope
    return (y) => {
        return x * y;
    }
}

const times5 = timesX(5);

console.log(times5(10)); // 50
console.log(times5(-1)); // -5 

const times3 = timesX(3);
console.log(times3(3)); // 9

console.log(times5(2)); // 10

console.log(timesX(10)(2)); // 20

/**
 * Passing a function to another function
 * 
 * Array Built-In HOFs
 * 
 * For all of these, mutating the value does NOT mutate the array. They are pure functions
 * 
 * forEach - Allows me to run some function on each element of the array. Whatever is returned is ignored. Void return
 * map - The exact same as forEach, but whatever is returned is added a NEW array and that array is returned
 * filter - Filter also returns a new array, but it only returns the indices where true is returned
 * reduce - Takes an array and reduces it down to a singular value. It does this by running some accumulated value
 */

// forEach

const planets = ['Mercury', 'Venus', 'Earth', 'Mars', 'Saturn', 'Jupiter', 'Uranus', 'Neptune', 'Pluto'];

function printPlanet(planet) {
    console.log(planet)
}

// forEach has a loop that loops over planets and calls printPlanet with each planet
planets.forEach(printPlanet);

// What forEach essentially does
// for (let planet of planets) {
//     printPlanet(planet);
// }

planets.forEach((planet) => {
    planet = 'EARTH';
    return planet;
});

// The planets array is NOT changed
console.log(planets);

// map

const updatedPlanets = planets.map((planet) => {
    planet = 'EARTH';
    return planet;
});

const upperCasedPlanets = planets.map(planet => planet.toUpperCase());

console.log(planets); // This is still unchanged
console.log(updatedPlanets);
console.log(upperCasedPlanets);

// filter

// Return only the planets that have an e in it

const planetsWithAnE = planets.filter(planet => {
    return planet.includes('e') || planet.includes('E');
});

console.log(planetsWithAnE);

// reduce

const nums = [6, 5, 9, 3, 1]; // 24

// currSum's value
// 0 -> 6 -> 11 -> 20 -> 23 -> 24
const sum = nums.reduce((currSum, num) => {
    return currSum + num;
}, 0); // Starting with currSum at 0

console.log(sum);

// find max
const maxNum = nums.reduce((currMax, num) => {
    return currMax > num ? currMax : num;
}, Number.MIN_VALUE); // Smallest number possible

console.log(maxNum);