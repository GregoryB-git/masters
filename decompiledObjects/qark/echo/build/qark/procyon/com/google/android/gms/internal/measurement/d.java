// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public final class d
{
    public e a;
    public e b;
    public List c;
    
    public d() {
        this.a = new e("", 0L, null);
        this.b = new e("", 0L, null);
        this.c = new ArrayList();
    }
    
    public d(final e a) {
        this.a = a;
        this.b = (e)a.clone();
        this.c = new ArrayList();
    }
    
    public final e a() {
        return this.a;
    }
    
    public final void b(final e a) {
        this.a = a;
        this.b = (e)a.clone();
        this.c.clear();
    }
    
    public final void c(final String s, final long n, final Map map) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final String s2 : map.keySet()) {
            hashMap.put(s2, e.c(s2, this.a.b(s2), map.get(s2)));
        }
        this.c.add(new e(s, n, hashMap));
    }
    
    public final e d() {
        return this.b;
    }
    
    public final void e(final e b) {
        this.b = b;
    }
    
    public final List f() {
        return this.c;
    }
}
