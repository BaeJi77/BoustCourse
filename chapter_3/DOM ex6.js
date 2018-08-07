var bluenode = document.querySelectorAll("section .blue");

Array.from(bluenode).forEach((function(v){
  var section = v.closest("section");
  var h2 = section.querySelector("h2");
  section.removeChild(h2);
}))