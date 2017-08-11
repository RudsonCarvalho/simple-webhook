package br.com.serviceapp.webhook;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories("br.com.serviceapp.webhook.persistence")
@EnableJpaAuditing
@EnableTransactionManagement
@EnableAsync
@EnableScheduling
public class WebhookConfiguration extends AsyncConfigurerSupport {
	
	public static void main(String[] args) {
				
		SpringApplication.run(WebhookConfiguration.class, args);
	}
	
	@Override
    public Executor getAsyncExecutor() {
		
		System.out.println("WebhookConfiguration - getAsyncExecutor");
		
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        
        executor.setCorePoolSize(7);
        executor.setMaxPoolSize(42);
        executor.setQueueCapacity(11);
        executor.setThreadNamePrefix("MyExecutor-");
        
        executor.initialize();
        
        return executor;
    }
	
}
