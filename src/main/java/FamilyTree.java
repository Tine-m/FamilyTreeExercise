public class FamilyTree {

    private Person current;

    public void buildTree() {
        Person alice = new Person("Alice");
        Person søren = new Person("Søren");
        Person tine = new Person("Tine");
        tine.setFather(søren);
        tine.setMother(alice);

        // Tines mormor og morfar
        Person nanna = new Person("Nanna");
        Person anders = new Person("Anders");
        alice.setMother(nanna);
        alice.setFather(anders);

        // Tines farmor og farfar
        Person åse = new Person("Åse");
        Person storeSøren = new Person("Store Søren");
        søren.setFather(storeSøren);
        søren.setMother(åse);

        // Peg på Tine i stamtræet
        current = tine;
    }

    public String getCurrentName() {
        return current.getName();
    }

    public String lookUpParentName(String parent) {
        if (parent.equals("mother")) {
            return current.getMother().getName();
        } else return current.getFather().getName();
    }

    public void moveToAncestor(String ancestor) {
        if (ancestor.equals("mother")) {
            current = current.getMother();
        }
        else {
            current = current.getFather();
        }
    }
}
