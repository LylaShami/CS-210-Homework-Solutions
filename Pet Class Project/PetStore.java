import java.util.*;

class PetStore {
    public static void main(String args[]) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        Scanner scanner = new Scanner(System.in);
        String input;
        String name = "";
        Pet aPet = new Pet();

        //specific attributes for each pet
        String coatColor; //cat
        double weight;//dog
        String scaleColor; //fish
        double age;//lizard

        while (true) {
            System.out.print("Enter 'c' for cat or 'd' for dog or 'f' for fish or 'l' for lizard: ");
            input = scanner.next().toLowerCase();
            if (input.charAt(0) == 'c') {
                System.out.println("Enter the name of the cat (or STOP to  quit):");
                name = scanner.next();
                if (name.equalsIgnoreCase("STOP")) break;
                System.out.println("Enter the cat's coat color: ");
                coatColor = scanner.next();
                aPet = new Cat();
                ((Cat) aPet).setCoatColor(coatColor);
            } else if (input.charAt(0) == 'd') {
                System.out.println("Enter the name of the dog (or STOP to  quit):");
                name = scanner.next();
                if (name.equalsIgnoreCase("STOP")) break;
                System.out.println("Enter the dog's weight: ");
                weight = scanner.nextDouble();
                aPet = new Dog();
                ((Dog) aPet).setWeight(weight);
            } else if (input.charAt(0) == 'f') {
                System.out.println("Enter the name of the fish (or STOP to  quit):");
                name = scanner.next();
                if (name.equalsIgnoreCase("STOP")) break;
                System.out.println("Enter the fishs's scale color: ");
                scaleColor = scanner.next();
                aPet = new Fish();
                ((Fish) aPet).setScaleColor(scaleColor);
            } else if (input.charAt(0) == 'l') {
                System.out.println("Enter the name of the lizard (or STOP to  quit):");
                name = scanner.next();
                if (name.equalsIgnoreCase("STOP")) break;
                System.out.println("Enter the lizard's age: ");
                age = scanner.nextDouble();
                aPet = new Lizard();
                ((Lizard) aPet).setAge(age);
            } else {
                System.out.println("Invalid choice.");
                continue;
            }
            aPet.setName(name);
            pets.add(aPet);
        }
        for (Pet pet : pets) {
            System.out.print(pet.getName() + " is a");
            if (pet instanceof Cat) System.out.println(" " + ((Cat) pet).getCoatColor() + " cat.");
            else if (pet instanceof Dog)
                System.out.println(" dog that weights " + ((Dog) pet).getWeight() + " pounds.");
            else if (pet instanceof Lizard)
                System.out.println(" lizard that is " + ((Lizard) pet).getAge() + " years old.");
            else if (pet instanceof Fish)
                System.out.println(" fish that has " + ((Fish) pet).getScaleColor() + " scales.");
            else System.out.println("n unknown animal.");
        }
    }
}