// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class F1
{
    public final E a;
    public final f3 b;
    public final f3 c;
    public final X4 d;
    
    public F1() {
        final E a = new E();
        this.a = a;
        final f3 c = new f3(null, a);
        this.c = c;
        this.b = c.d();
        final X4 d = new X4();
        this.d = d;
        c.h("require", new X7(d));
        d.b("internal.platform", d1.o);
        c.h("runtime.counter", new k(0.0));
    }
    
    public final s a(final f3 f3, final r2... array) {
        s s = com.google.android.gms.internal.measurement.s.d;
        for (int length = array.length, i = 0; i < length; ++i) {
            s = b4.a(array[i]);
            C2.b(this.c);
            if (s instanceof v || s instanceof t) {
                s = this.a.a(f3, s);
            }
        }
        return s;
    }
    
    public final void b(final String s, final Callable callable) {
        this.d.b(s, callable);
    }
}
