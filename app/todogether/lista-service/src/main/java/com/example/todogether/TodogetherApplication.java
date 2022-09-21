package com.example.todogether;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import java.time.Duration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
public class TodogetherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodogetherApplication.class, args);
    }

    @Bean
    public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
        return factory -> {
            factory.configureDefault(
                    id ->
                            new Resilience4JConfigBuilder(id)
                                    .timeLimiterConfig(
                                            TimeLimiterConfig.custom()
                                                    .timeoutDuration(Duration.ofSeconds(3))
                                                    .build())
                                    .circuitBreakerConfig(
                                            CircuitBreakerConfig.custom()
                                                    .failureRateThreshold(25)
                                                    .slidingWindowSize(5)
                                                    .slowCallRateThreshold(5)
                                                    .slowCallRateThreshold(2)
                                                    .minimumNumberOfCalls(5)
                                                    .enableAutomaticTransitionFromOpenToHalfOpen()
                                                    .build())
                                    .build());
        };
    }
}
