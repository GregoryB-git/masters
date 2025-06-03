/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Log
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.yf$e$b
 *  com.yandex.metrica.impl.ob.yf$e$b$a
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.yf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class Yg {
    private static final Map<yf.e.b.a, String> a = Collections.unmodifiableMap((Map)new HashMap<yf.e.b.a, String>(){
        {
            this.put(yf.e.b.a.c, "complete");
            this.put(yf.e.b.a.d, "error");
            this.put(yf.e.b.a.a, "offline");
            this.put(yf.e.b.a.b, "incompatible_network_type");
        }
    });
    private static final Map<H1.d, String> b = Collections.unmodifiableMap((Map)new HashMap<H1.d, String>(){
        {
            this.put((Object)H1.d.a, "wifi");
            this.put((Object)H1.d.b, "cell");
            this.put((Object)H1.d.m, "offline");
            this.put((Object)H1.d.n, "undefined");
        }
    });

    @Nullable
    private JSONObject a(@Nullable Map<String, List<String>> jSONObject) throws JSONException {
        if (!A2.b(jSONObject)) {
            JSONObject jSONObject2 = new JSONObject();
            Iterator iterator = jSONObject.entrySet().iterator();
            while (true) {
                jSONObject = jSONObject2;
                if (iterator.hasNext()) {
                    jSONObject = (Map.Entry)iterator.next();
                    String string = (String)jSONObject.getKey();
                    if (A2.b((Collection)jSONObject.getValue())) continue;
                    List list = (List)jSONObject.getValue();
                    jSONObject = list;
                    if (list.size() > 10) {
                        jSONObject = new ArrayList(10);
                        for (int i6 = 0; i6 < 10; ++i6) {
                            jSONObject.add(list.get(i6));
                        }
                    }
                    list = new ArrayList();
                    for (String string2 : jSONObject) {
                        if (TextUtils.isEmpty((CharSequence)string2)) continue;
                        list.add((Object)A2.a(string2, 100));
                    }
                    jSONObject2.putOpt(string, (Object)TextUtils.join((CharSequence)",", (Iterable)list));
                    continue;
                }
                break;
            }
        } else {
            jSONObject = null;
        }
        return jSONObject;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(@NonNull yf.e.b object) {
        try {
            void var3_9;
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("id", (Object)object.d().a);
            jSONObject.putOpt("url", (Object)object.d().b);
            jSONObject.putOpt("status", a.get((Object)object.h()));
            jSONObject.putOpt("code", (Object)object.f());
            boolean bl = A2.a(object.e());
            if (!bl) {
                jSONObject.putOpt("body", (Object)Base64.encodeToString((byte[])object.e(), (int)0));
            } else if (!A2.a(object.b())) {
                jSONObject.putOpt("body", (Object)Base64.encodeToString((byte[])object.b(), (int)0));
            }
            jSONObject.putOpt("headers", (Object)this.a((Map<String, List<String>>)object.g()));
            Throwable throwable = object.c();
            if (throwable != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(throwable.toString());
                stringBuilder.append("\n");
                stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
                String string = stringBuilder.toString();
            } else {
                Object var3_8 = null;
            }
            jSONObject.putOpt("error", (Object)var3_9);
            jSONObject.putOpt("network_type", b.get((Object)object.a()));
            return jSONObject.toString();
        }
        catch (Throwable throwable) {
            return throwable.toString();
        }
    }
}

