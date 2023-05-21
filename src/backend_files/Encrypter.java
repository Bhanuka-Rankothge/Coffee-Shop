package backend_files;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypter {
    public String secure(String input) throws NoSuchAlgorithmException {
    
        // Selecr md5 from MessageDigest
    MessageDigest md = MessageDigest.getInstance("MD5");
    md.update(input.getBytes());
    byte[] digest = md.digest();
    StringBuilder sb = new StringBuilder();
    
    for (byte b : digest) {
        sb.append(String.format("%02x", b & 0xff));
    }
    return sb.toString();
    }
}
