// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a6;

import W5.g;
import kotlin.jvm.internal.Intrinsics;
import java.io.Serializable;

public final class c extends W5.c implements a, Serializable
{
    public final Enum[] p;
    
    public c(final Enum[] p) {
        Intrinsics.checkNotNullParameter(p, "entries");
        this.p = p;
    }
    
    private final Object writeReplace() {
        return new a6.d(this.p);
    }
    
    @Override
    public int a() {
        return this.p.length;
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Enum && this.d((Enum)o);
    }
    
    public boolean d(final Enum enum1) {
        Intrinsics.checkNotNullParameter(enum1, "element");
        return g.l(this.p, enum1.ordinal()) == enum1;
    }
    
    public Enum f(final int n) {
        W5.c.o.a(n, this.p.length);
        return this.p[n];
    }
    
    public int g(final Enum enum1) {
        Intrinsics.checkNotNullParameter(enum1, "element");
        final int ordinal = enum1.ordinal();
        if (g.l(this.p, ordinal) == enum1) {
            return ordinal;
        }
        return -1;
    }
    
    public int i(final Enum enum1) {
        Intrinsics.checkNotNullParameter(enum1, "element");
        return this.indexOf(enum1);
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof Enum)) {
            return -1;
        }
        return this.g((Enum)o);
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof Enum)) {
            return -1;
        }
        return this.i((Enum)o);
    }
}
