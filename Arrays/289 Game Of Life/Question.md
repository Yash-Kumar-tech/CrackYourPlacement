## 289. Game Of Life

According to Wikipedia's article: "The <b>Game of Life</b>, also known simply as <b>Life</b>, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an <code>m x n</code> grid of cells, where each cell has an initial state: <b>live</b> (represented by a <code>1</code>) or <b>dead</b> (represented by a <code>0</code>). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
<ol>
<li>Any live cell with fewer than two live neighbors dies as if caused by under-population.</li>
<li>Any live cell with two or three live neighbors lives on to the next generation.</li>
<li>Any live cell with more than three live neighbors dies, as if by over-population.</li>
<li>Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.</li>
</ol>
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the <code>m x n</code> grid <code>board<code>, return the next state.