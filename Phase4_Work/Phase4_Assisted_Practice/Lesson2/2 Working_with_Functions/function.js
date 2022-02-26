<!DOCTYPE html>
<html>
<body>
<h1>Javascript Function<h1>

<script>

	var x = (2 * 3) + 5;
	var y = 3 * 4;
	
	var result = myFunction(2,3);
	console.log(result);
	
	function myFunction(num1, num2) {
		var a = num1 * num2;
		var b = num1 + num2;
		return(a + b);
	}
	
	console.log( myFunction(3, 4));
	
	function toCelcius(f){
			return (5/9) * (f-32);
	}
	
	console.log("The temperature is "+ toCelcius(60));
	
</script>

</body>

</html>
