package playground.logic;

import java.util.List;

import playground.layout.ElementTO;

public interface ElementService {
	public void addElement(ElementEntity element);

	public void createElement(ElementTO elementTO, String userPlayground, String email) throws Exception;

	public ElementEntity getElement(String userPlayground, String email, String playground, String id) throws ElementNotFoundException;

	public List<ElementEntity> getAllElements(String userPlayground, String email);

	public List<ElementEntity> getAllElementsByDistance(String userPlayground, String email, double x, double y,
			double distance);

	public List<ElementEntity> getAllElementsByAttributeAndItsValue(String userPlayground, String email,
			String attributeName, Object value);

	public void updateElement(String userPlayground, String email, String playground, String id,
			ElementEntity newElement) throws ElementNotFoundException, Exception;

	public void cleanup();

}
