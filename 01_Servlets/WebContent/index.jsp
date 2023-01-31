<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet ve JSP</title>
</head>
<body>
Servlet ve JSP

<form action="ServletSinifi" method="post">
	<table>
		<tr>
			<td>Kullanıcı Adı: </td><td><input type="text" name="kullanciAdi"></td>
		</tr>
		<tr>
			<td>Şifre: </td><td><input type="text" name="parola"></td>
		</tr>
		<tr>
			<td></td><td><input type="submit" value="Gönder"></td>
		</tr>
	</table>
</form>

</body>
</html>