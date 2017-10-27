package com.template.patterns.behavioral.state;

/**
 * 
 * @author marcosrachid
 *
 */
public class MachineContext implements State {

	private static MachineStateEnum state = MachineStateEnum.OFF;

	@Override
	public void action() {
		state.action();
		switch (state) {
		case OFF:
			state = MachineStateEnum.ON;
			break;
		case ON:
			state = MachineStateEnum.OFF;
		}
	}

}
