function longestWord(sentence) {
	// let removeDot = sentence.replace(/\./g,"").replace(/!/g,"").replace(/,/g,"").replace(/\?/g,"").replace(/'/g,"");
	let removeDot = sentence.replace(/[.,!?']/g, "");
	console.log(removeDot);
	let wordArray = removeDot.split(" ");
	let longWord = "";

	for (let i = 0; i < wordArray.length; i++) {
		if (wordArray[i].length > longWord.length) {
			console.log(wordArray[i]);
			longWord = wordArray[i];
		}
	}
	return longWord;
}
