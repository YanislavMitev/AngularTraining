package com.yani.designpatterns.lambda.predicate;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> other) {
        return (T t) -> {
            Objects.requireNonNull(other);

            return this.test(t) && other.test(t);
        };
    }

    default Predicate<T> negate() {
        return (T t) ->  !this.test(t);
    }
}
