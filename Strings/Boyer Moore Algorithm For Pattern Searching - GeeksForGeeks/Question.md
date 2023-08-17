## Boyer Moore Algorithm For Pattern Searching - GeeksForGeeks

Given a text <code>txt[0..n-1]</code> and a pattern <code>pat[0..m-1]</code> where n is the length of the text and m is the length of the pattern, write a function <code>search(char pat[], char txt[])</code> that prints all occurrences of <code>pat[]</code> in <code>txt[]</code>. You may assume that <code>n > m</code>. 

Boyer Moore is a combination of the following two approaches. 
<ol>
<li>Bad Character Heuristic </li>
<li>Good Suffix Heuristic </li>
</ol>

<b><u>Bad Character Heuristic</u>:</b>
The character of the text which doesn’t match with the current character of the pattern is called the Bad Character. Upon mismatch, we shift the pattern until:
<ol><li>The mismatch becomes a match.</li>
<li>Pattern P moves past the mismatched character.</li>
</ol>

<b>Case 1: Mismatch becomes match</b>
We lookup the position of the last occurence of the mismatched character in the pattern, and if the mismatched character exists in the pattern, then we shift the pattern such that it becomes aligned to the mismatched character in the text T.

<b>Case 2: Pattern moves past the mismatch character</b>
We lookup the position of last occurence of mismatching character in pattern and if character does not exist we shift pattern past the mismatching character.