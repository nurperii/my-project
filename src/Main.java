// 2.1. Создание класса, который реализует интерфейс Runnable
class PrintNumbers implements Runnable {
    // 2.2. Переопределение метода run
    @Override
    public void run() {
        // 2.2. Цикл, который распечатывает значения от 0 до 100, делящиеся на 10
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 2.3. Создание трех потоков
        PrintNumbers task = new PrintNumbers();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        // Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();

        // Использование Thread.sleep() для паузы в каждом потоке
        thread1.sleep(500); // Пауза на 500 миллисекунд
        thread2.sleep(500);
        thread3.sleep(500);
    }
}
