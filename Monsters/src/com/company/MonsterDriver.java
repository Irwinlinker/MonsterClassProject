//Robert Marsh
//Sept 9, 2020
//Program creates an object with some attributes and has a method to do something unique


package com.company;


public class MonsterDriver {

    public static void main(String[] args) {
        Monster monster1 = new Monster("Bob", "Werewolf", 54, "OOWWWOOOOOO");//build first monster
        monster1.cry();//call to method for monster1 cry
        System.out.println(monster1);//call to override
        System.out.println();//blank line

        Monster monster2 = new Monster("Gene", "Zombie", 13, "UUNNNNHHHHHH");//build second monster
        monster2.cry();//call to method for monster2 cry
        System.out.println(monster2);//call to override
        System.out.printf("Wait, I think %s is hungry again! Oh, never mind, he's just a weird %s.",
                monster2.getName(), monster2.getType());//using get methods to fill in sentence
        System.out.println("\n");

        Monster monster3 = new Monster("Linda", "Vampire", 99, "HHIIIISSSSCCHHHHHHH");//build third monster
        monster3.cry();//call to method for monster3 cry
        System.out.println(monster3);//call to override
        System.out.println();//blank line
        System.out.printf("I hear %s, she must've found another victim!! " +
                "She's not happy with %d bites!", monster3.getName(),
                monster3.getBitten());//using get methods to fill in sentence
        monster3.setBitten(100);//set bites to 100
        monster2.setType("Vampire");//set type to vampire
        System.out.printf("%nShe bit %s and now he's a %s. She's bitten %d victims now!!!", monster2.getName(),
                monster2.getType(), monster3.getBitten());//using get methods to fill in sentence
        monster2.setName("Teddy");//set new name
        System.out.println();//new line
        System.out.printf("Since he changed to a %s, he changed his name to %s.",
                monster2.getType(), monster2.getName());//using get methods to fill in sentence
    }
}
