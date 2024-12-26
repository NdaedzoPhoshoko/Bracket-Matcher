## Problem description

The function BracketMatcher(str) accepts the parameter str of type string and returns 1 if the brackets are correctly matched and each one is accounted for. Otherwise returns 0. Brackets refers to a pair of opening and closing pharantheses.

## Example
Input: "(hello (world))"
Output: 1

Input: "((hello (world))"
Output: 0

## Problem approach
Read a character from the string and check if it is either '(' or ')'. If it is one of these parantheses, then check if the last parantheses from the stack is different from the one you read, if it is different then you formed a correct match (), remove the match and continue with other characters. If they are th same then push the current parantheses to stack. Repeating this process ensures the correct match of brackets. 

In the end the stack becomes empty if all brackets were corretly matched, else this tells us that some parantheses are not paired.