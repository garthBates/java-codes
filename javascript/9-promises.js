// Promises are a nice way to deal with asynchronous operations
// Before Promises, we used callbacks

// Promises are objects that represent the eventual success or failure of an asynchronous operation

/**
 * Promises have different states that represent the current status of an asynchronous event
 * 
 * Pending: The request is still being processed (The buzzer sitting idle)
 * Fulfilled: The request has been processed and the desired outcome occurred (Buzzer flashes green. Table is ready)
 * Rejected: The request has been processed and the undesired outcome occurred (Buzzer flashes red. No tables available. Closing up shop)
 * Settled: The request has been processed and either outcome has been executed (Buzzer is returned)
 */

// Create a Promise

// Using the Promise constructor

// based off the number, fail or succeed the promise
const createPromise = (num) => {
    return new Promise((resolve, reject) => {
        if (num < 10) {
            reject("Number can't be less than 10."); // The parameter to this function is the error data
        } else {
            resolve(`Number received! Your number is ${num}`); // The parameter to this function is the success data
        }
    });
}

const myPromise = createPromise(14); // This should return a successful promise

// Handling a promise

// .then() handles fulfilled promises
// .catch() handles rejected promises

myPromise.then(data => {
    // I put in here what I want to do with said data
    // publishDataToServer(data)
    console.log('Handling successful promise');
    console.log(data);
    throw 'Promise was successful, but triggering .catch()'; // Promise.reject(msg);
}).catch(err => console.error(err));


// Chaining promises
// .then() AND .catch() both return promises implicitely
// Anything returned in either is a fulfilled Promise
// Anything thrown in either is a rejected Promise

// Create a Promise that is immediately fulfilled
Promise.resolve(1)
  .then(num => num + 1) // Returns 2 as a new fulfilled promise. return Promise.resolve(num + 1)
  .then(num => { console.log(num); throw num + 1; })
  .then(num => { console.log(num); return num + 10 }) // This one gets skipped due to rejected promise
  .catch(num => console.log(num))
  .finally(() => console.log('Finally done!'));


// Handle multiple Promises concurrently
// I'll emulate a network request by adding a time element to it

const createTimedPromise = (time, promiseName) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (promiseName === 'Short Promise') {
                reject(`${promiseName} was rejected!`);
            }
            resolve(`${promiseName} was fulfilled!`);
        }, time);
    });
}

const shortPromise = createTimedPromise(0, 'Short Promise');
const mediumPromise = createTimedPromise(5000, 'Medium Promise');
const longPromise = createTimedPromise(7000, 'Long Promise');

// They all succeed together or fail together. If one fails they all immediately fail
Promise.all([shortPromise, mediumPromise, longPromise])
  .then(data => console.log(data))
  .catch(err => console.log(err));

// Promise.any is used to wait for the first success of ANY of the promises provided
// Promise.race is used to wait for the first success OR failure of ANY of the provided promises
// Promise.allSettled is used to wait for all promises provided REGARDLESS of outcome