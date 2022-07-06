// Spread operator
// Spreads an iterable object out over one entity

const nums = [1, 2, 3, 4, 5, 6, 7, 8];
// console.log(nums[0], nums[1], nums[2]);
console.log(...nums); // Super concise syntax for up above. Works with infinite sized array

// Objects are not iterable, BUT spread operator makes an exception for objects

const obj = {
    num: 10,
    color: 'blue'
}

// Creates a clone of the old object. Different locations in memory
const newObj = {
    ...obj,
    color: 'Green' // Copies the old object, then overrwrites the value of color to be Green
}

console.log(newObj);

// Append an item to the end of an array using spread
const newNums = [...nums, 9];
console.log(newNums);
console.log(nums);

const string = 'Hello World';
// Obtain a char array of the string
const charArray = [...string];
console.log(charArray);

// Rest operator
// Rest condenses multiple values into a singular array. (Varargs from Java)

function printMovies(movie1, movie2, movie3, ...movies) {
    console.log('The number 1 movie is:', movie1);
    console.log('The number 2 movie is: ' + movie2);
    console.log(`The number 3 movie is: ${movie3}`);
    console.log(movies);
}

printMovies('Star Wars', 'Lord of the Rings', 'Harry Potter', 'The Godfather');

// Arrow functions
// Similar to lambda functions in Java

// This is the most common way to define a function in JS
const someFn = () => {
    console.log(num);
}

/**
 * Ground rules for arrow functions
 * 
 * () are required when 0 parameters exist OR 2+ parameters exist
 * () are optional if there's only 1 parameter
 * {} are optional if there's only one line of code for the function
 * if there's no {}, whatever is returned by that one line, is returned from the function
 *   If there's no {}, you also can't type return
 * if there's zero OR two+ lines, the {} are required
 * if there's {}, to return, you MUST type return
 */

// Arrow functions are super concise
const addTwoNums = (x, y) => x + y;

console.log(addTwoNums(1, 2));

const printXThenAddTwoNums = (x, y) => {
    console.log(x);
    return addTwoNums(x, y);
}

console.log(printXThenAddTwoNums(5, 6));