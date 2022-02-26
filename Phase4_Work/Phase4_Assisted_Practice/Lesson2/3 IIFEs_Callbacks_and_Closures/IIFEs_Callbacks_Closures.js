//IIFE and Closure
const empId = (function() {
  let count = 0;
  return function() {
    ++count;
    return `emp${count}`;
  };
})();

console.log("New Emplyee IDs are listed here");
console.log("Alex: "+empId()); 
console.log("Dexter: "+empId()); 
console.log("Annie: "+empId());
 

//Callbacks
console.log("\n"); //to start the output from the neext line
function fullName(firstName, lastName, callback){
  console.log("My name is " + firstName + " " + lastName);
  callback(lastName);
}

var greeting = function(ln){
  console.log('Welcome ' + ln);
};

fullName("Alex", "Wilson", greeting);
console.log("\n");
fullName("Dexter", "Johnson", greeting);
console.log("\n");
fullName("Annie", "Butler", greeting);
