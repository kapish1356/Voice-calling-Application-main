package com.raj.Voiceproject;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;

@SpringBootApplication
public class VoiceApplication implements ApplicationRunner {
	private final static String SID_ACCOUNT = "AC049a8bd3202e5d0adf5892b48d7bb2ed";
	private final static String AUTH_ID = "1cbb78bcae285075b10972378266ed9b";
	private final static String FROM_NUMBER="+12317427407";
	private final static String TO_NUMBER ="+91 9118693042";
	static {
		Twilio.init(SID_ACCOUNT,AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(VoiceApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				new URI("http://demo.twilio.com/docs/voice.xml")).create();
	}
}


