package org.example.test;

import org.example.unittest.SortName_b2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _SortNameB2Test {
    private SortName_b2 sorted;
    private String[] nameArray;


    @BeforeEach
    void setUp() {
        // setUup data trước khi test
        sorted = new SortName_b2();
        nameArray = new String[]{"Phạm Văn Xuân","", "Nguyễn Văn An", "Trần Văn Bến","          "};
    }

    @Test
    void testSort() {
        nameArray = sorted.sortedName(nameArray);
        for (String s : nameArray) {
            System.err.println(s);
        }
        String[] expected = new String[]{"Nguyễn Văn An", "Trần Văn Bến", "Phạm Văn Xuân"};
        String[] actualed = nameArray;
        assertArrayEquals(expected,actualed);
    }

}