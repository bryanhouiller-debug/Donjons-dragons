public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int showMainMenu() {

        System.out.println("=== DONJONS & DRAGONS ===");
        System.out.println("1. Nouvelle partie");
        System.out.println("2. Quitter");
        System.out.print("Choix : ");

        int choice = scanner.nextInt();

        return choice;
    }
}
