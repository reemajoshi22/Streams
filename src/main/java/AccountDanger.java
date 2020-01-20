/**
 * “race condition,” where multiple threads can
 * access the same resource (typically an object’s instance variables) and can
 * produce corrupted data if one thread “races in” too quickly before an
 * operation that should be “atomic” has completed.
 */

/**
 * synchronized : only one
 * thread at a time can be executing that code
 */
public class AccountDanger implements Runnable {
    Account account=new Account();

    public static void main(String[] args) {
        AccountDanger accountDanger=new AccountDanger();
        Thread one=new Thread(accountDanger);
        one.setName("Lucy");
        Thread two=new Thread(accountDanger);
        two.setName("Fred");
        one.start();
        two.start();

    }
    @Override
    public void run() {

        for(int x=0;x<5;x++){
            makeWithdrawal(10);
            if(account.getBalance()<10){
                System.out.println("Account is overdrawn ");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {

        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" : is going to make withdraw");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" : completes the withdrawal");
        }

        else{
            System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw"+account.getBalance());
        }
    }
}
// doubt : A thread can acquire more than one lock. For example, a thread can
//enter a synchronized method, thus acquiring a lock, and then
//immediately invoke a synchronized method on a different object
// Threads that synchronize on the same object will
//block each other. Threads that synchronize on different objects will
//not.

// static methods can be synchronized.