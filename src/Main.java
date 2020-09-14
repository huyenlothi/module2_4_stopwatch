public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long start = System.currentTimeMillis();
        stopWatch.start(start);
        for (int i = 0; i < 5000; i++){
            System.out.println(i);
        }
        long stop = System.currentTimeMillis();
        stopWatch.stop(stop);
        System.out.println("thoi gian " + stopWatch.getElapsedTime());
    }
}
