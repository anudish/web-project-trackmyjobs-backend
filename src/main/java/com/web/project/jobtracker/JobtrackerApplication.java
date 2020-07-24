package com.web.project.jobtracker;

import com.web.project.jobtracker.jobapplication.JobApplicationController;
import com.web.project.jobtracker.jobboard.JobBoardController;
import com.web.project.jobtracker.jobcontacts.JobContactsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.context.SecurityContext;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = {"com.web.project.jobtracker.configurations","com.web.project.jobtracker.jobapplication","com.web.project.jobtracker.jobboard",
		"com.web.project.jobtracker.jobcontacts",
		"com.web.project.jobtracker.JobAnalysis",
		"com.web.project.jobtracker.notificationManagement"})
public class JobtrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(JobtrackerApplication.class, args);
	}
}
