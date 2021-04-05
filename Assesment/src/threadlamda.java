
public class threadlamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable R=()->{
					System.out.println("Runnable Child");
				};
				Thread t1=new Thread(R);
				t1.start();
				System.out.println("main thread is running");
				try {
					t1.sleep(20000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		System.out.println("Runnable thread");
			}
	}