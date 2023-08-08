public class StringConcat {
    public static void main(String[] args){
        StringBuilder firstString = new StringBuilder(new String(new char[]{'S', 'a', 'r', 't', 'h', 'a', 'k'}));
        String fString = firstString.toString();
        String secondString = "Giri";
        firstString.append(" ").append(secondString);
        System.out.println("Using String Builder: " + firstString);
        System.out.println("Using concat(): " + fString.concat(" " + secondString));
        System.out.println("Using \"+\" operator: " + fString + " " + secondString);
    }
}
