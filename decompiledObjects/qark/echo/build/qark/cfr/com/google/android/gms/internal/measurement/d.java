/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d {
    public e a;
    public e b;
    public List c;

    public d() {
        this.a = new e("", 0L, null);
        this.b = new e("", 0L, null);
        this.c = new ArrayList();
    }

    public d(e e8) {
        this.a = e8;
        this.b = (e)e8.clone();
        this.c = new ArrayList();
    }

    public final e a() {
        return this.a;
    }

    public final void b(e e8) {
        this.a = e8;
        this.b = (e)e8.clone();
        this.c.clear();
    }

    public final void c(String string2, long l8, Map map) {
        HashMap hashMap = new HashMap();
        for (String string3 : map.keySet()) {
            hashMap.put((Object)string3, e.c(string3, this.a.b(string3), map.get((Object)string3)));
        }
        this.c.add((Object)new e(string2, l8, (Map)hashMap));
    }

    public final /* synthetic */ Object clone() {
        d d8 = new d((e)this.a.clone());
        for (e e8 : this.c) {
            d8.c.add((Object)((e)e8.clone()));
        }
        return d8;
    }

    public final e d() {
        return this.b;
    }

    public final void e(e e8) {
        this.b = e8;
    }

    public final List f() {
        return this.c;
    }
}

