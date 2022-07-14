/**
 * JavaScript data types are implicit, but are still important
 * 
 * Primitives:
 * - number
 * - boolean
 * - string
 * - null
 * - undefined 
 * - BigInt
 * - Symbol (Used by JS to give a signal to the compiler that something possesses some attribute)
 * 
 * Objects:
 * - Objects
 * - Arrays
 * - Functions
 */

// We can check the data type of a variable at runtime
let someVar = 100;

console.log(typeof someVar); // What is the type of the variable. Returns as a string 'number'

someVar = false;

console.log(typeof someVar); // 'boolean'

someVar = [1, 2, 3];

console.log(typeof someVar); // 'object'

console.log(typeof function() {}); // 'function'