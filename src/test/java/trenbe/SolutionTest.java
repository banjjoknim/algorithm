package trenbe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void solution1Test() {
        Solution solution = new Solution();
        int result = solution.solution1(2613);
        assertThat(result).isEqualTo(7557);
    }

    @Test
    void solution2Test() {
        Solution solution = new Solution();
        String result = solution.solution2("PM 11:59:59", 1);
        assertThat(result).isEqualTo("00:00:00");
    }
}
