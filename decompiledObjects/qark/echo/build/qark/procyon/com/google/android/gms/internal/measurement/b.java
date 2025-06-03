// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.TreeMap;

public final class b
{
    public final TreeMap a;
    public final TreeMap b;
    
    public b() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
    
    public static int a(final f3 f3, final t t, final s o) {
        final s b = t.b(f3, Collections.singletonList(o));
        if (b instanceof k) {
            return C2.i(b.f());
        }
        return -1;
    }
    
    public final void b(final f3 f3, final d d) {
        final X5 x5 = new X5(d);
        for (final Integer key : this.a.keySet()) {
            final e e = (e)d.d().clone();
            final int a = a(f3, this.a.get(key), x5);
            if (a == 2 || a == -1) {
                d.e(e);
            }
        }
        final Iterator<Integer> iterator2 = this.b.keySet().iterator();
        while (iterator2.hasNext()) {
            a(f3, (t)this.b.get(iterator2.next()), x5);
        }
    }
    
    public final void c(final String s, final int i, final t value, final String str) {
        TreeMap treeMap;
        if ("create".equals(str)) {
            treeMap = this.b;
        }
        else {
            if (!"edit".equals(str)) {
                final StringBuilder sb = new StringBuilder("Unknown callback type: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            treeMap = this.a;
        }
        int j = i;
        if (treeMap.containsKey(i)) {
            j = treeMap.lastKey() + 1;
        }
        treeMap.put(j, value);
    }
}
