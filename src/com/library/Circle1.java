package com.library;

class Circle1 {

    //Data fields
    double radius;

    //Constructors
    Circle1() {
        radius = 1.0;
    }

    //Methods
    Circle1(double newRadius) {
        this.radius = newRadius;
    }

    double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}