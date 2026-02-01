# Reverse-Vowels-of-a-String
Given a string s, reverse only all the vowels in the string and return it.  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
# 345. Reverse Vowels of a String

![Difficulty: Easy](https://img.shields.io)
![Topic: Two Pointers](https://img.shields.io)

## 📝 Problem Description
The goal is to take an input string `s` and reverse **only** the vowels within it, while leaving all other characters (consonants, numbers, symbols) in their original positions.

- **Vowels**: `a`, `e`, `i`, `o`, `u` (case-insensitive).
- **Constraints**: 1 <= `s.length` <= 3 * 10⁵.

### Example
**Input**: `s = "leetcode"`  
**Output**: `"leotcede"`  
*Explanation: The vowels are 'e', 'e', 'o', 'e'. Reversing them results in 'e', 'o', 'e', 'e'.*

---

## 💡 Solution Intuition
To solve this efficiently in a single pass, I used the **Two-Pointer Technique**.

### Step-by-Step Logic:
1. **Conversion**: Since strings in Java are immutable, I first convert the string into a character array (`char[]`) so I can perform in-place swaps.
2. **Pointers**: I initialize a `left` pointer at the start (index 0) and a `right` pointer at the end (index `s.length - 1`).
3. **Traversal**:
   - The `left` pointer moves forward until it finds a vowel.
   - The `right` pointer moves backward until it finds a vowel.
4. **Swap**: Once both pointers point to vowels, I swap them and increment/decrement the pointers to continue searching.
5. **Termination**: The process ends when the two pointers meet or cross each other.

---

## ⚙️ Complexity Analysis
- **Time Complexity**: **O(N)**. We visit each character in the string at most once.
- **Space Complexity**: **O(N)**. We use a character array of size $N$ to store and modify the string.

---

## 🚀 How to Run
1. Copy the code into a file named `Solution.java`.
2. Compile: `javac Solution.java`.
3. Run with your own test cases or use the [LeetCode Online Judge](
