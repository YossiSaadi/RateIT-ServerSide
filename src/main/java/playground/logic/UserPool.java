package playground.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import playground.logic.UserTO;

@Component
public class UserPool implements Constants {

	private List<UserTO> users = new ArrayList<>();

	public List<UserTO> getAllUsers() {
		return users;
	}

	public UserTO createUser(NewUserForm form) {
		UserTO user = new UserTO(form);
		users.add(user);
		return user;
	}

	public UserTO getUser(String playground, String email) {
		return users.stream().filter(user -> user.getEmail().equals(email) && user.getPlayground().equals(playground))
				.findFirst().get();
	}
	
	public UserTO confirmUser(String playground, String email) {
		UserTO confirmedUser = getUser(playground, email);
		confirmedUser.setRole(REVIEWER);
		return confirmedUser;
	}

	public void editUser(String playground, String email, UserTO newUser) {
		getUser(playground, email).setParams(newUser);
	}
}