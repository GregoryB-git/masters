/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.net.Socket
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.nh;
import com.yandex.metrica.impl.ob.th;
import com.yandex.metrica.impl.ob.uh;
import com.yandex.metrica.impl.ob.wh;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class qh
extends nh {
    public qh(@NonNull Socket socket, @NonNull Uri uri, @NonNull th th2, @NonNull Qh qh2, @NonNull uh uh2) {
        super(socket, uri, th2, qh2, uh2);
    }

    @Override
    public void a() {
        Object object3;
        Object object2 = this.d.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (Object object3 : object2) {
            hashMap.put(object3, (Object)this.d.getQueryParameter((String)object3));
        }
        hashMap.remove((Object)"t");
        this.a("HTTP/1.1 200 OK", (Map<String, String>)new HashMap(), new byte[0]);
        object2 = this.b;
        int n2 = this.a.getLocalPort();
        object3 = this.e;
        ((wh)object2).a((Map<String, Object>)hashMap, n2, (uh)object3);
    }
}

