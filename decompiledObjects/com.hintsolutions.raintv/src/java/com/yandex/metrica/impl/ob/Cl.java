/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Qk;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.nk;
import com.yandex.metrica.impl.ob.tk;
import com.yandex.metrica.impl.ob.vk;
import com.yandex.metrica.impl.ob.wk;
import com.yandex.metrica.impl.ob.xk;
import org.json.JSONObject;

public class cl {
    @NonNull
    private final xk a;
    @NonNull
    private final vk b;
    @NonNull
    private final wk c;
    @NonNull
    private final tk d;
    @NonNull
    private final String e;

    public cl(@NonNull xk xk2, @NonNull vk vk2, @NonNull wk wk2, @NonNull tk tk2, @NonNull String string) {
        this.a = xk2;
        this.b = vk2;
        this.c = wk2;
        this.d = tk2;
        this.e = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public JSONObject a(@NonNull Activity activity, @NonNull Qk object, @NonNull Uk uk2, @NonNull nk nk2, long l5) {
        activity = this.a.a(activity, l5);
        try {
            wk wk2 = this.c;
            Object object2 = new JSONObject();
            wk2.a((JSONObject)activity, object2, this.e);
            object2 = this.d;
            wk2 = new JSONObject();
            int n4 = object2.a(wk2).toString().getBytes().length;
            int n5 = activity.toString().getBytes().length;
            object = this.b.a((Qk)object, uk2, nk2, n5 + (n4 - 2) - 2);
            this.c.a((JSONObject)activity, object, this.e);
            return activity;
        }
        catch (Throwable throwable) {
            return activity;
        }
    }
}

