package main.java.com.digitalleague;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        while(true) {
            System.out.println("Введите выражение:");
            String expression = scanner.nextLine();

            if (Validator.isExpressionValid(expression)) {
                try {
                    System.out.println("Ответ: " + engine.eval(expression));
                    break;
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
