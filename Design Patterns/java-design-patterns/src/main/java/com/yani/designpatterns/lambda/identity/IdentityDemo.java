package com.yani.designpatterns.lambda.identity;

import com.yani.designpatterns.lambda.function.Function;

public class IdentityDemo {
    public static void main(String[] args) {
        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("hey"));
    }
}
