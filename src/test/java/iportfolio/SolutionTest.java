package iportfolio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

//    @ParameterizedTest
//    @MethodSource("solution1")
//    void solution1Test(int n, int result) {
//        Solution solution = new Solution();
//        assertThat(solution.solution(n)).isEqualTo(result);
//    }
//
//    private static Stream<Arguments> solution1() {
//        return Stream.of(
//                Arguments.of(2, 1),
//                Arguments.of(5, 2)
//        );
//    }

    @ParameterizedTest
    @MethodSource("solution2")
    void solution2Test(int[][] office, int r, int c, String[] move, int result) {
        Solution solution = new Solution();
        assertThat(solution.solution(office, r, c, move)).isEqualTo(result);
    }

    private static Stream<Arguments> solution2() {
        return Stream.of(
                Arguments.of(new int[][]{{5, -1, 4}, {6, 3, -1}, {2, -1, 1}}, 1, 0,
                        new String[]{"go", "go", "right", "go", "right", "go", "left", "go"},
                        14)
        );
    }

//    @ParameterizedTest
//    @MethodSource("solution3")
//    void solution3Test(int n, int result) {
//        Solution solution = new Solution();
//        assertThat(solution.solution(n)).isEqualTo(result);
//    }
//
//    private static Stream<Arguments> solution3() {
//        return Stream.of(
//                Arguments.of(9, 1),
//                Arguments.of(15, 4),
//                Arguments.of(41, 2)
//        );
//    }
}
