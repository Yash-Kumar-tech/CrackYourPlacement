## Word Wrap - GeeksForGeeks

Given an array <code>nums[]</code> of size <code>n</code>, where <code>nums[i]</code> denotes the number of characters in one word. Let <code>K</code> be the limit on the number of characters that can be put in one line (line width). Put line breaks in the given sequence such that the lines are printed neatly.
Assume that the length of each word is smaller than the line width. When line breaks are inserted there is a possibility that extra spaces are present in each line. The extra spaces include spaces put at the end of every line except the last one. 

You have to minimize the following total cost where total cost = Sum of cost of all lines, where cost of line is = <code>(Number of extra spaces in the line)<sup>2</sup></code>.