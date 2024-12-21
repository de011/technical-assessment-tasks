package com.assessment.task.utility;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ProductPriceHandler extends TextWebSocketHandler {
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        String productId = session.getUri().getPath().split("/")[3];
        // Simulate price update
        double realTimePrice = 95.0; // Example price update
        TextMessage priceUpdateMessage = new TextMessage("{\"product_id\": " + productId + ", \"real_time_price\": " + realTimePrice + "}");
        try {
            session.sendMessage(priceUpdateMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
