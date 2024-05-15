public class string {
    public static void main(String[] args){
        String name1 = "Anupam";
        String name2 = new String();
        name2 = "anupam";
        System.out.println(name1 + " " + name2); // + operator used to concatenate two strings
        System.out.println(name1.charAt(3)); // charAt() is used to find the character at a particular index
        System.out.println(name1.equals(name2)); // equals() is used to compare two strings
        System.out.println(name1.length()); // length() is used to find the length of the string
        System.out.println(name1.split(" ")); // split() is used to split the string
        System.out.println(name1.replace("p", "P")); // replace() is used to replace a character in the string
        System.out.println(name1.toUpperCase()); // toUpperCase() is used to convert the string to uppercase
        System.out.println(name1.toLowerCase()); // toLowerCase() is used to convert the string to lowercase
        System.out.println(name1.trim()); // trim() is used to remove the spaces from the beginning and end of the string
        System.out.println(name1.concat(" is my name")); // concat() is used to concatenate two strings
        System.out.println(name1.indexOf("p")); // indexOf() is used to find the index of a character
        System.out.println(name1.lastIndexOf("p")); // lastIndexOf() is used to find the index of a character
        System.out.println(name1.startsWith("Anu")); // startsWith() is used to check if a string starts with a particular string
        System.out.println(name1.endsWith("m")); // endsWith() is used to check if a string ends with a particular string
        System.out.println(name1.valueOf(10)); // valueOf() is used to convert an integer to a string
        System.out.println(name1.valueOf(10.5)); // valueOf() is used to convert a double to a string
        System.out.println(name1.valueOf(true)); // valueOf() is used to convert a boolean to a string
        System.out.println(name1.valueOf(name2)); // valueOf() is used to convert a string to a string
        System.out.println(name1.compareTo(name2)); // compareTo() is used to compare two strings
        System.out.println(name1.compareToIgnoreCase(name2)); // compareToIgnoreCase() is used to compare two strings ignoring case
    }
}
