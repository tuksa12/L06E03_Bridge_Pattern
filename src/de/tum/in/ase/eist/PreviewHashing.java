package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing{
    private SimpleHashAlgorithm simpleHashAlgorithm;

    public PreviewHashing() {
        super(new SimpleHashAlgorithm());
        this.simpleHashAlgorithm = new SimpleHashAlgorithm();
    }

    public HashFunction getImplementation() {
        return super.getImplementation();
    }

    @Override
    public String hashDocument(String string) {
        String result = simpleHashAlgorithm.calculateHashCode(string);
        if(string.length() > 1000){
            throw new IllegalArgumentException();
        } else
            return result;
    }
}
