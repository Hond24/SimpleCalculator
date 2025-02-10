package org.example;

import java.util.Scanner;

public class SimpleCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double num1;
    double num2;
    char operator;

    while (true) {
      try {
        // 最初の数字を入力
        System.out.print("Enter first number: ");
        num1 = getValidNumber(scanner);

        // 演算子を入力
        System.out.print("Operator (+, -, *, /): ");
        operator = getValidOperator(scanner);

        // 2つ目の数字を入力
        System.out.print("Enter second number: ");
        num2 = getValidNumber(scanner);

        // 0除算チェック
        if (operator == '/' && num2 == 0) {
          System.out.println("Error: Division by zero is not allowed. Please enter again.");
          continue; // 再入力
        }

        // 計算結果を出力
        double result = calculate(num1, operator, num2);

        // 小数点以下の表示調整
        if (result % 1 == 0) {
          System.out.println("Result: " + (int) num1 + operator + (int) num2  + "=" + (int) result);
        } else {
          System.out.println("Result: "+ (int) num1 + operator + (int) num2  + "=" + result);
        }

        break; // 成功した場合はループを終了
      } catch (Exception e) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine(); // 入力バッファをクリア
      }
    }
    scanner.close();
  }

  // 数値を取得するメソッド
  private static double getValidNumber(Scanner scanner) throws NumberFormatException {
    String input = scanner.next();
    return Double.parseDouble(input); // 数値以外ならNumberFormatExceptionをスロー
  }

  // 演算子を取得するメソッド
  private static char getValidOperator(Scanner scanner) {
    String input = scanner.next();
    if (input.length() == 1 && "+-*/".contains(input)) {
      return input.charAt(0); // 有効な演算子を返す
    } else {
      throw new IllegalArgumentException("Invalid operator: " + input);
    }
  }

  // 計算を実行するメソッド
  private static double calculate(double num1, char operator, double num2) {
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        return num1 / num2;
      default:
        throw new IllegalArgumentException("Unknown operator: " + operator);
    }
  }
}
