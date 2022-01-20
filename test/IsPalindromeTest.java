import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPalindromeTest {
    @DisplayName("IsPalindrome test")
    @ParameterizedTest(name = "#{index}.      \"{0}\"   ==>   {1}")
    @CsvSource({
            "321123, true",
            "'', true",
            "' ', true",
            "11, true",
            "321d1d23, false",
            "notapalindrome, false",
    })
    public void test(String string, boolean expected){
        boolean actual = Main.isPalindrome(string);
        assertEquals(expected, actual);
    }
}