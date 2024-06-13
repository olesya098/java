<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
<body>
	<p> Result: 
		<% 
	String r = request.getParameter("r");
	String x = request.getParameter("x");
	double rr = Double.parseDouble(r);
	double xx = Double.parseDouble(x);
	double result = 0;
        double z = 0;
        double w = 0;
        double a = 0;
        double q = 0;
        if (xx < -1) {
            for (double n = 0; n <= rr; n++) {
                z = 2 * n + 1;
                a = Math.pow(xx, z);
                w = n + 1;
                q = Math.pow(-1, w) / (z * a);
                result = result + q;
            }
            out.println(result);
        }
        else {
            out.println("Ошибка: не корректное число х");
        }
%>
	
</p>
<img src="https://img.razrisyika.ru/kart/2/1200/4812-kotik-8.jpg">
</body>
</html>