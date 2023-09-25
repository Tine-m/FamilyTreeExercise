import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTreeTest {

    @Test
    public void altid_Sand() {
        assertTrue(1 == 1);
    }

    @Test
    public void find_Familytree_Root() {
        //Arrange
        FamilyTree tree = new FamilyTree();
        //Act
        tree.buildTree();
        //Assert
        assertEquals("Tine", tree.getCurrentName());
    }

    @Test
    public void move_From_Current_Position_To_Mother() {
        //Arrange
        FamilyTree tree = new FamilyTree();
        tree.buildTree();
        //Act
        tree.moveToAncestor("mother");
        //Assert
        assertEquals("Alice", tree.getCurrentName());
    }

    @Test
    public void move_From_Current_Position_To_Father() {
        //Arrange
        FamilyTree tree = new FamilyTree();
        tree.buildTree();
        //Act
        tree.moveToAncestor("father");
        //Assert
        assertEquals("Søren", tree.getCurrentName());
    }

    @Test
    public void move_Up_To_Mormor() {
        //Arrange
        FamilyTree tree = new FamilyTree();
        tree.buildTree();
        //Act
        tree.moveToAncestor("mother");
        tree.moveToAncestor("mother");
        //Assert
        assertEquals("Nanna", tree.getCurrentName());
    }
}