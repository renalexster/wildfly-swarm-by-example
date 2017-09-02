package com.renalexster.example.swarm;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.container.DeploymentException;

public class Launcher {
	public static void main(String[] args) throws IllegalStateException, DeploymentException, Exception {
		new Swarm()
//		.fraction(new DatasourcesFraction()
//                .dataSource("MyDS", (ds) -> {
//                    ds.driverName("h2");
//                    ds.connectionUrl("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//                    ds.userName("sa");
//                    ds.password("sa");
//                })
//)
		.start().deploy();
	}
}
