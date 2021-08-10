

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Objects;

import org.junit.Test;

public class PassByValueTest {

    private void changeObject(DataObject dObj) {
        dObj.setName("Mary");
        dObj.setNumber(dObj.getNumber() + 1);
    }

    private void displayObjectIdentity(DataObject dObj) {
        System.out.println("\tidentityHashCode=" + System.identityHashCode(dObj) + ". Content="
                + dObj.toString());
    }

    private void reAssignObject(DataObject dObj) {
        System.out.println("Start reAssignObject:");
        displayObjectIdentity(dObj);
        // create a new DataObject object and create a temp with the object's reference value
        DataObject temp = new DataObject();
        dObj = temp;
        System.out.println("Completed reAssignObject:");
        displayObjectIdentity(dObj);
        assertTrue(Objects.equals(dObj, temp));
    }

    @Test
    public void pass_by_value_with_object() {
        DataObject dObj = new DataObject();
        dObj.setNumber(2);
        dObj.setCharValue('B');
        dObj.setName("Zheng");
        System.out.println("Before reAssignObject:");
        displayObjectIdentity(dObj);
        reAssignObject(dObj);
        System.out.println("After reAssignObject:");
        displayObjectIdentity(dObj);

        assertEquals("Zheng", dObj.getName());
        assertEquals(2, dObj.getNumber());
        assertEquals('B', dObj.getCharValue());

    }

    @Test
    public void pass_by_value_with_object_2() {
        DataObject dObj = new DataObject();
        dObj.setNumber(2);
        dObj.setCharValue('B');
        dObj.setName("Zheng");

        System.out.println("Before changeObject:");
        displayObjectIdentity(dObj);
        changeObject(dObj);
        System.out.println("After changeObject:");
        displayObjectIdentity(dObj);

        assertEquals("Mary", dObj.getName());
        assertEquals(3, dObj.getNumber());
        assertEquals('B', dObj.getCharValue());
    }

    @Test
    public void pass_by_value_with_primitive_type() {
        String mary = "Mary";
        int oneNum = 1;
        char charA = 'A';

        DataObject dObj = new DataObject();

        dObj.setNumber(oneNum);
        dObj.setCharValue(charA);
        dObj.setName(mary);

        assertEquals("Mary", mary);
        assertEquals(1, oneNum);
        assertEquals('A', charA);
    }

}