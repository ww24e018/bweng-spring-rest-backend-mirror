package at.technikum.springrestbackend.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public boolean isPalindrome(String input) {
        String inputreversed = new StringBuilder(input).reverse().toString();
        return inputreversed.equals(input);
    }
}
