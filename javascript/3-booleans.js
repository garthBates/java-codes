// Two types of equality operators

// Equality operator (==)
// It works by comparing the values between two entities

console.log(1 == 1); // true
console.log(1 != 2); // true
console.log(1 == '1'); // true because the values are the same (Picture casting the number 1 to a string)

// Strict equality operator (===)
// It works by first comparing the types of the two entities, then, if true, compares the values

console.log(1 === '1'); // false
console.log(1 !== '1'); // true

// I only use == in one place ever
// It's great comparing null and undefined. Good for checking to ensure a value is NEITHER null or undefined
console.log(null == undefined); // true

let myVar = undefined;
if (myVar != null) {
  // this prevents null/undefined values for myVar
  console.log('This does not run');
}

/**
 * Truthy vs Falsy values
 * 
 * Falsy:
 * - false
 * - 0
 * - -0
 * - 0n
 * - null
 * - undefined
 * - ''
 * - NaN
 * 
 * Truthy (Anything that's not falsy):
 * - true
 * - 'false'
 * - '0'
 * - ' '
 * - {}
 * - []
 * - 42 
 */

// Casting to a boolean

// 1. Using Boolean wrapper class constructor
console.log(new Boolean(0)); // false
console.log(new Boolean('')); // false
console.log(new Boolean([])); // true

// 2. Implicit casting with the ! operator
console.log(!!0); // false

// 3. Implicitley casted by context (ie. if condition)
if (0) {
    console.log('This doesn\'t run');
}


let someVar = 0;

// There's technically a bug here
if (someVar) { // Instead, use != null to allow 0 or '' or false
    console.log('The value of someVar is', someVar);
}