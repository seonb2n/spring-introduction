package org.springframework.samples.petclinic.proxy;

import jdk.tools.jlink.internal.plugins.SystemModulesPlugin;
import jdk.tools.jlink.plugin.Plugin;

public class CreditCard implements Payment{

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		if(amount > 100) {
			System.out.printf(amount + " 신용카드");
		}
		else {
			cash.pay(amount);
		}

	}

}
