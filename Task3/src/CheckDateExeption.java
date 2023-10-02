public class CheckDateExeption extends RuntimeException {
    
    public CheckDateExeption() {

        super("Ввод даты не прошел проверку на валидность");
    }
}
