package apple.factory;

import apple.model.IPhone;
import apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}
}
