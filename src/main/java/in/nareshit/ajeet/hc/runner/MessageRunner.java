package in.nareshit.ajeet.hc.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("Welcome To SringBoot App!!!"+a);
	//System.out.println("Hello Mr. How DO u Do");

	}

}
