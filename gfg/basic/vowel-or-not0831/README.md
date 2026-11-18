# Vowel or Not

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a character  **ch**  representing an English alphabet, determine whether it is a  **vowel** or not. Return  **true** if  **ch**  is a vowel otherwise return  **false**.

 **Examples:** 

```
Input: ch = 'a'
Output: true
Explanation: 'a' is a vowel. So output for this test case is true.
```

```
Input: ch = 'Z'
Output: false
Explanation: 'Z' is not a vowel. So output for this test case is false.
```

 **Constraints:** 
ch is a lowercase or uppercase English letter.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T17:08:20.070Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // code here
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1)