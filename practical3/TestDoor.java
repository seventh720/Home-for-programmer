import java.util.Scanner;
class Door {
    protected boolean isOpen = false;

    public void openDoor() {
        if (!isOpen) {
            System.out.println("Door opened");
            isOpen = true;
        } else {
            System.out.println("Door already open!");
        }
    }

    public void closeDoor() {
        if (isOpen) {
            System.out.println("Door closed");
            isOpen = false;
        } else {
            System.out.println("Door already closed!");
        }
    }
}

public class TestDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Door door = new Door();
        int choice;

        while (true) {
            System.out.println("Options:");
            System.out.println("1: Open door");
            System.out.println("2: Close door");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = input.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid option! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    door.openDoor();
                    break;
                case 2:
                    door.closeDoor();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
