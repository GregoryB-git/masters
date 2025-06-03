// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l2;

import h2.d;
import m2.f;
import U5.a;
import h2.b;

public final class g implements b
{
    public final a a;
    
    public g(final a a) {
        this.a = a;
    }
    
    public static f a(final p2.a a) {
        return (f)d.c(l2.f.a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
    
    public static g b(final a a) {
        return new g(a);
    }
    
    public f c() {
        return a((p2.a)this.a.get());
    }
}
