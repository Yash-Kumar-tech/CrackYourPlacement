## 381 Insert Delete GetRandom O(1) - Duplicates Allowed

<code>RandomizedCollection</code> is a data structure that contains a collection of numbers, possibly duplicates (i.e., a multiset). It should support inserting and removing specific elements and also reporting a random element.

Implement the <code>RandomizedCollection</code> class:
<ul>
<li><code>RandomizedCollection()</code> Initializes the empty <code>RandomizedCollection</code> object.</li>
<li><code>bool insert(int val)</code> Inserts an item <code>val</code> into the multiset, even if the item is already present. Returns <code>true</code> if the item is not present, <code>false</code> otherwise.</li>
<li><code>bool remove(int val)</code> Removes an item <code>val</code> from the multiset if present. Returns <code>true</code> if the item is present, <code>false</code> otherwise. Note that if <code>val</code> has multiple occurrences in the multiset, we only remove one of them.</li>
<li><code>int getRandom()</code> Returns a random element from the current multiset of elements. The probability of each element being returned is linearly related to the number of the same values the multiset contains.</li>
</ul>
You must implement the functions of the class such that each function works on <b>average</b> <code>O(1)</code> time complexity.

<b>Note:</b> The test cases are generated such that <code>getRandom</code> will only be called if there is <b>at least one</b> item in the <code>RandomizedCollection</code>.