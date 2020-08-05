package com.jaredengler;

import java.util.Stack;

public class ParensBalancer {

    public Boolean isBalanced(String string) {

        if ("".equals(string))
            return true;

        Stack<String> stack = new Stack<>();

        for (String c : string.split("")) {
            if ("(".equals(c))
                stack.push("!");
            else if (")".equals(c)) {
                if (stack.empty())
                    return false;
                stack.pop();
            }
        }

        return stack.empty();

    }

}
