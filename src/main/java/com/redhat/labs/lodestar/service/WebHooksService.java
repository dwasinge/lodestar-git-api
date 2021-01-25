package com.redhat.labs.lodestar.service;


import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.vertx.mutiny.core.Vertx;
import io.vertx.mutiny.ext.web.client.WebClient;


@ApplicationScoped
public class WebHooksService {

    private static final String NOTIFICATION_TOKEN_HEADER = "x-notification-token";
    
    private WebClient webClient;

    @ConfigProperty(name = "notification.token")
    String notificationToken;
    
    @ConfigProperty(name = "webhooks")
    List<String> webhooksList;
    
    @Inject
    Vertx vertx;

    public WebHooksService() {
        WebClient.create(vertx);
    }
    
    public void callConfiguredWebhooks() {

        webhooksList.stream().forEach(hook -> {

            

        });



    }

}
