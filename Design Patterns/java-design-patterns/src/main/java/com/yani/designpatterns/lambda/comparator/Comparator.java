package com.yani.designpatterns.lambda.comparator;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T t1, T t2);

    static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);

        return (p1, p2) -> {
            U u1 = keyExtractor.apply(p1);
            U u2 = keyExtractor.apply(p2);

            return u1.compareTo(u2);
        };
    }

    default Comparator<T> reversed() {
        return (t1, t2) -> this.compare(t2, t1);
    }

    default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);

        Comparator<T> other = comparing(keyExtractor);
        return this.thenComparing(other);
    }

    default Comparator<T> thenComparing(Comparator<T> other) {
        Objects.requireNonNull(other);

        return (T t1, T t2) -> {
            int compare = this.compare(t1, t2);

            if (compare == 0) {
                return other.compare(t1, t2);
            }

            return compare;
        };
    }
}
