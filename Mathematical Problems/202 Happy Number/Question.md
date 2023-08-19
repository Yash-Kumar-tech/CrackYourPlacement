## 202. Happy Number

Write an algorithm to determine if a number <code>n</code> is happy.

A <b>happy number</b> is a number defined by the following process:
<ul>
<li>Starting with any positive integer, replace the number by the sum of the squares of its digits.</li>
<li>Repeat the process until the number equals 1 (where it will stay), or it <b>loops endlessly in a cycle</b> which does not include 1.</li>
<li>Those numbers for which this process <b>ends in 1</b> are happy.</li>
</ul>
Return <code>true</code> if <code>n</code> is a happy number, and <code>false</code> if not.