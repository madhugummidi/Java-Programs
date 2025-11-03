public class ArrayContainsExample {
    public static void main(String[] args) {
        String[] names = {"Chennai Super Kings",
    "Sun Risers Hyderabad",
    "Delhi Capitals",
    "Kings XI Punjab",
    "Kolkata Knight Riders",
    "Mumbai Indians",
    "Rajasthan Royals",
    "Royal Challengers Bangalore"};

        String searchName = "Ram";
        String searchName1 = "Madh";
        boolean containsName = false;
        boolean containsName1 = false;

        for (String name : names) {
            if (name.equals(searchName)) {
                containsName = true;
                break;
            }
        }
        for (String name : names) {
            if (name.equals(searchName1)) {
                containsName1 = true;
                break;
            }
        }

        if (containsName&&containsName1) {
            System.out.println("The array contains the name.");
        } 
    }
}

