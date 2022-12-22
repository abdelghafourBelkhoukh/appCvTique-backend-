package ma.cvt.Exceptions;

public class StudentNotFoundException extends RuntimeException {
  public StudentNotFoundException(Long id) {
    super("coldn't find a student with the id: " + id);
  }
}
