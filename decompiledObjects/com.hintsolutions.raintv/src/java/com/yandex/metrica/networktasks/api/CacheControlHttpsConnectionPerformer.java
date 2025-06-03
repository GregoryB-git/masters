/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  javax.net.ssl.SSLSocketFactory
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.network.Response;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer$Client;
import com.yandex.metrica.networktasks.api.a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

public class CacheControlHttpsConnectionPerformer {
    private final a a;
    private final SSLSocketFactory b;

    public CacheControlHttpsConnectionPerformer(a a2, SSLSocketFactory sSLSocketFactory) {
        this.a = a2;
        this.b = sSLSocketFactory;
    }

    public CacheControlHttpsConnectionPerformer(SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void performConnection(String string, CacheControlHttpsConnectionPerformer$Client cacheControlHttpsConnectionPerformer$Client) {
        boolean bl;
        block6: {
            bl = false;
            try {
                Response response;
                block8: {
                    block7: {
                        String string2;
                        response = this.a.a(cacheControlHttpsConnectionPerformer$Client.getOldETag(), string, this.b);
                        int n7 = response.getCode();
                        if (n7 != 200) {
                            if (n7 != 304) break block6;
                            cacheControlHttpsConnectionPerformer$Client.onNotModified();
                            return;
                        }
                        string = (List)response.getHeaders().get((Object)"ETag");
                        if (string == null || string.size() <= 0) break block7;
                        string = string2 = (String)string.get(0);
                        if (string2 != null) break block8;
                    }
                    string = "";
                }
                cacheControlHttpsConnectionPerformer$Client.onResponse(string, response.getResponseData());
                return;
            }
            catch (Throwable throwable) {}
        }
        if (bl) return;
        cacheControlHttpsConnectionPerformer$Client.onError();
    }
}

