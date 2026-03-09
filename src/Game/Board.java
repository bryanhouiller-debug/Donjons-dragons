public class Game {

    private Character character;
    private Menu menu;

    public Game() {
        menu = new Menu();
    }

    public void start() {

        int choice = menu.displayMainMenu();

        if (choice == 1) {
            createCharacter();
            characterMenu();
        } else {
            System.out.println("Au revoir !");
        }

    }

    private void createCharacter() {

        String type = menu.askCharacterType();
        String name = menu.askCharacterName();

        OffensiveEquipment equipment;

        if (type.equalsIgnoreCase("Warrior")) {
            equipment = new OffensiveEquipment("Weapon", 10, "Sword");
            character = new Character(type, name, 10, 10, equipment);
        } else {
            equipment = new OffensiveEquipment("Spell", 8, "Fireball");
            character = new Character(type, name, 8, 12, equipment);
        }

    }

    private void characterMenu() {

        int choice = menu.displayCharacterMenu();

        while (choice != 3) {

            if (choice == 1) {
                System.out.println(character);
            }

            if (choice == 2) {
                String newName = menu.askNewName();
                character.setName(newName);
            }

            choice = menu.displayCharacterMenu();
        }

        System.out.println("Fin du jeu.");
    }

}
