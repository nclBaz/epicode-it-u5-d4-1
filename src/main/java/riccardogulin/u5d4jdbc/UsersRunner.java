package riccardogulin.u5d4jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import riccardogulin.u5d4jdbc.entities.User;

@Component
public class UsersRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		User aldo = User.builder().name("Aldo").surname("Baglio").email("aldo@baglio.it").build();
	}

}
