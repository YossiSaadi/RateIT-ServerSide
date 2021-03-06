package playground.logic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

//@Service
public class ThreadSafeActivityServiceStub implements ActivityService {
	private Map<String, ActivityEntity> activities;

	@PostConstruct
	public void init() {
		activities = Collections.synchronizedMap(new HashMap<>());
	}
	
	@Override
	public void cleanup() {
		this.activities.clear();
	}

	@Override
	public ActivityEntity createActivity(String userPlayground, String email, ActivityEntity activityEntity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}