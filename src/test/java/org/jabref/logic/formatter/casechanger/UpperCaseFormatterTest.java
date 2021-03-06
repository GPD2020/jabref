package org.jabref.logic.formatter.casechanger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests in addition to the general tests from {@link org.jabref.logic.formatter.FormatterTest}
 */
public class UpperCaseFormatterTest {

    private UpperCaseFormatter formatter;

    @Before
    public void setUp() {
        formatter = new UpperCaseFormatter();
    }

    @Test
    public void test() {
        Assert.assertEquals("LOWER", formatter.format("LOWER"));
        Assert.assertEquals("UPPER", formatter.format("upper"));
        Assert.assertEquals("UPPER", formatter.format("UPPER"));
        Assert.assertEquals("UPPER {lower}", formatter.format("upper {lower}"));
        Assert.assertEquals("UPPER {l}OWER", formatter.format("upper {l}ower"));
    }

    @Test
    public void formatExample() {
        Assert.assertEquals("KDE {Amarok}", formatter.format(formatter.getExampleInput()));
    }
}
