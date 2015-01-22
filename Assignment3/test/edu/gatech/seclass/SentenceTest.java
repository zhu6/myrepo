package edu.gatech.seclass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SentenceTest {

    private Sentence sentence;

    @Before
    public void setUp() throws Exception {
        sentence = new Sentence();
    }

    @After
    public void tearDown() throws Exception {
        sentence = null;
    }

    @Test
    public void testGetWord1() throws IllegalArgumentException,
            PositionOutOfBoundsException {
        sentence.setSentence("This is a short sentence");
        String word = sentence.getWord(2);
        assertEquals("is", word);
    }

    @Test
    public void testGetWord2() throws IllegalArgumentException,
            PositionOutOfBoundsException {
        fail("Not yet implemented");
    }

    @Test
    public void testGetWords1() throws IllegalArgumentException,
            PositionOutOfBoundsException {
        fail("Not yet implemented");
    }

    @Test(expected = PositionOutOfBoundsException.class)
    public void testGetWords2() throws IllegalArgumentException,
            PositionOutOfBoundsException {
        sentence.setSentence("Another short sentence");
        sentence.getWords(3, 4);
    }

    @Test
    public void testGetLength1() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetLength2() {
        fail("Not yet implemented");
    }

    @Test
    public void testIndexOf1() {
        sentence.setSentence("This is a short sentence");
        assertEquals(5, sentence.indexOf("sentence"));
    }

    @Test
    public void testIndexOf2() {
        fail("Not yet implemented");
    }

    @Test
    public void testReverse1() {
        sentence.setSentence("This is a short sentence");
        sentence.reverse();
        assertEquals("sentence short a is This", sentence.getSentence());
    }

    @Test
    public void testReverse2() {
        fail("Not yet implemented");
    }
}
