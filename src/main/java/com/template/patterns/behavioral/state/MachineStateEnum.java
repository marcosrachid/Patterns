package com.template.patterns.behavioral.state;

/**
 * 
 * @author marcosrachid
 *
 */
public enum MachineStateEnum implements State {

	OFF{

		@Override
		public void action() {
			System.out.println("turn on");
		}
		
	},
	ON{

		@Override
		public void action() {
			System.out.println("turn off");
		}
		
	}
}
