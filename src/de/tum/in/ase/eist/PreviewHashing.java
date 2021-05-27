package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    private SimpleHashAlgorithm simpleHashAlgorithm;
    private int limit;

    public PreviewHashing() {
        super(new SimpleHashAlgorithm());
        this.simpleHashAlgorithm = new SimpleHashAlgorithm();
        limit = 1000;
    }

    public HashFunction getImplementation() {
        return simpleHashAlgorithm;
    }

    @Override
    public String hashDocument(String string) {
        String result = simpleHashAlgorithm.calculateHashCode(string);
        if (string.length() > limit) {
            throw new IllegalArgumentException();
        } else
            return result;
    }
}
