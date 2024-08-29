package Step_001.Lec_001;

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

class   approach2 {
    public static int main(String type) {
        if (type.equals("Long") || type.equals("Double"))
            return 8;
        else if (type.equals("Character"))
            return 1;
        else if (type.equals("Integer") || type.equals("Float")) {
            return 4;
        } else
            return -1;
    }
}
