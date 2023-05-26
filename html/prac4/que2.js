var a = [];
console.log('Enter Array Elements');
const prompt = require("prompt-sync")();

var i = 0;
for (let index = 0; index < 5; index++) {
  let num = prompt(`Enter element ${index+1} : `);
  if(a.indexOf(num) !== -1){
    console.log("Number already exists");
  }else{
    a[i] = num;
    i++;
    console.log("Number added");
  }
  
}

console.log(a);
