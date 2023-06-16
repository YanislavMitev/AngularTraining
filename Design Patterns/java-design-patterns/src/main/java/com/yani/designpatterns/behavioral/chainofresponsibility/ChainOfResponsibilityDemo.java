package com.yani.designpatterns.behavioral.chainofresponsibility;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=6745fba9-4889-4471-a38b-5cead2ac70e2</a>
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
