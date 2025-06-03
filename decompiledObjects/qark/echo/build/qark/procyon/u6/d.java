// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import g6.p;

public abstract class d
{
    public static final F a;
    
    static {
        a = new F("CLOSED");
    }
    
    public static final /* synthetic */ F a() {
        return d.a;
    }
    
    public static final e b(e e) {
        while (true) {
            final Object a = e.a(e);
            if (a == a()) {
                return e;
            }
            final e e2 = (e)a;
            if (e2 == null) {
                if (e.j()) {
                    return e;
                }
                continue;
            }
            else {
                e = e2;
            }
        }
    }
    
    public static final Object c(C c, final long n, final p p3) {
        C c2 = c;
        while (c2.q < n || c2.h()) {
            final Object a = e.a(c2);
            if (a == a()) {
                return D.a(d.a);
            }
            c = (C)a;
            if (c == null) {
                final C c3 = (C)p3.invoke(c2.q + 1L, c2);
                if (!c2.l(c3)) {
                    continue;
                }
                c = c3;
                if (c2.h()) {
                    c2.k();
                    c = c3;
                }
            }
            c2 = c;
        }
        return D.a(c2);
    }
}
