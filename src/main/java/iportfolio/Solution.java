package iportfolio;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Solution {
//    public int solution(int n) {
//        // 1. 닫혀있으면 열고 열려있으면 닫는다.
//        // 2. 해당 로직을 index를 증가시키면서 적용한다.
//        // true -> open, false -> close
//        boolean[] doorStates = new boolean[n];
//        int number = 1;
//        while (number <= n) {
//            changeState(doorStates, number);
//            number++;
//        }
//        int result = 0;
//        for (boolean isOpen : doorStates) {
//            if (isOpen) {
//                result++;
//            }
//        }
//        return result;
//    }
//
//    private void changeState(boolean[] doorStates, int number) {
//        for (int i = number - 1; i < doorStates.length; i = i + number) {
//            if (doorStates[i]) {
//                doorStates[i] = false;
//                continue;
//            }
//            doorStates[i] = true;
//        }
//    }

    // n * n 격자, 물건이 없는 격자는 먼지.
    // 물건이 있는 칸은 -1로 표시
    // 쌓여있는 먼지의 양은 0 이상의 정수로 나타냄
    // 로봇 청소기로 청소하려고 함.
    // 명령은 3가지.
    // go : 바라보는 방향으로 1칸 전진
    // left : 바라보는 방향 기준 왼쪽으로 회전
    // right : 바라보는 방향 기준 오른쪽으로 회전
    // 로봇 청소기가 방문하면 모든 먼지를 청소하여 먼지의 양은 0이 된다.
    // 먼지의 양이 0인칸은 방문해도 청소량이 0이다.
    // 로봇 청소기는 처음에 항상 북쪽을 바라본 상태로 시작.
    public int solution(int[][] office, int r, int c, String[] move) {
        return 1;
    }

    // n개의 공을 바구니에 나누어 담으려고 한다.
    // 각 바구니에는 K^2 개의 공을 담아야 한다. K는 자연수
    // 바구니에 나누어 담는 방법은 여러가지가 될 수 있지만 가정 적은 바구니를 이용하여 담으려고 한다.
    // 필요한 바구니 개수의 최솟값은?

    // 1. 제곱근해서 제일 큰 숫자부터 넣어보자.
//    public int solution(int n) {
//        int[] numbers = new int[(int) Math.sqrt(n)];
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            numbers[numbers.length - i] = i;
//        }
//        int count = 1;
//        while (!canDistribute(n, numbers, count)) {
//            count++;
//        }
//        return count;
//    }
//
//    private boolean canDistribute(int n, int[] numbers, int count) {
//        int sum = 0;
//        int index = 0;
//        while (index < count) {
//            sum = sum + (int) Math.pow(numbers[index], 2);
//            index++;
//        }
//        return sum == n;
//    }
}
