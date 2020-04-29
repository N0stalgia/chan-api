package ToolTest;

import net.jackie.chen.ToolKit.EncryptWay;
import org.junit.Test;

public class EncryptTest {

    @Test
    public void testEncode() {
        String str = "a123456!A201427";
        String str1 = "4h@5Fw@Fa.c6vuu";
        System.out.println(new EncryptWay().getEncryptedString(str1));
        System.out.println(new EncryptWay().getDecodedString("NGhANUZ3QEZhLmM2dnV1"));
    }
}
