package de.tum.in.ase.eist;

public abstract class Hashing {
    private HashFunction implementation;

    public HashFunction getImplementation() {
        return implementation;
    }

    public Hashing(HashFunction implementation) {
        this.implementation = implementation;
    }

    public abstract String hashDocument(String string);
}
