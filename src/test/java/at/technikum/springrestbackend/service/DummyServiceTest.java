package at.technikum.springrestbackend.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DummyServiceTest {

    @Autowired
    private DummyService dummyService;

    @Test
    @Disabled("disabled cause blocking")
    public void testisPalindrome_withValidPalindrome() {
        boolean result = dummyService.isPalindrome("kivik");
        Assertions.assertTrue(result);

    }
}
