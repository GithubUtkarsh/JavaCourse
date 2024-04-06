package com.company;

public class String_PS {
    public static void main(String[] args) {
//        problem 1
    //    String Name = "Harry Potter";
    //    Name = Name.toLowerCase();
    //    System.out.println(Name);

//        Problem 2
//          String text = "To My    Friend";
//          text = text.replace(" ", "_");
//          System.out.println(text);

//        Problem 3
            String letter = "Dear <|name|> , Thanks a lot!";
            letter = letter.replace("<|name|>","Utkarsh");
            System.out.println(letter);

//            Problem 4
            String mystring = "This string contains double  and triple  spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

//        Problem 5
        String Letter = "Dear Utkarsh,\n\tThis Java Course is Nice.\n\tThanks!";
        System.out.println(Letter);





    }

}
