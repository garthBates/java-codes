// async and await keywords were added in ES7 (2016) as a nicer way to handle Promises
// They provide a nice alternative to .then and .catch syntax

// They allow us to write our asynchronous code as though it were synchronous
// Makes full use of pre-existing keywords in the language to read just like synchronous code

// To use await, we must first define an async function

async function someAsyncRegularFunction() {

}

const someAsyncArrowFunction = async () => {
    // Returning inside an async function implicitely wraps the returned value inside a fulfilled promise
    // Throwing inside an async function implicitely wraps the thrown value inside a rejected promise
    throw 'Hello Async!';
}

// const msg = someAsyncArrowFunction();
// console.log(msg);

// How can I extract 'Hello Async!' from this promise?
// msg.then(msg => console.log(msg)); // This unpacks the resolved Promise

// We can also use await keyword to unpack the resolved value
const withAwait = async () => {
    // I will wait here until I the Promise is resolved
    // Once it's resolved, I will continue on with msg holding the resolved data

    // await is effectively the .then()
    // catch is effectively the .catch()
    try {
        const msg = await someAsyncArrowFunction();
        console.log('Inside withAwait ' + msg);
    } catch (err) {
        // If any rejected Promise occurs. This catch is invoked
        console.log('Inside catch block.\nMessage: ' + err);
    }
    
}

withAwait();