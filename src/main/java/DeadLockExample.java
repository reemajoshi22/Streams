/**
 * Deadlock occurs when two threads are blocked, with each waiting for the
 * other’s lock
 */
public class DeadLockExample {
    private static class Resource{
        public int value;
    }
    private Resource resourceA=new Resource();
    private Resource resourceB=new Resource();
    public int read(){
        synchronized (resourceA) {
            synchronized (resourceB) {

                return resourceA.value + resourceB.value;
            }
        }
    }

    public void write(int a,int b){
        synchronized (resourceA) {
            synchronized (resourceB) {

                resourceA.value =a;
                        resourceB.value=b;
            }
        }
    }

}
