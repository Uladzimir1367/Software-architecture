### Четвертый принцип SOLID - Принцип сегрегации интерфейса (Interface Segregation Principle, ISP). Он гласит: "Клиенты не должны зависеть от интерфейсов, которые они не используют".

Вам надо написать код который исправяет эту ошибку и реализует этот принцип
Пример кода, который нарушает ISP:

public interface Worker {
void work();
void eat();
}

public class HumanWorker implements Worker {
public void work() {
System.out.println("Человек работает");
}

public void eat() {
    System.out.println("Человек ест");
}
}

public class RobotWorker implements Worker {
public void work() {
System.out.println("Робот работает");
}

public void eat() {
    throw new UnsupportedOperationException("Роботы не едят!");
}
}

public class Main {
public static void main(String[] args) {
Worker worker = new RobotWorker();
worker.work();
worker.eat(); // Здесь возникнет исключение UnsupportedOperationException
}
}
В этом примере класс RobotWorker не использует и не должен использовать метод eat(), поэтому он нарушает принцип сегрегации интерфейса.

