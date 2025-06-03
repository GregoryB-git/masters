// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import u.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class r
{
    public static final AtomicReferenceFieldUpdater a;
    private volatile Object _cur;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    }
    
    public r(final boolean b) {
        this._cur = new s(8, b);
    }
    
    public final boolean a(final Object o) {
        final AtomicReferenceFieldUpdater a = r.a;
        while (true) {
            final s s = a.get(this);
            final int a2 = s.a(o);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    continue;
                }
                return false;
            }
            else {
                b.a(r.a, this, s, s.i());
            }
        }
    }
    
    public final void b() {
        final AtomicReferenceFieldUpdater a = r.a;
        while (true) {
            final s s = a.get(this);
            if (s.d()) {
                break;
            }
            b.a(r.a, this, s, s.i());
        }
    }
    
    public final int c() {
        return r.a.get(this).f();
    }
    
    public final Object d() {
        final AtomicReferenceFieldUpdater a = r.a;
        Object j;
        while (true) {
            final s s = a.get(this);
            j = s.j();
            if (j != u6.s.h) {
                break;
            }
            b.a(r.a, this, s, s.i());
        }
        return j;
    }
}
