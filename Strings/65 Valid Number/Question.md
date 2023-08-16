## 65. Valid Number

A <b>valid number</b> can be split up into these components (in order):
<ol>
<li>A <b>decimal number</b> or an <b>integer</b>.</li>
<li>(Optional) An <code>'e'</code> or <code>'E'</code>, followed by an <b>integer</b>.</li>
</ol>
A <b>decimal number</b> can be split up into these components (in order):
<ol>
<li>(Optional) A sign character (either <code>'+'</code> or <code>'-'</code>).</li>
<li>One of the following formats:</li>
<li>One or more digits, followed by a dot <code>'.'</code>.</li>
<li>One or more digits, followed by a dot <code>'.'</code>, followed by one or more digits.</li>
<li>A dot <code>'.'</code>, followed by one or more digits.</li>
</ol>
An <b>integer</b> can be split up into these components (in order):
<ol>
<li>(Optional) A sign character (either <code>'+'</code> or <code>'-'</code>).</li>
<li>One or more digits.</li>
</ol>
For example, all the following are valid numbers: <code>["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"], while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]</code>.

Given a string <code>s</code>, return <code>true</code> if <code>s</code> is a <b>valid number</b>.