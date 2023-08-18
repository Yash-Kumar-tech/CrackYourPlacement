## Given A Matrix Of 'O' and 'X' replace 'O' with 'X' if surrounded by 'X'

Given a matrix where every element is either 'O' or 'X', replace 'O' with 'X' if surrounded by 'X'. A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.

Example:
Input: 
| X | O | X | X | X | X |
|---|---|---|---|---|---|
| X | O | X | X | O | X |
| X | X | X | O | O | X |
| O | X | X | X | X | X |
| X | X | X | O | X | O |
| O | O | X | O | O | O |

Output:
| X | O | X | X | X | X |
|---|---|---|---|---|---|
| X | O | X | X | X | X |
| X | X | X | X | X | X |
| O | X | X | X | X | X |
| X | X | X | O | X | O |
| O | O | X | O | O | O |