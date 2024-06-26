package org.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JunitTest_b1 {
    //    assertArrayEquals ==> để kiểm tra sự bằng nhau của hai mảng các phần tử có khớp nhau hay ko
    // có thể dùng cho các loại mảng khác nhau int, string, long ,...
    @Test
    public void testIntArrayEquals() {
        int[] expected = {1, 2, 3, 5};
        int[] actual = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testObjectArrayEquals() {
        String[] expected = {"a", "b", "c"};
        String[] actual = {"a", "b", "c"};
        assertArrayEquals(expected, actual);
    }

    // assertEquals ==> để kiểm tra 2 giá trị có bằng nhau hay không.
    // nếu bằng nhau passed
    // so sánh dc với nhiều kiểu dữ liệu

    @Test
    public void testIntEquals() { // kiểu int
        int expected = 50;
        int actual = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void testStringEquals() { // kiểu string
        String expected = "tot em!";
        String actual = "tot anh!";
        assertEquals(expected, actual);
    }

    @Test
    public void testDoubleEquals() {
        // kiểm tra độ lệch nhau giữa 2 giá trị
        // nếu độ lệch của expected && actual nhỏ hơn delta ==> pass
        double expected = 3.19;
        double actual = 3.1;
        double delta = 0.1;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testFalseCondition() {
        // assertFalse kiểm tra tính sai của 1 biểu thức
        // nếu biểu thức trả về false thì ==> passed
        boolean condition = 5 > 10;
        assertFalse(condition);
    }

    @Test
    public void testNotNullString() {
        //assertNotNull  kiểm tra xem một đối tượng có phải là null hay không.
        // Nếu đối tượng là null ==> failed.
        // test với kiểu string
        String str = "Hello, World!";
        assertNotNull(str);
    }

    @Test
    public void testNotNullInt() {
        //assertNotNull  kiểm tra xem một đối tượng có phải là null hay không.
        // Nếu đối tượng là null ==> failed.
        // test với kiểu Integer
        Integer test = null;
        assertNotNull(test);
    }

    @Test
    public void testNotSame() {
//        assertNotSame để kiểm tra xem hai đối tượng có phải là cùng một tham chiếu hay không.
//        Nếu hai đối tượng là cùng một tham chiếu, kiểm thử sẽ thất bại.
        // test 2 đối tượng cùng tham chiếu ==> failed
        String str1 = new String("Hello");
        String str2 = str1;
        assertNotSame(str1, str2);
    }

    @Test
    public void testNotSame2() {
//        assertNotSame để kiểm tra xem hai đối tượng có phải là cùng một tham chiếu hay không.
//        Nếu hai đối tượng là cùng một tham chiếu, kiểm thử sẽ thất bại.
        // test 2 đối tượng ko cùng tham chiếu (2 đối tượng được khởi tạo mới new ) ==> passed
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        assertNotSame(str1, str2);
    }

    public void testNotSame3() {
//        assertNotSame để kiểm tra xem hai đối tượng có phải là cùng một tham chiếu hay không.
//        Nếu hai đối tượng là cùng một tham chiếu, kiểm thử sẽ thất bại.
        // test 2 đối tượng ko cùng tham chiếu (2 đối tượng được khởi tạo mới new ) ==> failed
        String str1 = "Hello";
        String str2 = "Hello";
        assertNotSame(str1, str2);
    }

    @Test
    public void testSame() {
        // ktra 2 đối tượng có cùng tham chiếu hay ko
        String str1 = "Hello";
        String str2 = str1;  // Cùng một tham chiếu
        // nếu viết ntn cũng là cùng 1 tham chiếu
        //        String str1 = "Hello";
        //        String str2 = "Hello";
        assertSame(str1, str2);
    }

    @Test
    public void testSame2() {
        // ktra 2 đối tượng có cùng tham chiếu hay ko
        String str1 = "Hello";
        String str2 = "Hell";  // ko cùng một tham chiếu
        assertSame(str1, str2);
    }

    @Test
    public void testNull() {
        // ktra xem 1 đối tượng có null ko nếu null ==> passed
        String str = null;
        assertNull(str);
    }

    @Test
    public void testAsThat() {
        //assertThat cho phép bạn kiểm tra một điều kiện bất kỳ bằng cách sử dụng các matcher (bộ so sánh)
        // có sẵn trong Hamcrest. Bạn có thể sử dụng các matcher để so sánh giá trị,
        // kiểm tra tính chất của các đối tượng, kiểm tra sự xuất hiện của các phần tử trong các tập hợp,
//        Một số matcher phổ biến bao gồm: is, not, equalTo, containsString, hasSize, greaterThan, lessThan, vv.
        String str = "Hello, World!";
        assertThat(str, is("Hello, World!"));
    }
    @Test
    public void testAsTrue() {
        // ktra tính đúng của bthuc nếu trả về true ==> passed
        boolean condition = 5 > 10;  // Điều kiện này là false
        assertTrue(condition);
    }
    @Test
    public void testFail() {
        // fail()  để đánh dấu một kiểm thử là thất bại.
        // Khi phương thức fail() được gọi, kiểm thử sẽ ngay lập tức kết thúc với kết quả là thất bại.
        boolean condition = 5 > 10;  // Điều kiện này là false
        if (!condition) {
            fail("Condition should be true, but it is false");
        }
    }
}
