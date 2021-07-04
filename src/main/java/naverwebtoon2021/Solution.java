package naverwebtoon2021;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class Solution {
    public int solution1(int[] prices, int[] discounts) {
//     쿠폰은 제품 하나당 하나만 적용 가능
//     가장 높은 할인율을 가진 쿠폰부터 사용
        List<Integer> priceList = Arrays.stream(prices)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        List<Integer> discountList = Arrays.stream(discounts)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        BigDecimal sum = BigDecimal.ZERO;
        int discountListSize = discountList.size();
        for (int i = 0; i < discountListSize; i++) {
            BigDecimal discountPercent = BigDecimal.valueOf(100 - discountList.get(i)).divide(BigDecimal.valueOf(100));
            BigDecimal payAmount = BigDecimal.valueOf(priceList.get(i)).multiply(discountPercent);
            sum = sum.add(payAmount);
        }
        int priceListSize = priceList.size();
        for (int i = discountListSize; i < priceListSize; i++) {
            sum = sum.add(BigDecimal.valueOf(priceList.get(i)));
        }
        return sum.intValue();
    }

    public String[] solution2(String s) {
        // 가능한 많은 개수의 문자열 조각으로 자르려고 한다. -> 가능한 작은 단위로 자를 것
        // 잘린 문자열 조각을 앞에서부터 순서대로 s(1) ... s(n)이라고 한다.
        // 이때 다음 조건을 만족해야 한다.
        // 1 <= i <= (n+1)/2 인 모든 자연수 i에 대해서, s(i) = s(n - i + 1)
        // 조건에 맞게 s를 문자열 조각으로 자룬 후 순서대로 배열에 담아 반환.

        // 1. 가장 작은 문자열의 단위부터 출발. 1개부터 시작
        // 2. 시작과 끝의 문자열을 차례대로 동일한 길이만큼 자르고, 같은지 비교
        // 3. 같으면 결과에 저장하고 각각 제거
        // 4. 다르면 해당 문자열에서 문자열의 길이를 늘려서 다시 검사
        // 5. 반복
        StringBuilder builder = new StringBuilder(s);
        int index = 0;
        List<String> nearStarts = new ArrayList<>();
        List<String> nearEnds = new ArrayList<>();
        while (builder.length() != 0) {
            if (index == builder.length()) {
                nearStarts.add(builder.toString());
                break;
            }
            String nearStart = builder.substring(0, index);
            String nearEnd = builder.substring(builder.length() - index, builder.length());
            if (nearStart.equals(nearEnd) && index != 0) {
                builder.delete(0, index);
                builder.delete(builder.length() - index, builder.length());
                nearStarts.add(nearStart);
                nearEnds.add(nearEnd);
                index = 0;
            }
            index++;
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nearStarts.size(); i++) {
            result.add(nearStarts.get(i));
        }
        int size = result.size();
        for (int i = 0; i < nearEnds.size(); i++) {
            result.add(size, nearEnds.get(i));
        }
        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }


    public int solution3(String s, String t) {
        // 한 번에 한 개의 문자열만 제거할 수 있다.
        // 찾아 바꾸기는 문자열을 찾아서 해당 문자열을 제거한다.
        // 제거할 문자열이 여러 번 나타나거나, 문자열을 제거한 결과가
        // 또 다시 바꿀 문자열과 같아지는 경우 한번 더 찾아 바꾸기를 해야 한다.
        // 총 몇 번의 찾아 바꾸기를 진행해야 문장 s에서 t가 더 이상 존재하지 않는지 계산하는 함수를 완성하시오.

        // 1. 문자열이 시작하는 인덱스를 찾는다.
        // 2. 해당 인덱스부터 문자열만큼의 숫자를 제거한다.
        // 3. 반복한다.
        Pattern pattern = Pattern.compile(t);
        int result = 0;
        StringBuilder builder = new StringBuilder(s);
        while (pattern.matcher(builder).find()) {
            int index = builder.indexOf(t);
            builder.delete(index, index + t.length());
            result++;
        }
        return result;
    }
}
