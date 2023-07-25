package Recursion;

public class PrintReverseString {
    public static void main(String[] args) {
//        String s = "scalaracademy";
        String s = "cool";
        reversePrint(s);
    }
    public static void reversePrint(String s) {
        if (s.length() <= 1) System.out.print(s);
        else {
            System.out.print(s.charAt(s.length() - 1));
            reversePrint(s.substring(0, s.length() - 1));
        }
    }
}

// String s = "cool";
// reversePrint("cool");
// System.out.print("cool".charAt(4-1));
// reversePrint("cool".substring(0, 4-1)));
// "l";
// reversePrint("coo");
// System.out.print("coo".charAt(3-1));
// reversePrint("coo".substring(0, 3-1)));
// "lo";
// reversePrint("co");
// System.out.print("co".charAt(2-1));
// reversePrint("co".substring(0, 2-1)));
// "loo";
// reversePrint("c");
// System.out.print(s);
// System.out.print("c");
// "looc";