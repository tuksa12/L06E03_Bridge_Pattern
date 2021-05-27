package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing{
    private CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm;

    public EnterpriseHashing() {
        super(new CryptoSecureHashAlgorithm());
        cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        return cryptoSecureHashAlgorithm.calculateHashCode(string);
    }

    public HashFunction getImplementation() {
        return super.getImplementation();
    }
}
