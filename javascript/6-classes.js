// Classes were added in ES6 (2015 release of JS)
// They are an abstraction over "constructor function" or "syntactic sugar" over constructor functions

class Shape extends Object {

    color; // This defines color as a property of Shape

    // Writing a constructor
    constructor(color) {
        super(); // Super is implicitely called if not specified
        this.color = color;
    }

    // Adding methods to our Shape class
    static someFn() {
        console.log('Hello Shape!');
    }

    printColor() {
        console.log(this.color);
    }

    // Adding methods to the shape object
}

const shape = new Shape('Red');
console.log(shape.color);

Shape.someFn();
shape.printColor();

// Inheritance with Classes

// All properties will be inherited from Shape (and Object)
class Rectangle extends Shape {
    length;
    width;

    constructor(length, width, color='Red') {
        super(color);
        this.length = length;
        this.width = width;
    }

    calcArea() {
        return this.length * this.width;
    }

    calcPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}

const redRectangle = new Rectangle(10.0, 5.5);

console.log(redRectangle);
console.log(redRectangle.calcArea());
console.log(redRectangle.calcPerimeter());

