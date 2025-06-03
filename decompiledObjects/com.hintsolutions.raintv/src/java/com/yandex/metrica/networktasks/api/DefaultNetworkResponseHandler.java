/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.api.DefaultResponseParser$Response;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;

public class DefaultNetworkResponseHandler
implements NetworkResponseHandler {
    private final DefaultResponseParser a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    public DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.a = defaultResponseParser;
    }

    @Override
    public DefaultResponseParser$Response handle(ResponseDataHolder object) {
        object = 200 == ((ResponseDataHolder)object).getResponseCode() ? this.a.parse(((ResponseDataHolder)object).getResponseData()) : null;
        return object;
    }
}

