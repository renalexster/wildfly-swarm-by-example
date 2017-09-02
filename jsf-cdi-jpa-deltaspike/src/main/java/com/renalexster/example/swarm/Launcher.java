package com.renalexster.example.swarm;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.container.DeploymentException;

public class Launcher {
	public static void main(String[] args) throws IllegalStateException, DeploymentException, Exception {
		new Swarm()
		.start().deploy();
	}
}
