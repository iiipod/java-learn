public class Changer2 {
    public static void main(String[] arguments) {
        if (arguments.length > 0) {
            System.out.println("The original value: "
                + arguments[0]);
            float num1 = Float.parseFloat(arguments[0]);
            Float num2 = new Float(num1);
            int num3 = num2.intValue();
            //int num3 = Integer.parseInt(num2);
            System.out.println("The final value: " + num3);
        }
    }
}
