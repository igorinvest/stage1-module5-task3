package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(l -> l.stream()).collect(Collectors.toList()).stream().min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, (subtotal, element) -> subtotal + element);
    }
}
