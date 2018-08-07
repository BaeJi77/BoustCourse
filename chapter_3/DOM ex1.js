var parent = document.querySelector('ul');

console.log(parent);

parent.innerHTML += ('<li>수박</li>');

var last = document.querySelector("li:nth-child(6)");
parent.removeChild(last);
