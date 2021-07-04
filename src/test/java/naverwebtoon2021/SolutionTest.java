package naverwebtoon2021;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provide1")
    void 문제_1번(int[] prices, int[] discounts, int result) {
        // given

        // when
        Solution solution = new Solution();
        int actual = solution.solution1(prices, discounts);

        // then
        assertThat(actual).isEqualTo(result);
    }

    private static final Stream<Arguments> provide1() {
        return Stream.of(
                Arguments.of(new int[]{13000, 88000, 10000}, new int[]{30, 20}, 82000),
                Arguments.of(new int[]{32000, 18000, 42500}, new int[]{50, 20, 65}, 45275)
        );
    }


    @ParameterizedTest
    @MethodSource("provide2")
    void 문제_2번(String s, String[] result) {
        // given

        // when
        Solution solution = new Solution();
        String[] actual = solution.solution2(s);

        // then
        assertThat(actual).isEqualTo(result);
    }

    private static Stream<Arguments> provide2() {
        return Stream.of(
                Arguments.of("abcxyasdfasdfxyabc", new String[]{"abc", "xy", "asdf", "asdf", "xy", "abc"}),
                Arguments.of("abcxyqwertyxyabc", new String[]{"abc", "xy", "qwerty", "xy", "abc"}),
                Arguments.of("abcabcabcabc", new String[]{"abc", "abc", "abc", "abc"}),
                Arguments.of("llttaattll", new String[]{"l", "l", "t", "t", "a", "a", "t", "t", "l", "l"}),
                Arguments.of("zzzzzz", new String[]{"z", "z", "z", "z", "z", "z"}),
                Arguments.of("abcdef", new String[]{"abcdef"})
        );
    }

    @ParameterizedTest
    @MethodSource("provide3")
    void 문제_3번(String s, String t, int result) {
        // given

        // when
        Solution solution = new Solution();
        int actual = solution.solution3(s, t);

        // then
        assertThat(actual).isEqualTo(result);
    }

    private static Stream<Arguments> provide3() {
        return Stream.of(
                Arguments.of("aabcbcd", "abc", 2),
                Arguments.of("aaaaabbbbb", "ab", 5)
        );
    }
}