## 1499. Max Value Of Equation

You are given an array <code>points</code> containing the coordinates of points on a 2D plane, sorted by the x-values, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> such that <code>x<sub>i</sub> < x<sub>j</sub></code> for all <code>1 <= i < j <= points.length</code>. You are also given an integer <code>k</code>.

Return the maximum value of the equation <code>y<sub>i</sub> + y<sub>j</sub> + |x<sub>i</sub> - x<sub>j</sub>|</code> where <code>|x<sub>i</sub> - x<sub>j</sub>| <= k</code> and <code>1 <= i < j <= points.length</code>.

It is guaranteed that there exists at least one pair of points that satisfy the constraint <code>|x<sub>i</sub> - x<sub>j</sub>| <= k</code>.