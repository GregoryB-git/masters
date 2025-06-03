// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends y
{
    public static final AtomicReferenceFieldUpdater a;
    private volatile Object _consensus;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    }
    
    public b() {
        this._consensus = u6.a.a;
    }
    
    @Override
    public final Object a(final Object o) {
        Object o2;
        if ((o2 = b.a.get(this)) == u6.a.a) {
            o2 = this.c(this.d(o));
        }
        this.b(o, o2);
        return o2;
    }
    
    public abstract void b(final Object p0, final Object p1);
    
    public final Object c(final Object o) {
        final AtomicReferenceFieldUpdater a = b.a;
        final Object value = a.get(this);
        final Object a2 = u6.a.a;
        if (value != a2) {
            return value;
        }
        if (u.b.a(a, this, a2, o)) {
            return o;
        }
        return a.get(this);
    }
    
    public abstract Object d(final Object p0);
}
