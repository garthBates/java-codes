// setTimeout takes two params
// 1. A function to be executed at a later point in time (Callback function)
// 2. A number representing the amount of milliseconds to wait before invoking the callback

setTimeout(() => {
    console.log('Callback invoked!');
}, 1000);


// while (true) {

// }// This while true loop will never exit the call stack

// setInterval is the same as setTimeout, but will run the function each time the passed time elapses
// It's a recurring setTimeout
let count = 0;
let intervalId = setInterval(() => {
    console.log(count++);
    if (count > 10) {
        clearInterval(intervalId); // Kills the interval with that intervalId
    }
}, 500);