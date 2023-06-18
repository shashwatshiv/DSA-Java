public class SearchInStrings {
    public static void main(String[] args){
        System.out.println("hello");
        String[] names ={"shashwat","Kunal","parth","jayesh","nehal"};
        String myName ="Shashwat";
        char letter ='w';
        int index = StringIndexSearch(names , "parth");
        String item = StringSearch(names , "parth");
        System.out.println(StringCharSearch(myName, letter));
        System.out.println(index);
        System.out.println(item);

    }
// StringSearch outputs the array value in String
    public static String StringSearch(String[] names, String name) {
        if(names.length ==0) return "Empty Array";
        for ( String naam: names) {
            if (naam == name){
                return naam;
            }
        }
        return "name not found";
    }
// StringIndexSearch outputs the index of name
    public static int StringIndexSearch(String[]names, String name){
        if(names.length ==0) return -1;
        for (int i = 0; i < names.length ; i++) {
            if ( names[i] == name){
                return i;
            }
        }
        return -1;
    }
    public static boolean StringCharSearch(String myName, char letter){
        if (myName.length() == 0){return false;}
        for (int i = 0; i < myName.length(); i++) {
            if (letter == myName.charAt(i)){
                return true;
            }
        }
        return false;
    }


}
