<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Winkelwagen</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="grid-container">
	<div class="header">
		<h1>Winkelwagen</h1>
	</div>
	
	<div class="content">
		${producten}
		<h2>Totaal:</h2>
		<p>${producten.getTotaalPrijs()}
	</div>
	
	<div class="picture">
		<img src="webshop.png">
	</div>
		
	<div class="menu">
		<a href="index.html"> Index </a>
		<a href="winkelwagen"> Winkelwagen </a>
	</div>
		
	<div class="footer"> 
		<p>Dit is de voettekst van de mooiste webwinkel EVER!!
	</div>
		
</div>
</body>
</html>