package Step001.Step001_01;

import java.util.Objects;

public class DataType_002 {
    public static int main(String type) {
        int output = 0;

        if (Objects.equals(type, "Long"))
            output = 8;
        if (Objects.equals(type, "Integer"))
            output = 4;
        if (Objects.equals(type, "Float"))
            output = 4;
        if (Objects.equals(type, "Double"))
            output = 8;
        if (Objects.equals(type, "Character"))
            output = 1;

        return output;
    }
}
