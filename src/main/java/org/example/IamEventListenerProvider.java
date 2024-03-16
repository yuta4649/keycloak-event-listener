package org.example;

import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.events.Event;

public class IamEventListenerProvider implements EventListenerProvider {

    @Override
    public void onEvent(Event event) {
        // イベント発生時の処理を記述する
        System.out.println("Received event: " + event.getType());
    }

    @Override
    public void close() {
        // リソースのクリーンアップなどの処理を行う
    }

    public static class Factory implements EventListenerProviderFactory {
        @Override
        public EventListenerProvider create() {
            return new CustomEventListenerProvider();
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
    }
}
