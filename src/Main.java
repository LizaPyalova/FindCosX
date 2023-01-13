//7
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        InputStreamReader isr =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double eps;
        double x=0;
        int k=0;
        double result=1;
        try
        {
            String line = br.readLine();
            String line2 = br.readLine();
            x = Double.parseDouble(line);
            k = Integer.parseInt(line2);
        }
        catch (NumberFormatException e){
            System.out.println("Не целое число");
        }
        catch (IOException e){
            System.out.println("Ошибка при чтении с клавиатуры");
        }
        while(x<0 || x> Math.PI ){
        if(x<0){
          x+=Math.PI;
        }
        if(x>Math.PI){
            x-=Math.PI;
        }
        }
        eps = Math.pow(10, (-1)*k);
        double y = 1;
        for(int n=1; y>=eps || y<=(-1)*eps ; n++){
            y*=((-1)*Math.pow(x,2))/((2*n-1)*2*n);
            result+=y;
        }
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);

      // System.out.println("сумма = " + formatter.format(result));
      // System.out.println(formatter.format(Math.cos(x)));
        System.out.println(result(k, x));
    }

    public static String result(int k, double x){
        double result=1;
        double eps = Math.pow(10, (-1)*k);
        double y = 1;
        for(int n=1; y>=eps || y<=(-1)*eps ; n++){
            y*=((-1)*Math.pow(x,2))/((2*n-1)*2*n);
            result+=y;
        }
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        return formatter.format(result);
    }
}