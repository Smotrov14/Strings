import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
   input = input.replaceAll("[+\\s-()]", "");
      char[] charArray =input.toCharArray();

      if(charArray.length < 10 || charArray.length>11){
          System.out.println("Неверный формат номера");
          break;
      }
      if (charArray.length == 11 && charArray[0] == '8' ) {
        charArray[0] = '7';
      }
      if (charArray.length == 11 && charArray[0] != '7' ){
        System.out.println("Неверный формат номера");
        break;
      }
      if (charArray.length == 10 && charArray[0] == '9' ) {
        StringBuilder builder =new StringBuilder();
        for(char i:charArray){
          builder.append(i);
        }
        System.out.println("7"+ builder.toString());
      }
      if(charArray.length == 11 && charArray[1] == '9' ){
        StringBuilder builder =new StringBuilder();
        for(char i:charArray){
          builder.append(i);
        }
        System.out.println(builder.toString());
      }
      }
    }
  }
