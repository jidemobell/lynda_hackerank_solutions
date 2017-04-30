package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class ClothingItem {
    /*
     this string variable doesnt
     have the word static because
     it's an instance variable or field

     instance variable is not a member
     of the class but an instance of the
     class
     */
    public String type;

    public static void main(String[] args) {
        /*
         here we instantiate the class
         datatype = clothingitem
         identifier = variable 'item'
         keyword = new
         constructor method = Clothing item()
         */
        ClothingItem item = new ClothingItem();
        /*
        here we assign a value to the
        field
         */
        item.type = "Hat";
        item.displayItem();
    }

    /*
    notice this instance method
    does not have static
    it's a member of an instance of
    the class not the class itself
    its's an instance method
     */
    private void displayItem(){
        System.out.println("This is a "+ this.type);
    }
    /*
    this.type means the type variable
    that is a member of the current
    instance of the class
     */
}
