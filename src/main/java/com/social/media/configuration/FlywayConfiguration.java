package com.social.media.configuration;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class FlywayConfiguration {


	/**
	 * Override default flyway initializer to do nothing
	 * @return 
	 */
	
	@Bean
	void FlywayMigrationInitializer () {
	}

	@Bean
	FlywayMigrationInitializer flywayInitializer(Flyway flyway) {
		return new FlywayMigrationInitializer(flyway, (f) ->{} );
	}

    static class Dummy {
    }

	/**
	 * Create a second flyway initializer to run after jpa has created the schema
	 */
    @Bean
    @DependsOn("entityManagerFactory")
    Dummy delayedFlywayInitializer(Flyway flyway, FlywayProperties flywayProperties) {
        if (flywayProperties.isEnabled())
            flyway.migrate();
        return new Dummy();
    }
}
