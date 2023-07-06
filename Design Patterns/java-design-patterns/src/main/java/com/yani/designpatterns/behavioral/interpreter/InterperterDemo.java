package com.yani.designpatterns.behavioral.interpreter;


/**
 * Client.
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=8b3fa8f8-248e-424c-9cd2-0632cc684b4a</a>
 */
public class InterperterDemo {
    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression alteration1 = new AndExpression(terminal2, terminal3);
        Expression alteration2 = new OrExpression(terminal1, alteration1);

        return new AndExpression(terminal3, alteration2);
    }

    public static void main(String[] args) {
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
//        String context = "Lions Bears";
        String context = "Tigers Bears";

        Expression defined = buildInterpreterTree();
        System.out.println(context + " is " + defined.interpret(context));
    }
}
