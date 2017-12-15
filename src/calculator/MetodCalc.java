package calculator;
/*Класс MetodCalc. В нем мы реализовываем метод, который будет выполнять действия над числами в зависимости от знака операции.*/
public class MetodCalc 
{
 public double calc ( double n1, String op, double n2) 
 {
	 //переменная для хранения результата 
	 double res = 0;
	 //оператор выбора 
 switch (op) 
 {
 case "+":
 res = n1+n2;
 break;
 case "-":
 res = n1-n2;
 break;
 case "*":
 res = n1*n2;
 break;
 case "/":
 res = n1/n2;
 break;
 default:
 res = 0;
 break;
 }
 //возврашаем результат
 return res;
 }
}