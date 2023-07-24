package a0717;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// import a0717.Transaction;

public class Tran {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brain", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian,2011,300),
            new Transaction(raoul,2012,1000),
            new Transaction(raoul,2011,400),
            new Transaction(mario,2012,710),
            new Transaction(mario,2012,700),
            new Transaction(alan,2011,950)
        );

        // System.out.println("모든 데이터" + transaction);

        // 1. 2011년에 일어난 모든 트렌잭션 검색 후 값을 오른차순 검색
        List<Transaction> trans01 = transactions.stream()
                                                .filter(item -> item.getYear() == 2011)
                                                .sorted(Comparator.comparingInt(Transaction::getValue))
                                                .collect(Collectors.toList());
                                                System.out.println(trans01);
        
                                                // 1. stream() 메서드를 호출해서 transactions 리스트를 스트림으로 변환
                                                // 2. item.getYear() == 2011 를 사용해서 2011년에 일어난 트랜잭션만 필터링
                                                // 3. Transaction 객체의 value 값을 기준으로 오름차순으로 정렬
                                                // 4. collect(Collectors.toList()); 정렬된 트랜잭션을 리스트로 수집하여 tran01

        // 2 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        List<String> tran02 = transactions.stream()
                                            .map(item -> item.getTrader().getCity())
                                            .distinct().collect(Collectors.toList());
                                            System.out.println(tran02);

        // 3 케인브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬
        List<Trader> trader03 = transactions.stream()
                                            .map(Transaction::getTrader) // 트랜잭션의 거래자 정보를 추출
                                            .filter(item -> "Cambridge".equals(item.getCity()))
                                            .sorted(Comparator.comparing(Trader::getName)) // 이름순으로 정렬
                                            .distinct()
                                            .collect(Collectors.toList());
                                            System.out.println(trader03);

        // 4. 모든 거래자의 이름 알파벳순 정렬
        List<String> trader04 = transactions.stream()
                                            .map(a -> a.getTrader().getName())
                                            .sorted()
                                            .distinct()
                                            .collect(Collectors.toList());
                                            System.out.println(trader04);

        // public static void practice4(List<Transaction> transactions) {
        //     String result = transactions.stream()
        //         .map(Transaction::getTrader)
        //         .map(Trader::getName)
        //         .distinct()
        //         .sorted()
        //         .collect(Collectors.joining(","));
        //     System.out.println(result);
        // }

        // 5. 밀라노에 거래자가 있습니까?
        boolean trader05 = transactions.stream()
                                            .anyMatch(item -> "Milan".equals(item.getTrader().getCity()));

                                            System.out.println("5. 밀라노의 거래자가 있는지 여부 " + trader05);


            // 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력
            List<Integer> trader06 = transactions.stream()
                                                .filter(item -> "Cambridge".equals(item.getTrader().getCity()))
                                                .map(Transaction :: getValue)
                                                .collect(Collectors.toList());
                                                System.out.println("케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력 " + trader06);

            // 전체 트랜잭션 중 최댓값은?
            Optional<Integer> trader07 = transactions.stream()
                                                .map(Transaction::getValue)
                                                .reduce(Integer::max);
                                                System.out.println("최댓값 : " + trader07);

            // 전체 트랜잭션 중 최솟값
            Optional<Integer> trader08 = transactions.stream()
                                                .map(Transaction::getValue)
                                                .reduce(Integer::min);
                                                System.out.println("최솟값 : " + trader08);

        }
    }

