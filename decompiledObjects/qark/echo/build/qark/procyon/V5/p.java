// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import g6.a;
import java.io.Serializable;

public final class p implements h, Serializable
{
    public a o;
    public volatile Object p;
    public final Object q;
    
    public p(final a o, final Object o2) {
        Intrinsics.checkNotNullParameter(o, "initializer");
        this.o = o;
        this.p = r.a;
        Object q = o2;
        if (o2 == null) {
            q = this;
        }
        this.q = q;
    }
    
    private final Object writeReplace() {
        return new d(this.getValue());
    }
    
    public boolean a() {
        return this.p != r.a;
    }
    
    @Override
    public Object getValue() {
        final Object p = this.p;
        final r a = r.a;
        if (p != a) {
            return p;
        }
        synchronized (this.q) {
            Object p2 = this.p;
            if (p2 == a) {
                final a o = this.o;
                Intrinsics.b(o);
                p2 = o.invoke();
                this.p = p2;
                this.o = null;
            }
            return p2;
        }
    }
    
    @Override
    public String toString() {
        if (this.a()) {
            return String.valueOf(this.getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
