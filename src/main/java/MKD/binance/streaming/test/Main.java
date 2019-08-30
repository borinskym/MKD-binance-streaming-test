package MKD.binance.streaming.test;

import com.binance.api.client.BinanceApiWebSocketClient;
import com.binance.api.client.impl.BinanceApiWebSocketClientImpl;
import okhttp3.OkHttpClient;

public class Main {

    public static void main(String[] args) {
        String symbol = args[0];
        BinanceApiWebSocketClient binanceApiWebSocketClient = new BinanceApiWebSocketClientImpl(new OkHttpClient());

        binanceApiWebSocketClient.onAggTradeEvent("bnbbtc",
                aggTradeEvent -> System.out.println(String.format("new agg trade event %s", aggTradeEvent)));


//        binanceApiWebSocketClient.onAllMarketTickersEvent(new BinanceApiCallback<List<AllMarketTickersEvent>>() {
//            @Override
//            public void onResponse(List<AllMarketTickersEvent> allMarketTickersEvents) {
//                System.out.println(String.format("new market ticker events: %s", new Gson().toJson(allMarketTickersEvents)));
//            }
//        });


        while (true) {
        }
    }


}
