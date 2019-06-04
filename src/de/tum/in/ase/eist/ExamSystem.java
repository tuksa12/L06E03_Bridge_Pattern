package de.tum.in.ase.eist;

import java.nio.file.Path;

public final class ExamSystem {

    // TODO 4: Change HashFunction to Hashing
    private static HashFunction hashGenerator;

    private ExamSystem() {
    }

    public static String hashFile(String document) {
        return hashGenerator.calculateHashCode(document);
    }

    public static void main(String[] args) {
        String file1 = readFile("exams/short_exam.txt");
        String file2 = readFile("exams/long_exam.txt");  //This file is too big for Preview Hashing

        // TODO 4: Change SimpleHash to PreviewHashing
        hashGenerator = new SimpleHashAlgorithm();

        System.out.println(hashFile(file1));
        try {
            System.out.println(hashFile(file2));
            throw new IllegalStateException("Hashing this file with preview hashing should not work!");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        // TODO 4: Change CryptoSecureHashAlgorithm to EnterpriseHashing
        hashGenerator = new CryptoSecureHashAlgorithm();

        System.out.println(hashFile(file1));
        System.out.println(hashFile(file2));
    }

    public static String readFile(String filepath) {
        Path path = Path.of(filepath);
        // TODO 5: Return the content of the passed file as a String.
        return null;
    }

}
