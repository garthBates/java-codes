// while
// for
// do-while
// for..of
// for..in

// while loop
let counter = 0;
while (counter < 5) {
    console.log(counter++);
}

// for loop
for (let i = 0; i < 10; i++) {
    console.log(i);
}

// do-while
do {
    console.log('This loop only runs once');
} while(false);

// for..of
// for..of iterates over "iterable" objects (It possesses Symbol.iterator on it)

// In JS, arrays are "iterable"
const nums = [-6, 52, 632];

// Java "enhanced for loop"
// for (int num : nums) {
    
// } 

for (let num of nums) {
    console.log(num);
}

// strings are also iterable
for (let char of 'Hello World') {
    console.log(char);
}

// for..in
// for..in iterates over "enumerable" entities

for (let num in nums) { // The indices are the enumerable bits
    console.log(num);
}

// Objects' properties are "enumerable" by default

// Defining an object
const john = {
    firstName: 'John',
    lastName: 'Doe',
    age: 35,
    favColor: 'Green',
    hobbies: ['Golfing', 'Fishing', 'Mountain Biking', 'Netflix'],
    key: 'Some Key'
};


// I can set properties to not be enumerable
Object.defineProperty(john, 'firstName', {enumerable: false});


// Print all of the keys of an object
for (let key in john) {
    // console.log(john.key); // This will not work as intended
    // Instead, use this
    console.log(john[key]); // Square bracket notation is used for dynamic keys
}

// Even with enumerable as false, the value is still accessible
console.log(john.firstName); // Accessing a value off an object

console.log(john);

let id = 10;
const obj = {
    [id]: 1 // dynamic key. Use the value of the variable id as the key
}

obj['first name with spaces'] = 'First name'; // This is allowed, but please never do

console.log(obj);