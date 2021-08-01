var body = document.querySelector("body");

var h1 = document.createElement("h1");
h1.innerText = "学习JS操作dom树";
body.appendChild(h1);

var p = docunment.createElement("p");
p.innerText = "学JS";
var div = document.createElement("div");
div.appendChild(p);
body.appendChild(div);

var h2 = document.createElement("h2");
h2.innerText = "拉倒";
var img = docunment.createElement("img");
img.src = "image.png";

var div2 = document.createElement("div");
div2.appendChild(h2);
div2.appendChild(img);
body.appendChild(div2);