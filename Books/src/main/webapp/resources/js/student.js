var math;
var con;
function myAlert()
{
	math=Math.floor(Math.random()*110);
	con =math.valueOf();
	document.getElementById("more").innerHTML=con;
}

function mouseover() {
	
	math=Math.floor(Math.random()*11);
	con =math.valueOf();
	document.getElementById("less").innerHTML=con;
}
