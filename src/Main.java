public class Main {
    public static void main(String[] args) {
        String stringPoem[] = new String[10];
        stringPoem[0] = "Мой ";
        stringPoem[1] = "дядя ";
        stringPoem[2] = "не в шутку ";
        stringPoem[3] = "самых ";
        stringPoem[4] = "честных ";
        stringPoem[5] = "правил ";
        stringPoem[6] = "когда ";
        stringPoem[7] = "не в шутку ";
        stringPoem[8] = "не в шутку ";
        stringPoem[9] = "Мой ";
        boolean isEquals = false;

        boolean mask[] = new boolean[stringPoem.length];

        for (int i = 0; i < stringPoem.length - 1; i++) {
            for (int j = i + 1; j < stringPoem.length; j++) {
                if (mask[i]) {
                    continue;
                }
                if (stringPoem[i].equals(stringPoem[j])) {
                    isEquals = true;
                    //mask[i] = true;
                    mask[j] = true;
                }
            }
            if (isEquals) {
                stringPoem[i] = null;
                isEquals = false;
            }
        }
        for (int i = 0; i < stringPoem.length; i++) {
            if (mask[i]) {
                stringPoem[i] = null;
            }
        }
        for (int i = 0; i < stringPoem.length; i++) {
            if (stringPoem[i] != null) {
                System.out.print(stringPoem[i]);
            }
        }
    }
}