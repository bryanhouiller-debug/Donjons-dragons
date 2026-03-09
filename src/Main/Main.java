public class Main {

    public static void Main(String [] args ){
        Game game = new Game();

        Player warrior = new Player("Guerrier");
        Player mage = new Player("Mage");

        game.addPlayer(warrior);
        game.addPlayer(mage);

        Monster goblin = new Monster("Gobelin");
        Monster orc = new Monster("Orc");

        game.addMonster(goblin);
        game.addMonster(orc);

        game.start();
    }

    public static void main(String[] args) {

        Menu menu = new Menu();

        int choice = menu.showMainMenu();

        if (choice == 1) {

            Game game = new Game();
            game.start();

        } else {

            System.out.println("Au revoir !");

        }

    }
}
