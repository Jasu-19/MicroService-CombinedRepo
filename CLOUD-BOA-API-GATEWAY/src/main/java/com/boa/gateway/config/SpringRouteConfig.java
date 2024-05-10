package com.boa.gateway.config;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class SpringRouteConfig {
	
	@Bean
    public RouterFunction<ServerResponse> CourseServiceRoute() {
        return GatewayRouterFunctions.route("Course-CRS-Producer").route(RequestPredicates.path("/crs-services/api/*"), HandlerFunctions.http("http://localhost:8084")).build();
        		
    }
	
	@Bean
    public RouterFunction<ServerResponse> PaymentServiceRoute() {
        return GatewayRouterFunctions.route("Payment-CRS-Producer").route(RequestPredicates.path("/payment-services/api/*"), HandlerFunctions.http("http://localhost:8083")).build();
        		
    }
	
	@Bean
    public RouterFunction<ServerResponse> ReportServiceRoute() {
        return GatewayRouterFunctions.route("Report-CRS-Producer").route(RequestPredicates.path("/report-services/api/*"), HandlerFunctions.http("http://localhost:8086")).build();
        		
    }

}
