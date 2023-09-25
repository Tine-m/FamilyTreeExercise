public class Main {
    public static void main(String[] args) {
        FamilyTree myFamilyTree = new FamilyTree();
        myFamilyTree.buildTree();
        System.out.println("Mig: " + myFamilyTree.getCurrentName());
        System.out.println("Min mor: " + myFamilyTree.lookUpParentName("mother"));
        String command = "go east";
        String[] words = command.split(" ");

    }
}
