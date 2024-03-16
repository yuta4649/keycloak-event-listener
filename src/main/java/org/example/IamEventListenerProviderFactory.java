package org.example;

import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.ArrayList;
import java.util.List;

public class IamEventListenerProviderFactory implements EventListenerProviderFactory {

    @Override
    public EventListenerProvider create() {
        return new IamEventListenerProvider();
    }

    @Override
    public void init(Config.Scope config) {
        // 任意の初期化処理を行う
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
        // 任意の後処理を行う
    }

    @Override
    public void close() {
        // 任意のクリーンアップ処理を行う
    }

    @Override
    public String getId() {
        return "iam-event-listener";
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return new ArrayList<ProviderConfigProperty>();
    }
}
