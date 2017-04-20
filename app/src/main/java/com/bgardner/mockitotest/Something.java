package com.bgardner.mockitotest;

interface Something {
    int someMethod();
    default int defaultBehavior() {
        return someMethod() / 2;
    }
}
