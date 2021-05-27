package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing{
    private SimpleHashAlgorithm simpleHashAlgorithm;

    public PreviewHashing() {
        this.simpleHashAlgorithm = new SimpleHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        String result = simpleHashAlgorithm.calculateHashCode(string);
        if(result.length() > 1000){
            throw new IllegalArgumentException();
        } else
            return result;
    }
}
