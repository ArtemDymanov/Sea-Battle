package app.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Test Class for the Cell model and included methods
 */
public class TestCell {

    /**
     * Test GetX()
     */
    @Test
    public void testGetX() {
        int x = 10;
        Cell cell = new Cell(x, 1);
        assertEquals("X value must be the same", x, cell.getX());
    }

    /**
     * Test SetX()
     */
    @Test
    public void testSetX() {
        int x = 10;
        Cell cell = new Cell(x, 1);
        int newX = 9;
        cell.setX(newX);
        assertEquals("X value must be the same", newX, cell.getX());
    }

    /**
     * Test GetY()
     */
    @Test
    public void testGetY() {
        int y = 1;
        Cell cell = new Cell(10, y);
        assertEquals("Y value must be the same", y, cell.getY());
    }

    /**
     * Test SetY()
     */
    @Test
    public void testSetY() {
        int y = 1;
        Cell cell = new Cell(10, y);
        int newY = 9;
        cell.setY(newY);
        assertEquals("Y value must be the same", newY, cell.getY());
    }

    /**
     * Test GetCellState()
     */
    @Test
    public void testGetCellState() {
        CellState state = CellState.NULL;
        Cell cell = new Cell(1, 2, state);
        assertEquals("state must be the same", state, cell.getCellState());
    }

    /**
     * Test SetCellState()
     */
    @Test
    public void testSetCellState() {
        CellState state = CellState.NULL;
        Cell cell = new Cell(1, 2, state);
        CellState newState = CellState.BUSY;
        cell.setCellState(newState);
        assertEquals("state must be the same", newState, cell.getCellState());
    }

    /**
     * Test Equals()
     */
    @Test
    public void testEquals() {
        Cell cell1 = new Cell(1, 2, CellState.BUSY);
        Cell cell2 = new Cell(1, 2, CellState.BUSY);
        assertEquals("state must be the same", cell1, cell2);
    }

    /**
     * Test HashCode()
     */
    @Test
    public void testHashCode() {
        assertNotEquals("HashCode cant be the same", new Cell(1, 2, CellState.NULL).hashCode(),
                new Cell(1, 2, CellState.BUSY).hashCode());
    }
}
