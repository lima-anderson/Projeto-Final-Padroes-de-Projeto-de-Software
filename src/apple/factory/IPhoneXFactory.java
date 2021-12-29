package apple.factory;

import apple.model.IPhone;
import apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}
}
