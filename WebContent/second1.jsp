<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="Stylesheet" href="style/second1.css">
<link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Berkshire+Swash" rel="stylesheet">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="my">
<h1>SamasthaLivings</h1>
<img id="imge" src="images/${iname}.jpg">


<div>
<table>
<tr>
<td>
Name of Design
</td>
 <td>
 </td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Bedroom.name}
</td>
</tr>

<tr>
<td>
Designer Name
</td>
<td>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Bedroom.designer_name }
</td>
</tr>

<tr>
<td>
Contact Number
</td>
<td>
</td>
<td>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Bedroom.contact_number}
</td>
</tr>

<tr>
<td>
Email_id
</td>
<td>
</td>
<td>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Bedroom.mail_id}
</td>
</tr>

<tr>
<td>
Experience
</td>
<td>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Bedroom.experience}
</td>
</tr>
<tr>
<td>
Aprox_Cost
</td>
<td>
</td>
<td>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${Bedroom.implement_aprox_cost}
</td>
</tr>

</table>

</div>
</div>
</body>
</html>