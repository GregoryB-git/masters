// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

class ReflectiveGenericLifecycleObserver implements f
{
    public final Object o;
    public final a.a p;
    
    public ReflectiveGenericLifecycleObserver(final Object o) {
        this.o = o;
        this.p = a.c.c(o.getClass());
    }
    
    @Override
    public void a(final h h, final d.b b) {
        this.p.a(h, b, this.o);
    }
}
