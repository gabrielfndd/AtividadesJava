import java.lang.management.ThreadInfo;
import java.util.*;

public class CaixaBranca {

 Integer idade;

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Digite sua idade: ");
  Integer idade = sc.nextInt();

  System.out.println(" sexo: M/F");
  int sex = sc.next().charAt(0);

  if (sex == 'F') {
   System.out.println("Você é do sexo feminido");
  }
  if (sex == 'M') {
   System.out.println("Você é do sexo masculino");
  }

  if (idade > 17) {
   System.out.println("você é maior de idade!!!!!! ");
  } else {
   System.out.println("você não é maior de idade ");
  }

 }
}
