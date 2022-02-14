package in.nareshit.raghu.exception;

import java.lang.RuntimeException;
import java.lang.String;

public class AppoinmentNotFoundException extends RuntimeException {
  public AppoinmentNotFoundException() {
  }

  public AppoinmentNotFoundException(String message) {
    super(message);
  }
}
