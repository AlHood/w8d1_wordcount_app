package wc.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/02/2017.
 */

public class WordTest {

ArrayList<String> arrayListResult;

    @Before
    public void before() {

    }



    @Test
    public void canSplit() {
    StringSplitter striSpli = new StringSplitter("This is your input of seven words");
      arrayListResult = striSpli.splitString();

        assertEquals(7, arrayListResult.size());
    }

//@Test public void canCount(){
//
//}










}
