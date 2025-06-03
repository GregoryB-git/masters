// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import g6.p;
import kotlin.jvm.internal.Intrinsics;

public abstract class a implements b
{
    public final c o;
    
    public a(final c o) {
        Intrinsics.checkNotNullParameter(o, "key");
        this.o = o;
    }
    
    @Override
    public b b(final c c) {
        return b.a.b((g.b)this, c);
    }
    
    @Override
    public c getKey() {
        return this.o;
    }
    
    @Override
    public g k(final g g) {
        return b.a.d((g.b)this, g);
    }
    
    @Override
    public Object u(final Object o, final p p2) {
        return b.a.a((g.b)this, o, p2);
    }
    
    @Override
    public g x(final c c) {
        return b.a.c((g.b)this, c);
    }
}
