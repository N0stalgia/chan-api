package net.jackie.chen.ToolKit;

import java.util.Base64;

public class EncryptWay {

    public String getEncryptedString(String str) {

        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    public String getDecodedString(String str) {
        byte[] bytes = Base64.getDecoder().decode(str);
        return new String (bytes);
    }
}
