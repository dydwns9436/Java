public class ThreadExample1 {
    public static void main(String[] args) {
        //Runable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();

        //runable 구현 객체를 인자로 전달하면서 Thread 크래스를 인스턴스화하여 스레드 생성
        Thread thread1 = new Thread(task1);

        thread1.start();

        //for문 추가
        for(int i = 0; i < 100; i++){
            System.out.print("@");
        }
    }
}

//Runnable 인터페이스를 구현하는 클래스
class ThreadTask1 implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.print("#");
        }
    }
}
