var body = document.querySelector("body");

var h1 = document.createElement("h1");
h1.innerText = "ѧϰJS����dom��";
body.appendChild(h1);

var p = docunment.createElement("p");
p.innerText = "ѧJS";
var div = document.createElement("div");
div.appendChild(p);
body.appendChild(div);

var h2 = document.createElement("h2");
h2.innerText = "����";
var img = docunment.createElement("img");
img.src = "image.png";

var div2 = document.createElement("div");
div2.appendChild(h2);
div2.appendChild(img);
body.appendChild(div2);