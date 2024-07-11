public class Task {
        public static void main(String[] args) throws MyNewException {
            testExp();
        }
        public static void testExp() throws MyNewException {
            throw new MyNewException("новое исключение");
        }
    }
class MyNewException extends Exception {
    MyNewException(String message) {
        super(message);
    }
}

