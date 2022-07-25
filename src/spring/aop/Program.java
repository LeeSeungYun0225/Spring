package spring.aop;

import java.lang.reflect.Method;


import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;


// aop의 개념
// 기본 업무 로직 외의 로그처리 / 트랜잭션 처리 등의 업무를 분리하여 
// 필요한 부분에 끼워 사용함으로써 일체형 프로그램이 작동하는 것처럼 구현하는 방법 
public class Program {
	public static void main(String[] args) {
		
		
		Exam exam = new NewlecExam(1,2,3,4);
		
		
		//곁다리업무를 담당할 Exam proxy
		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, 
				new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					// TODO Auto-generated method stub
					//실제 곁다리 업무를 실행할 부분 
					
					long start = System.currentTimeMillis();
					
					Object result = method.invoke(exam, args);
					
					
					
				
					
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					long end = System.currentTimeMillis();
					
					String msg = (end-start) + "ms시간이 걸렸습니다.";
					System.out.println(msg);
					
					
					return result;
				}
		});
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
	}
}
