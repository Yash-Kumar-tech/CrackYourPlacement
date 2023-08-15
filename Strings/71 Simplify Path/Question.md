## 71. Simplify Path

Given a string <code>path</code>, which is an <b>absolute path</b> (starting with a slash <code>'/'</code>) to a file or directory in a Unix-style file system, convert it to the simplified <b>canonical path</b>.

In a Unix-style file system, a period <code>'.'</code> refers to the current directory, a double period <code>'..'</code> refers to the directory up a level, and any multiple consecutive slashes (i.e. <code>'//'</code>) are treated as a single slash <code>'/'</code>. For this problem, any other format of periods such as <code>'...'</code> are treated as file/directory names.

The <b>canonical path</b> should have the following format:
<ul>
<li>The path starts with a single slash <code>'/'</code>.</li>
<li>Any two directories are separated by a single slash <code>'/'</code>.</li>
<li>The path does not end with a trailing <code>'/'</code>.</li>
<li>The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period <code>'.'</code> or double period <code>'..'</code>)</li></ul>
Return the simplified <b>canonical path</b>.