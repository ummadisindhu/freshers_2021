public class Lamda {
@FunctionalInterface
public interface arith {
public int arithmetic(int a,int b);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
arith add=(a,b) -> a+b;
arith sub=(a,b) -> a-b;
arith mult=(a,b) -> a*b;
arith div=(a,b) -> a/b;

System.out.println("Addition is" + add.arithmetic(3, 5));
System.out.println("Subtraction is" + sub.arithmetic(5, 5));
System.out.println("multiplication is" + mult.arithmetic(5, 5));
System.out.println("division is" + div.arithmetic(5, 5));

}
}
