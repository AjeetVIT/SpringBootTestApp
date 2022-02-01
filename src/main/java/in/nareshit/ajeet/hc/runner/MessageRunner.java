package in.nareshit.ajeet.hc.runner;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {
	private static Logger log=LoggerFactory.getLogger(MessageRunner.class);
	@Override
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		int a=10;
		try {
		log.info("STARTED");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Welcome To SringBoot App!!!"+a);
	//System.out.println("Hello Mr. How DO u Do");
	log.info("ENDED");

	}

}
