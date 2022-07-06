// To declare a function
function print(msg) {
    console.log(msg);
}

print('Hello Functions');
print(); // If no paramter is provided, JS just assigns it's value to undefined
print(1, 2, 3); // Since the function only takes one argument, the rest are discarded

function printFullName(firstName, lastName) {
    
    console.log(firstName, lastName); // Auto adds a space between each comma
    // console.log(`${firstName} ${lastName}`); // Template literal
    // console.log(firstName + ' ' + lastName); // This works, much like Java   
}

function printFullNameWithAgeAndFavColor(firstName, lastName, age, favColor) {
    console.log(`Hello! My name is ${firstName} ${lastName} and I am ${age} years old! My favorite color is ${favColor}`);
}

printFullName('Sean', 'Carter');

printFullNameWithAgeAndFavColor('John', 'Doe', 35, 'Green');

// Default parameters
// In JavaScript there is no such notion of function overloading
// Instead, we can assign defaults

// Default params - In the event that undefined is passed to a given parameter, the default value will be used
function calcAreaOfRectangle(length, width=length) {
    return length * width;
}

let area = calcAreaOfRectangle(5.0, 10.0);
console.log(area);
area = calcAreaOfRectangle(5.0, null);
console.log(area);
