/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Sj
 *  com.yandex.metrica.impl.ob.V8
 *  com.yandex.metrica.impl.ob.tk
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.LinkedList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Sj;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.tk;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Xj {
    @NonNull
    private final LinkedList<JSONObject> a = new LinkedList();
    @NonNull
    private final V8 b;
    @NonNull
    private final LinkedList<String> c = new LinkedList();
    @NonNull
    private final tk d;
    private int e;

    public Xj(int n2, @NonNull V8 v82) {
        this(n2, v82, (tk)new Sj());
    }

    @VisibleForTesting
    public Xj(int n2, @NonNull V8 v82, @NonNull tk tk2) {
        this.e = n2;
        this.b = v82;
        this.d = tk2;
        this.a(v82);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(@NonNull V8 v82) {
        v82 = v82.h();
        int n2 = Math.max((int)0, (int)(v82.size() - this.e));
        while (n2 < v82.size()) {
            String string = (String)v82.get(n2);
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.a.addLast((Object)jSONObject);
                this.c.addLast((Object)string);
            }
            catch (Throwable throwable) {}
            ++n2;
        }
        return;
    }

    @NonNull
    public JSONObject a() {
        return this.d.a((Object)new JSONArray(this.a));
    }

    public void a(@NonNull JSONObject jSONObject) {
        String string;
        if (this.a.size() == this.e) {
            string = (JSONObject)this.a.removeLast();
            this.c.removeLast();
        }
        string = jSONObject.toString();
        this.a.addFirst((Object)jSONObject);
        this.c.addFirst((Object)string);
        if (!this.c.isEmpty()) {
            this.b.a(this.c);
        }
    }

    @NonNull
    public List<JSONObject> b() {
        return this.a;
    }
}

