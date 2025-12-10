function secondLargest(arr) {
	arr.sort((a, b) => b - a);
	for (let i = 0; i < arr.length; i++) {
		if (arr[i] !== arr[i + 1]) return arr[i + 1];
	}
}
