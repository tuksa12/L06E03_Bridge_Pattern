package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing{
    private CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm;

    public EnterpriseHashing() {
        cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        return cryptoSecureHashAlgorithm.calculateHashCode(string);
    }
}
