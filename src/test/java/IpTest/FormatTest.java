package IpTest;

import org.apache.commons.net.util.SubnetUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FormatTest {
    @Test
    public void testip() {
        SubnetUtils subnetUtils = new SubnetUtils("192.167.128.120", "255.255.255.255");
        System.out.println(subnetUtils.getInfo().getAddress());
        System.out.println(subnetUtils.getInfo().getCidrSignature());
        System.out.println(subnetUtils.getInfo().getNetworkAddress());
        List<String> list = splitIpFromInput("  192.167.128.120 \n  192.167.128.120\n  192.167.128.120\n");
        list.stream().forEach(s -> System.out.println(s));
    }
    public List<String> splitIpFromInput(String input){
        List<String> list = new ArrayList<>();
        input = input.trim();
        StringBuilder split = new StringBuilder();
        split.append("[");
        if (input.contains(",")) {
            split.append(",");
        }
        if (input.contains(" ")) {
            split.append(" ");
        }
        if (input.contains("\n")) {
            split.append("\n");
        }
        split.append("]+");
        String[] stringArr = input.split(split.toString());
        for (int i = 0; i < stringArr.length; i++) {
            list.add(stringArr[i].trim());
        }
        return list;
    }
}
