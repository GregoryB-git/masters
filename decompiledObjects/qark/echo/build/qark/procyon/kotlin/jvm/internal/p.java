// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.b;
import m6.g;

public abstract class p extends r implements g
{
    public p(final Class clazz, final String s, final String s2, final int n) {
        super(c.NO_RECEIVER, clazz, s, s2, n);
    }
    
    @Override
    public b computeReflected() {
        return v.e(this);
    }
    
    @Override
    public g.a e() {
        ((g)this.b()).e();
        return null;
    }
    
    @Override
    public Object invoke(final Object o, final Object o2) {
        return this.f(o, o2);
    }
}
