public class LetterInventoryTest {

    public static void main(String[] args) {
        // Test the LetterInventory class here

        // example 1
        LetterInventory inventory1 = new LetterInventory("hello");
        System.out.println("1) Original word: " + inventory1.getOriginalWord());
        System.out.println("2) Inventory: " + inventory1);
        System.out.println("3) Counts: " + inventory1.size());
        System.out.println("4) Is empty? " + inventory1.isEmpty());

        // example 2
        LetterInventory inventory2 = new LetterInventory("world");
        System.out.println("1) Original word: " + inventory2.getOriginalWord());
        System.out.println("2) Inventory: " + inventory2);
        System.out.println("3) Counts: " + inventory2.size());
        System.out.println("4) Is empty? " + inventory2.isEmpty());
        // Add more tests as needed

        // example 3
        LetterInventory sum = inventory1.add(inventory2);
        System.out.println("\nSum of Inventories 1 and 2:" + inventory1.getOriginalWord() + " + " + inventory2.getOriginalWord() + " = " + sum);

        // example 4
        LetterInventory diff = inventory1.subtract(inventory2);
        if (diff != null) {
            System.out.println("Difference of Inventories 1 and 2:" + inventory1.getOriginalWord() + " - " + inventory2.getOriginalWord() + " = " + diff);
        } else {
            System.out.println("Cannot subtract, negative count found.");
        }
    }
}