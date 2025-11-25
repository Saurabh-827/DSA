function isPerfectSquare(n) {
	let k = n ** 0.5;
	if (k % 1 == 0) {
		return true;
	} else {
		return false;
	}
}
