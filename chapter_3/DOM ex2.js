var parent = document.querySelector("ul");

var position = document.querySelector("li:nth-child(3)");

console.log(mid);

var newNode = document.createElement("p");
newNode.innerText = '수박';

console.log(newNode);

var newParent = parent.insertBefore(newNode,mid);