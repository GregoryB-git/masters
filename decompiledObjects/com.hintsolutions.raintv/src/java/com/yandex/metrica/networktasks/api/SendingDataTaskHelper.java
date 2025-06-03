/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.System
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.Compressor;
import com.yandex.metrica.networktasks.api.DefaultResponseParser$Response;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.impl.h;
import java.io.IOException;

public class SendingDataTaskHelper {
    private final RequestBodyEncrypter a;
    private final Compressor b;
    private final h c;
    private final RequestDataHolder d;
    private final ResponseDataHolder e;
    private final NetworkResponseHandler f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new h(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, h h5, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler networkResponseHandler) {
        this.a = requestBodyEncrypter;
        this.b = compressor;
        this.c = h5;
        this.d = requestDataHolder;
        this.e = responseDataHolder;
        this.f = networkResponseHandler;
    }

    public boolean isResponseValid() {
        DefaultResponseParser$Response defaultResponseParser$Response = (DefaultResponseParser$Response)this.f.handle(this.e);
        boolean bl = defaultResponseParser$Response != null && "accepted".equals((Object)defaultResponseParser$Response.mStatus);
        return bl;
    }

    public void onPerformRequest() {
        RequestDataHolder requestDataHolder = this.d;
        this.c.getClass();
        requestDataHolder.applySendTime(System.currentTimeMillis());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean prepareAndSetPostData(byte[] byArray) {
        boolean bl;
        boolean bl2 = false;
        try {
            byArray = this.b.compress(byArray);
            bl = bl2;
            if (byArray == null) return bl;
        }
        catch (IOException iOException) {
            return bl2;
        }
        byArray = this.a.encrypt(byArray);
        bl = bl2;
        if (byArray == null) return bl;
        this.d.setPostData(byArray);
        return true;
    }
}

