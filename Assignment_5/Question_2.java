public class Question_2 extends Thread {

	public static long maxDiv = 0;
	public static long num = 0;

	public long start;

	public Question_2(long s) {
		this.start = s;
	}

	public void run() {
		for(long i = this.start; i<=this.start+10000; i++) {
			long currDiv=0;
            for(long j=i; j>0; j--)
            {
                if(i%j==0)
                {
                    currDiv+=1;
                }
            }
            if(currDiv > maxDiv)
            {
            	synchronized(this) {
            		maxDiv = currDiv;
	                num = i;
            	}
            }
		}
	}

	public static void main(String[] args) {
		q2 th1 = new Question_2(1);
		q2 th2 = new Question_2(10001);
		q2 th3 = new Question_2(20001);
		q2 th4 = new Question_2(30001);
		q2 th5 = new Question_2(40001);
		q2 th6 = new Question_2(50001);
		q2 th7 = new Question_2(60001);
		q2 th8 = new Question_2(70001);
		q2 th9 = new Question_2(80001);
		q2 th10 = new Question_2(90001);

		long st = System.currentTimeMillis();

		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th3.start();
		try {
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th4.start();
		try {
			th4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th5.start();
		try {
			th5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th6.start();
		try {
			th6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th7.start();
		try {
			th7.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th8.start();
		try {
			th8.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th9.start();
		try {
			th9.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th10.start();
		try {
			th10.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long total_time = System.currentTimeMillis() - st;

		System.out.println("Number =  " + num + " Divisors = " + maxDiv);
        System.out.println("Total time elapsed in milliseconds: " + (total_time));
	}
}