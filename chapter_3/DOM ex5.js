var parent = document.querySelector("ul");
var reds = document.querySelectorAll("li.red");

for(var i = 0 ; i < reds.length ; i++){
  parent.removeChild(reds[i]);
}