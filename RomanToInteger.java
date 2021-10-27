import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s){
//       * Dumb Solution *
//        int number = 0;
//        char lastSymbol = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            switch (s.charAt(i)) {
//                case 'I':
//                    if (lastSymbol == 'V' || lastSymbol == 'X') {
//                        number--;
//                    } else {
//                        number += 1;
//                    }
//
//                    lastSymbol = 'I';
//                    break;
//                case 'V':
//                    number += 5;
//                    lastSymbol = 'V';
//                    break;
//                case 'X':
//                    if (lastSymbol == 'L' || lastSymbol == 'C') {
//                        number -= 10;
//                    } else {
//                        number += 10;
//                    }
//
//                    lastSymbol = 'X';
//                    break;
//                case 'L':
//                    number += 50;
//                    lastSymbol = 'L';
//                    break;
//                case 'C':
//                    if (lastSymbol == 'D' || lastSymbol == 'M') {
//                        number -= 100;
//                    } else {
//                        number += 100;
//                    }
//                    lastSymbol = 'C';
//                    break;
//                case 'D':
//                    number += 500;
//                    lastSymbol = 'D';
//                    break;
//                case 'M':
//                    number += 1000;
//                    lastSymbol = 'M';
//                    break;
//            }
//        }
//        return number;


            int num=0;
            HashMap<Character,Integer> map=new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(i>0 && map.get(c)>map.get(s.charAt(i-1)))
                {
                    num=num+map.get(c)-2*map.get(s.charAt(i-1));
                }
                else
                {
                    num=num+map.get(c);
                }
            }
            return num;
    }
}
