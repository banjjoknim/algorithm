package trenbe;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Solution {
    public int solution1(int N) {
        String input = String.valueOf(N);
        Character[] numbers = new Character[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.toCharArray()[i];
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        StringBuilder reverse = new StringBuilder();
        for (Character character : numbers) {
            reverse.append(character);
        }
        Arrays.sort(numbers);
        StringBuilder normal = new StringBuilder();
        for (Character character : numbers) {
            normal.append(character);
        }
        return Integer.parseInt(normal.toString()) + Integer.parseInt(reverse.toString());
    }

    public String solution2(String p, int n) {
        DateTimeFormatter beforeFormatter = DateTimeFormatter.ofPattern("a hh:mm:ss", Locale.US);
        DateTimeFormatter afterFormatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US);
        LocalTime before = LocalTime.parse(p, beforeFormatter);
        LocalTime after = before.plusSeconds(n);
        return afterFormatter.format(after);
    }
}
