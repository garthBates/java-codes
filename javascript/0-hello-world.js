// Code execution starts at the top of the file
console.log('Hello World');

/**
 * var - global OR function scoped. It CAN be redeclared
 * let - block scoped. I can only declare the variable ONCE.
 * const - block scoped. No redelcartion OR reassignment to a const variable
 */

var a = 'a';
var a = 'b'; // Can redeclare

let b = 'b';
b = 'c'; // This is fine. Reassignment is allowed
// let b = 'c'; // This is not allowed due to let preventing redeclaration

if (false) {
    var c = 'c'; // This is still a global scope
    let d = 'd'; // This variable is only accessible within this if block
}

console.log(c);

// Const
const arr = [1, 2, 3];
// arr -> 325dsaf@ -> [100, 2, 3]
arr[0] = 100;
console.log(arr);