import java.util.Scanner;
class Door {
    protected boolean isOpen = false;

    public void openDoor() {
        if (!isOpen) {
            System.out.println("Door opened");
            isOpen = true;
            return;
        } else {
            System.out.println("Door already open!");
        }
    }

    public void closeDoor() {
        if (isOpen) {
            System.out.println("Door closed");
            isOpen = false;
            return;
        } else {
            System.out.println("Door already closed!");
        }
    }
}


class DoorWithLock extends Door {
    protected boolean isLocked = false;
    @Override
    public void openDoor() {
        if (!isOpen && isLocked) {
            System.out.println("Door is locked and cannot be opened!");
            return;
        }
        super.openDoor();
    }

    public void lockDoor() {
        if (isOpen) {
            System.out.println("Open door cannot be locked!");
            return;
        } else if (isLocked) {
            System.out.println("Door already locked!");
            return;
        } else {
            System.out.println("Door locked");
            isLocked = true;
            return;
        }
    }

    public void unlockDoor() {
        if (!isLocked) {
            System.out.println("Door is not locked!");
            return;
        } else {
            System.out.println("Door unlocked");
            isLocked = false;
            return;
        }
    }
}

class DoorWithCodeLock extends DoorWithLock {
    private int code = 0;

    @Override
    public void lockDoor() {
        if (isOpen) {
            System.out.println("Open door cannot be locked!");
        } else if (!isLocked) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the code to lock the door: ");
            code = input.nextInt();
            System.out.println("Door locked");
            isLocked = true;
        } else {
            System.out.println("Door already locked!");
        }
    }

    @Override
    public void unlockDoor() {
        if (isLocked) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the code to unlock the door: ");
            int userCode = input.nextInt();
            if (userCode == code) {
                System.out.println("Door unlocked");
                isLocked = false;
            } else {
                System.out.println("Invalid code!");
            }
        } else {
            System.out.println("Door is not locked!");
        }
    }
}

public class TestDoor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoorWithCodeLock door = new DoorWithCodeLock(); // Instantiate DoorWithCodeLock
        int choice;

        while (true) {
            System.out.println("Options:");
            System.out.println("1: Open door");
            System.out.println("2: Close door");
            System.out.println("3: Lock door");
            System.out.println("4: Unlock door");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = input.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid option! Please enter a number.");
                input.next(); //Consume invalid input
                continue;
            }

            switch (choice) { //switch...case
                case 1:
                    door.openDoor();
                    break;
                case 2:
                    door.closeDoor();
                    break;
                case 3:
                    door.lockDoor();
                    break;
                case 4:
                    door.unlockDoor();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}