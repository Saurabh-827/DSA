function isFizzBuzz(sequence) {
	for (let i = 0; i < sequence.length; i++) {
		const n = i + 1;

		if (n % 15 === 0) {
			if (sequence[i] !== "FizzBuzz") return false;
		} else if (n % 3 === 0) {
			if (sequence[i] !== "Fizz") return false;
		} else if (n % 5 === 0) {
			if (sequence[i] !== "Buzz") return false;
		} else {
			if (sequence[i] !== n) return false;
		}
	}
	return true;
}
