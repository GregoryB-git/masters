/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.qb
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.mb;
import com.yandex.metrica.impl.ob.nb;
import com.yandex.metrica.impl.ob.qb;
import com.yandex.metrica.impl.ob.sb;
import org.json.JSONException;
import org.json.JSONObject;

class lh {
    @NonNull
    private final qb a;
    @NonNull
    private final Context b;
    @Nullable
    private String c;
    @Nullable
    private String d;
    private boolean e = false;
    @NonNull
    private ci f;

    public lh(@NonNull Context context, @NonNull ci ci2) {
        this(context, ci2, F0.g().r());
    }

    @VisibleForTesting
    public lh(@NonNull Context context, @NonNull ci ci2, @NonNull qb qb2) {
        this.b = context;
        this.f = ci2;
        this.a = qb2;
    }

    private void a(@NonNull JSONObject jSONObject, @NonNull String string, @Nullable String string2) throws JSONException {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            jSONObject.put(string, (Object)string2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public String a() {
        JSONObject jSONObject = new JSONObject();
        if (!this.e) {
            Object object = this.a.a(this.b);
            Object object2 = ((sb)object).a();
            boolean bl = ((nb)object2).a();
            Object var3_6 = null;
            object2 = bl && (object2 = ((nb)object2).a) != null ? ((mb)object2).b : null;
            this.c = object2;
            object = ((sb)object).b();
            object2 = var3_6;
            if (((nb)object).a()) {
                object = ((nb)object).a;
                object2 = var3_6;
                if (object != null) {
                    object2 = ((mb)object).b;
                }
            }
            this.d = object2;
            this.e = true;
        }
        try {
            this.a(jSONObject, "uuid", this.f.V());
            this.a(jSONObject, "device_id", this.f.i());
            this.a(jSONObject, "google_aid", this.c);
            this.a(jSONObject, "huawei_aid", this.d);
        }
        catch (Throwable throwable) {
            return jSONObject.toString();
        }
        return jSONObject.toString();
    }

    public void a(@NonNull ci ci2) {
        this.f = ci2;
    }
}

