public class strings_method {
    public static void main(String[] args) {
         
        String name = "Anurag";
        
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nonTrimmedString = "     Anurag Dhull     ";

        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));
        System.out.println(name.replace('a','b'));
        System.out.println(name.replace("an","dh"));

        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("g"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("n"));
        System.out.println(name.indexOf("n",3));
        System.out.println(name.equals("jaat"));
        System.out.println(name.equalsIgnoreCase("jaat"));


        // for printing double quotes

        System.out.println("ham hai  \" Jaat \" ");
        System.out.println("ham hai  \\ Jaat \\ ");
        System.out.println("ham hai  \n Jaat \n ");
        System.out.println("ham hai  \t Jaat \t ");
    }
}
