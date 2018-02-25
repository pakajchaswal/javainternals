package cp.javainternals.bytecode;

public class VMInheritance {

    private static class Mammal {
        public void speak() { System.out.println("Can be HULK, Can be Banner."); }
    }

    private static class Human extends Mammal {

        @Override
        public void speak() { System.out.println("I am definately Banner"); }

        // Valid overload of speak
        public void speak(String language) {
            System.out.println("You chose : "+language+" Hurrrah");
        }

    }

    public static void main(String[] args) {
        Mammal anyMammal = new Mammal();
        anyMammal.speak();  // Output - Can be HULK, Can be Banner.
        // 10: invokevirtual #4 // Method cp/javainternals/bytecode/VMInheritance$Mammal.speak:()V

        Mammal humanMammal = new Human();
        humanMammal.speak(); // Output - I am definately Banner
        // 23: invokevirtual #4 // Method cp/javainternals/bytecode/VMInheritance$Mammal.speak:()V

        Human human = new Human();
        human.speak(); // Output - I am definately Banner
        // 36: invokevirtual #7 // Method cp/javainternals/bytecode/VMInheritance$Human.speak:()V

        human.speak("Hindi"); // Output - You chose Hindi Hurrrah
        // 42: invokevirtual #9 // Method cp/javainternals/bytecode/VMInheritance$Human.speak:(Ljava/lang/String;)V
    }
}