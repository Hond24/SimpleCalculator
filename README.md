
# SimpleCalculator
簡易計算プログラム

### 🚀 簡単な計算機プログラム（Java製）
このプロジェクトは、Java の基本文法と **例外処理** を学ぶためのシンプルな計算機です。  
ユーザーから **数値と演算子を入力** し、計算結果を出力します。  
また、**不正な入力や 0 除算** などに対応し、再入力を促す仕組みを実装しています。

---

## 🎥 デモ（実行例）
![計算機の実行例]

# 正常
Enter first number: 10
Operator (+, -, *, /): +
Enter second number: 5
Result: 10+5=15

# エラー
不正な入力
Enter first number: f
Invalid input. Please try again.

ゼロ除算
Enter first number: 1
Operator (+, -, *, /): /
Enter second number: 0
Error: Division by zero is not allowed. Please enter again.

---

## 🔧 機能
✅ **四則演算（+,-,*,/）に対応**  
✅ **不正な入力を防止**（例外処理を使用）  
✅ **ゼロ除算を防止**（`10 / 0` の場合、再入力を促す）  

---

## 💻 使い方
1. プログラムを実行
2. **最初の数値を入力**（例: `10`）
3. **演算子を入力**（例: `+`）
4. **2つ目の数値を入力**（例: `5`）
5. 結果が表示される 🎉

**エラー例**
- 数字以外の入力 → `Invalid input. Please try again.`
- 無効な演算子 → `Invalid operator: ?`
- `0` での割り算 → `Error: Division by zero is not allowed.`

---

