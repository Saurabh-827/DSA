** start of script.js **

function countCharacters(sentence) {
 let lowerCase = sentence.toLowerCase();
 let letters = "abcdefghijklmnopqrstuvwxyz"
 let allCount = [];
 for(let i = 0; i < letters.length; i++){
   let count = 0;
   
   for(let j = 0;  j < lowerCase.length; j++){
   if(letters[i] === lowerCase[j]){
     count ++; 
   }
   
   }
   if(count > 0){
     allCount.push(letters[i] +" "+ count);
   }

 }


  return allCount;
}



** end of script.js **

