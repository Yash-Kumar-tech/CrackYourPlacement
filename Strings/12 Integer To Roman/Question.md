## 12. Integer To Roman

Roman numerals are represented by seven different symbols: <code>I</code>, <code>V</code>, <code>X</code>, <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.
| Symbol | Value |
|---|---|
| I | 1 | 
| V | 5 | 
| X | 10 | 
| L | 50 | 
| C | 100 | 
| D | 500 | 
| M | 1000 | 
</code>
For example, <code>2</code> is written as <code>II</code> in Roman numeral, just two one's added together. <code>12</code> is written as <code>XII</code>, which is simply <code>X + II</code>. The number <code>27</code> is written as <code>XXVII</code>, which is <code>XX + V + II</code>.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code>IIII</code>. Instead, the number four is written as <code>IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code>IX</code>. There are six instances where subtraction is used:

<code>I</code> can be placed before <code>V (5)</code> and <code>X (10)</code> to make <code>4</code> and <code>9</code>. 
<code>X</code> can be placed before <code>L (50)</code> and <code>C (100)</code> to make <code>40</code> and <code>90</code>. 
<code>C</code> can be placed before <code>D (500)</code> and <code>M (1000)</code> to make <code>400</code> and <code>900</code>.
Given an integer, convert it to a roman numeral.