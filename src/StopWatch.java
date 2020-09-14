public class StopWatch {
//    public long starttime;
//    public long endtime;
//
//    public StopWatch() {
//
//    }
//    public long getStarttime() {
//        return starttime;
//    }
//
//    public void start(long starttime) {
//        this.starttime = starttime;
//    }
//
//    public long getEndtime() {
//        return endtime;
//    }
//
//    public void stop(long endtime) {
//        this.endtime = endtime;
//    }
//    public long getElapsedTime(){
//        return  this.endtime - this.starttime;
//    }
    public long startTime;
    public long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void start(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void stop(long endTime) {
        this.endTime = endTime;
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
