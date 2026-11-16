// InvalidBirdDataException.java
// Tamieka Reid
// 11/15/26
// Signals invalid data passed to a bird or penguin constructor.

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}
