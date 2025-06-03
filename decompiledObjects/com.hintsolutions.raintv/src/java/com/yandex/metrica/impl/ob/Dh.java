/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.lm;
import com.yandex.metrica.impl.ob.nh;
import com.yandex.metrica.impl.ob.th;
import com.yandex.metrica.impl.ob.uh;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

class dh
extends nh {
    @NonNull
    private final String f;

    public dh(@NonNull Socket socket, @NonNull Uri uri, @NonNull th th2, @NonNull Qh qh2, @NonNull String string, @NonNull uh uh2) {
        super(socket, uri, th2, qh2, uh2);
        this.f = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        try {
            lm lm2 = new lm();
            byte[] byArray = Base64.encode((byte[])lm2.a(this.f.getBytes()), (int)0);
            HashMap<String, String> hashMap = new HashMap<String, String>(this, byArray){
                public final byte[] a;
                {
                    this.a = byArray;
                    this.put("Content-Type", "text/plain; charset=utf-8");
                    this.put("Access-Control-Allow-Origin", "*");
                    this.put("Access-Control-Allow-Methods", "GET");
                    this.put("Content-Length", String.valueOf((int)byArray.length));
                }
            };
            this.a("HTTP/1.1 200 OK", (Map<String, String>)hashMap, byArray);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

