public class Main {
    public static void main(String[] args) {
        String stringPoem[] = new String[10];
        stringPoem[0] = "Мой";
        stringPoem[1] = "дядя";
        stringPoem[2] = "не в шутку";
        stringPoem[3] = "самых";
        stringPoem[4] = "честных";
        stringPoem[5] = "правил";
        stringPoem[6] = "когда";
        stringPoem[7] = "не в шутку";
        stringPoem[8] = "не в шутку";
        stringPoem[9] = "Мой";

        boolean mask[] = new boolean[stringPoem.length];

        stringPoem.toString();

        for (int i = 0; i < stringPoem.length - 1; i++) {
            for (int j = i + 1; j < stringPoem.length; j++) {
                if (mask[i]) {
                    continue;
                }
                if (stringPoem[i].equals(stringPoem[j])) {
                    mask[i] = true;
                    mask[j] = true;
                }
            }
        }
        for (int i = 0; i < stringPoem.length; i++) {
            if (mask[i]) {
                stringPoem[i] = null;
            }
        }
        for (int i = 0; i < stringPoem.length; i++) {
            if (!mask[i]) {
                System.out.print(stringPoem[i]);
            }
        }
    }
}