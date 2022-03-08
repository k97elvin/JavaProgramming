package day20_Arrays.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;
        }

    }
}
