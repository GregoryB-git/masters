// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class E
{
    public Map a;
    public U b;
    
    public E() {
        this.a = new HashMap();
        this.b = new U();
        this.b(new y());
        this.b(new D());
        this.b(new F());
        this.b(new J());
        this.b(new L());
        this.b(new S());
        this.b(new X());
    }
    
    public final s a(final f3 f3, final s s) {
        C2.b(f3);
        if (s instanceof v) {
            final v v = (v)s;
            final ArrayList b = v.b();
            final String a = v.a();
            A b2;
            if (this.a.containsKey(a)) {
                b2 = this.a.get(a);
            }
            else {
                b2 = this.b;
            }
            return b2.b(a, f3, b);
        }
        return s;
    }
    
    public final void b(final A a) {
        final Iterator<Z> iterator = a.a.iterator();
        while (iterator.hasNext()) {
            this.a.put(iterator.next().toString(), a);
        }
    }
}
