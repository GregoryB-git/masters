// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.b;
import m6.f;

public abstract class n extends r implements f
{
    public n(final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, n);
    }
    
    @Override
    public b computeReflected() {
        return v.d(this);
    }
    
    @Override
    public Object invoke() {
        return this.get();
    }
}
