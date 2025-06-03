/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.jh;
import com.yandex.metrica.impl.ob.x2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class kh {
    @NonNull
    private final x2 a;
    @NonNull
    private final jh b;

    public kh(@NonNull jh jh2) {
        this(jh2, new x2());
    }

    @VisibleForTesting
    public kh(@NonNull jh jh2, @NonNull x2 x22) {
        this.b = jh2;
        this.a = x22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String string = this.b.a();
        JSONObject jSONObject2 = jSONObject;
        if (TextUtils.isEmpty((CharSequence)string)) return jSONObject2;
        try {
            return new JSONObject(string);
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }

    public long a(int n4) {
        return this.a().optLong(String.valueOf((int)n4));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n4, long l5) {
        JSONObject jSONObject = this.a();
        try {
            jSONObject.put(String.valueOf((int)n4), l5);
        }
        catch (Throwable throwable) {}
        this.b.a(jSONObject.toString());
    }

    public void a(long l5) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.a();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            long l8 = jSONObject.optLong(string);
            if (!this.a.b(l8, l5, z2.o("last socket open on ", string))) continue;
            arrayList.add((Object)string);
        }
        if (!arrayList.isEmpty()) {
            arrayList = arrayList.iterator();
            while (arrayList.hasNext()) {
                jSONObject.remove((String)arrayList.next());
            }
            this.b.a(jSONObject.toString());
        }
    }
}

